import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        
        int result = 0;
    
        for(int i=0;i<d.length;i++){
        int cost = d[i];
        if(cost>budget){
            break;
        }
        budget-=cost;
        result++;
    }
        return result;
    }
}