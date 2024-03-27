class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for (char c : s.toCharArray()) {
            if (c >= 'A' && c <= 'Z') { 
                if (c + n > 'Z') {
                    char cc = (char)(c + n - 'Z' + 'A' - 1);
                    answer += cc;
                } else {
                    char cc = (char)(c + n);
                    answer += cc;
                }
            } else if (c >= 'a' && c <= 'z') { 
                if (c + n > 'z') {
                    char cc = (char)(c + n - 'z' + 'a' - 1);
                    answer += cc;
                } else {
                    char cc = (char)(c + n);
                    answer += cc;
                }
            } else if (c == ' ') {
                char cc = ' ';
                answer += cc;
            }
        }
        return answer;
    }
}