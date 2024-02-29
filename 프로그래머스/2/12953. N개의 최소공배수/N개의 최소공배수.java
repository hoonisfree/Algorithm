import java.util.ArrayList;

public class Solution {
    public int solution(int[] arr) {
        int lcm = arr[0]; // 반복문을 쉽게 하기위해 초기값을 배열의 첫 번째 원소로 설정

        // 최소공배수를 구하는 함수를 사용하여 각 숫자의 최소공배수를 계산
        for (int i = 1; i < arr.length; i++) {
            int num = arr[i];
            lcm = findLCM(lcm, num); 
//lcm은 현재까지 구해진 최소공배수를 나타내고, 두 번째 매개변수 num은 배열에서 가져온 현재 처리 중인 수를 나타냄
        }

        return lcm;
    }

    // 최대공약수를 구하는 함수
    //(num2:num과num1의 최소공배수를 계산하여 저장하는 변수)
    public int findGCD(int num1, int num2) {
   
        ArrayList<Integer> factors1 = primeFactorization(num1);
        ArrayList<Integer> factors2 = primeFactorization(num2);

        // 두 수의 공통된 소수를 찾아서 최대공약수를 구함
        ArrayList<Integer> commonFactors = new ArrayList<>();
        for (int factor : factors1) {
            if (factors2.contains(factor)) {
                commonFactors.add(factor);
                factors2.remove(Integer.valueOf(factor)); // 중복 제거를 위해 제거
            }
        }

        // 공통된 소수의 곱이 최대공약수
        int gcd = 1;
        for (int factor : commonFactors) {
            gcd *= factor;
        }
        return gcd;
    }

    // 최소공배수를 구하는 함수
    public int findLCM(int num1, int num2) {
        int gcd = findGCD(num1, num2);
        return (num1 * num2) / gcd;
    }

    // 소인수분해 함수 
    //prime-소인수분해 함수를 호출하여 각 숫자의 소인수를 찾아내는 데 사용되는 변수
    public ArrayList<Integer> primeFactorization(int num) {
        ArrayList<Integer> factors = new ArrayList<>();
        int factor = 2;
        while (num > 1) {
            if (num % factor == 0) {
                factors.add(factor);
                num /= factor;
            } else {
                factor++; //다음소수로가기위해 변수 증가 시킴
            }
        }
        return factors;
    }
}