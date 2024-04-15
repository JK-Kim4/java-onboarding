package onboarding;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem3 {
    public static int solution(int number) {
        int answer = 0;

        Pattern pattern = Pattern.compile("([369])");

        for(int i = 1; i <= number; i++){
            Matcher matcher = pattern.matcher(String.valueOf(i));
            if (matcher.find()){
                System.out.println(i);
                answer++;
            }
        }

        return answer;
    }
}
