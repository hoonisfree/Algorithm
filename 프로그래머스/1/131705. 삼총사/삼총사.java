class Solution {
    public int solution(int[] number) {
        return countThree(number, 0, 0, 0);
    }

    public int countThree(int[] number, int sum, int count, int index) {
        if (count == 3) {
            return sum == 0 ? 1 : 0;
        }
        
        if (index >= number.length) {
            return 0;
        }

        int result = 0;
        result += countThree(number, sum + number[index], count + 1, index + 1); // 현재 선택
        result += countThree(number, sum, count, index + 1); // 현재 선택 안할 때

        return result;
    }
}