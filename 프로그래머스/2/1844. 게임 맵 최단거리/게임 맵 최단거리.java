import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int []{0,0,1});
        boolean [][] visited = new boolean[n][m];
        int[][] direction = {{1,0},{-1,0},{0,1},{0,-1}};
        
       while (!queue.isEmpty()) {
            int[] c = queue.poll();
            int row = c[0];
            int col = c[1];
            int count = c[2];
            
        if(row==n-1 && col==m-1){
            return count;
        }
        for(int[] dir : direction){
            int nextRow = row+dir[0];
            int nextCol = col+dir[1];
            
        if(nextRow>=0&& nextRow<n && nextCol>=0 && nextCol<m && maps[nextRow][nextCol]==1 && !visited[nextRow][nextCol]){
            visited[nextRow][nextCol]=true;
            queue.offer(new int[]{nextRow,nextCol,count+1});
            }
        }   
    }
        return -1;
    }
}