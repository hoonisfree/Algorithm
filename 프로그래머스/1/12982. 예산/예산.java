import java.util.Arrays;
class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int cnt = 0;
        while((budget -= d[cnt]) >= 0 && ++cnt < d.length);
        return cnt;
    }
}