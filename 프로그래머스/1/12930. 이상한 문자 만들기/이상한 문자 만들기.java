class Solution {
    public String solution(String s) {
        StringBuilder result = new StringBuilder();
        String[] words = s.split(" ", -1);
        
        for(int i = 0; i < words.length; i++){
            String word = words[i];
            StringBuilder change = new StringBuilder();
            
            for (int j = 0; j < word.length(); j++) {
                char c = word.charAt(j);
                if (j % 2 == 0) {
                    change.append(Character.toUpperCase(c));
                } else {
                    change.append(Character.toLowerCase(c));
                }
            }
            result.append(change);
            
            if (i < words.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}