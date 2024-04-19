class Solution {
    public int solution(int[] numbers, int target) {
        return dfs(numbers,target,0,0);
    }
    public int dfs(int[] numbers, int target, int i, int sum){
        if(i==numbers.length){
            if(sum == target){
                return 1;
            }else{
                return 0;
            }
        }
        int plus = dfs(numbers,target,i+1,sum+numbers[i]);
        int minus = dfs(numbers,target,i+1,sum-numbers[i]);
        
    return plus+minus;
    }
}