import java.util.*;

public class Solution {
    public int solution(int n) {
        int k = 0;
        //역순으로 이동한 거리 계산하기
        //n이 1으로 올 때 까지
        //n을 2로 나누었을 때 나머지가 없으면 순간이동
        //n을 2로 나누었을 때 나머지가 있으면 점프 (사용량1 추가-> ans는 ++ 이동거리 n은 --)
        
        while (n > 0){
            if (n % 2 == 0) {
                n /=2;
            }
            else{
                n--;
                k++;
            }
        }
        return k;
    }
}