public class Solution {
    public int[] solution(int brown, int yellow) {
        int total = brown + yellow;
        for (int width = 1; width < total; width++) {
            if (total % width == 0) {
                int height = total / width;
                if ((width - 2) * (height - 2) == yellow) {
                    return new int[] {Math.max(width, height), Math.min(width, height)};
                }
            }
        }
        return new int[] {0,0};
    }
}