class Solution {
    boolean solution(String s) {
        int pCount = 0;
        int yCount = 0;
        
        // s 문자열을 소문자로 변환하여 p와 y의 개수를 센다.
        s = s.toLowerCase();
        
        for (int i = 0; i < s.length(); i++) {
            char py = s.charAt(i);
            if (py == 'p') {
                pCount++;
            } else if (py == 'y') {
                yCount++;
            }
        }
        
        // 모든 문자를 센 후에 pCount와 yCount를 비교하여 결과를 반환한다.
        return pCount == yCount;
    }
}

