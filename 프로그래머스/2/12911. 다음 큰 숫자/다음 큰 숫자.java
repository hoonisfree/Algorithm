class Solution {
    public int solution(int n) {
        int ncount = countOnes(n); // n의 이진법 표현에서 1의 개수

        int i = n + 1; // n보다 큰 다음 자연수
        while (true) {
            int icount = countOnes(i); // i의 이진법 표현에서 1의 개수

            if (ncount == icount) {
                return i;
            }
            i++;
        }
    }

    // 정수를 이진법으로 변환하여 1의 개수를 세는 메소드
    private int countOnes(int number) {
        int count = 0;
        while (number > 0) {
            if (number % 2 == 1) {
                count++; // 1의 개수 증가
            }
            number /= 2; // 다음 비트로 이동
        }
        return count;
    }
}
