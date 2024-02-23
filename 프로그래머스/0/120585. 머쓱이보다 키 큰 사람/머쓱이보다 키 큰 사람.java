class Solution {
    public int solution(int[] array, int height) {
        int result = 0; // 결과값 변수 초기화
        for (int i = 0; i < array.length; i++) {
            if (array[i] > height) {
                result++; // 키가 머쓱이보다 큰 경우 결과값 증가
            }
        }
        return result;
    }
}
