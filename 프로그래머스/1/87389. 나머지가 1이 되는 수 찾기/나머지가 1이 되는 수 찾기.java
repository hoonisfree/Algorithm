class Solution {
    public int solution(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 1) {
                return i;
            }
        }
        return 0; // 모든 수를 순회했지만 조건을 만족하는 값이 없을 경우 0을 반환
    }
}
