import java.util.ArrayDeque;
import java.util.Queue;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<int[]> queue = new ArrayDeque<>(); 

        for (int i = 0; i < priorities.length; i++) {
            queue.add(new int[]{priorities[i], i});
        }

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            boolean isP = true;

            for (int[] process : queue) {
                if (process[0] > cur[0]) {
                    queue.add(cur);
                    isP = false;
                    break;
                }
            }
            if (isP) {
                answer++;
                if (cur[1] == location) {
                    break;
                }
            }
        }
        return answer;
    }
}