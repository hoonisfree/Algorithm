class Solution {
    public int solution(int[][] sizes) {
        int w = 0;
        int h = 0;
        for (int i = 0; i < sizes.length; i++) {
        int[] answer = sizes[i];
            w=Math.max(w,Math.max(answer[0],answer[1]));
            h=Math.max(h,Math.min(answer[0],answer[1]));
        }
        return  w * h;
    }
}