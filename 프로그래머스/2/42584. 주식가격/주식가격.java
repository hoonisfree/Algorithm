import java.util.*;

class Solution {
    public int[] solution(int[] prices) { 
        int[] answer = new int[prices.length]; // 각 시점에서의 주식가격이 떨어지지 않은 기간을 저장하는 배열로 활용.
        
        Stack<Integer> stack = new Stack<>(); // 주식 가격의 인덱스를 저장하는 스택을 생성. 
        
        for (int i = 0; i < prices.length; i++)  { 
            while (!stack.isEmpty() && prices[stack.peek()] > prices[i]) { //스택이 비어있지 않고, 현재 시점의 주식가격이 스택의 가장 최근에 추가된 주식가격보다 작을 때까지 반복.(주식가격이 떨어진 경우)
                int index = stack.pop(); //스택에서 최근에 추가된 주식가격의 인덱스를 꺼냄
                answer[index] = i - index;
            } //현재 시점과 최근 주식가격이 추가된 시점의 차이를 계산
            stack.push(i); 
        }
        
        while (!stack.isEmpty()) {
            int index = stack.pop();
            answer[index] = prices.length - index - 1; //현재시점 빼주기위해 -1
        }
        
        return answer;
    }
}