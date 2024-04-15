package onboarding;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem3 {
    public static int solution(int number) {
        int answer = 0;

        for(int i = 1; i <= number; i++){
            answer += (int)String.valueOf(i).chars().filter(c -> c == '3' || c == '6' || c == '9').count();
        }

        return answer;
    }
}
