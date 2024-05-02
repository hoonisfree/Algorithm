class Solution {
    public int solution(int number, int limit, int power) {
        int ironWeight = 0; 
        
        for (int i = 1; i <= number; i++) {
            int attackPower = getAttackPower(i, limit, power);
            ironWeight += attackPower;
        }
        
        return ironWeight;
    }
    
    public int getAttackPower(int knightNumber, int limit, int power) {
        int divisorCount = countDivisors(knightNumber);
        int attackPower = divisorCount;
        
        if (attackPower > limit) {
            attackPower = power; 
     
        }
            
        return attackPower;
    }
    
    // public int countDivisors(int num) {
    //     int count = 0;
    //     for (int i = 1; i <= num; i++) {
    //         if (num % i == 0) {
    //             count++;
    //         }
    //     }
    //     return count;
// }
// }
    private int countDivisors(int num) {
    int count = 0;
    int sqrtNum = (int) Math.sqrt(num);
    
    for (int i = 1; i <= sqrtNum; i++) {
        if (num % i == 0) {
        
            count++;
            
            if (i != num / i) {
                count++;
            }
        }
    }
    
    return count;
    }
}