class Solution {
    public String solution(String s) {
        StringBuilder result = new StringBuilder();
        String[] words = s.split(" ", -1);
        
        for(int i = 0; i < words.length; i++){
            String word = words[i];
        
            
            for (int j = 0; j < word.length(); j++) {
                char c = word.charAt(j);
                if (j % 2 == 0) {
                    result.append(Character.toUpperCase(c));
                } else {
                    result.append(Character.toLowerCase(c));
                }
            }
            
            if (i < words.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}