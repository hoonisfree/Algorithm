import java.util.*;

class Solution {
    public int solution(String s) {
        Map<String, Integer> s2n = new HashMap<>();
        s2n.put("zero",0);
        s2n.put("one",1);
        s2n.put("two",2);
        s2n.put("three",3);
        s2n.put("four",4);
        s2n.put("five",5);
        s2n.put("six",6);
        s2n.put("seven",7);
        s2n.put("eight",8);
        s2n.put("nine",9);
        
        for(Map.Entry<String, Integer> entry : s2n.entrySet()) {
            s = s.replace(entry.getKey(),entry.getValue().toString());
        }
        return Integer.parseInt(s);
        }
    }