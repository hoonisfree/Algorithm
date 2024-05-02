import java.time.DayOfWeek;
import java.time.LocalDate;

class Solution {
    public String solution(int a, int b) {
        
        LocalDate date = LocalDate.of(2016, a, b);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        String[] day = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        return day[dayOfWeek.getValue() - 1];
    }
}
//         LocalDate date = LocalDate.of(2016, a, b);
//         DayOfWeek dayOfWeek = date.getDayOfWeek();
//         String answer = "";
        
//         switch (dayOfWeek) {
//             case FRIDAY:
//                 answer = "FRI";
//                 break;
//             case SATURDAY:
//                 answer = "SAT";
//                 break;
//             case SUNDAY:
//                 answer = "SUN";
//                 break;
//             case MONDAY:
//                 answer = "MON";
//                 break;
//             case TUESDAY:
//                 answer = "TUE";
//                 break;
//             case WEDNESDAY:
//                 answer = "WED";
//                 break;
//             case THURSDAY:
//                 answer = "THU";
//                 break;
//         }
        
//         return answer;
//     }
// }