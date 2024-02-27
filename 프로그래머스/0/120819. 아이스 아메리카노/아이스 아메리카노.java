class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        
        // 아이스 아메리카노의 가격
        int americanoPrice = 5500;
        
        // 최대한으로 마실 수 있는 아메리카노의 잔 수 계산
        int maxAmericano = money / americanoPrice;
        
        // 남는 돈 계산
        int remainingMoney = money % americanoPrice;
        
        // 결과 배열에 값 할당
        answer[0] = maxAmericano;
        answer[1] = remainingMoney;
        
        return answer;
    }
}
