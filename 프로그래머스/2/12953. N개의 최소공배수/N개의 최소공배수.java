class Solution {
    public int solution(int[] arr) {
        int lcm = arr[0]; // 초기값을 배열의 첫 번째 원소로 설정
        // 배열의 모든 원소에 대해 최소공배수를 구함
        for (int i = 1; i < arr.length; i++) {
            lcm = getLCM(lcm, arr[i]);
        }
        return lcm;
    }

    // 두 수의 최소공배수를 계산하는 메서드
    private int getLCM(int a, int b) {
        return a * b / getGCD(a, b); // 최소공배수 = 두 수의 곱 / 최대공약수
    }

    // 두 수의 최대공약수를 계산하는 메서드 (유클리드 호제법 사용)
    private int getGCD(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}