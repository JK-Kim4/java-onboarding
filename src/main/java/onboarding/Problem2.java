package onboarding;

import java.util.Arrays;
import java.util.List;

public class Problem2 {

    public static String solution(String cryptogram) {
        String answer = cryptogram;
        //00. 문자열 -> char[]
        //01. 인접한 두 원소 비교 (buble)
        int i = 0;
        while (answer.length()-1 > i){
            if(Problem2.인접한_두_원소_비교(answer.charAt(i), answer.charAt(i+1))){
                //01-2. 두 문자가 같을 경우 -> 인접한 두 문자 제거
                answer = Problem2.인접한_두_원소_제거(answer, i);
                i = 0;
            }else{
                //01-1. 두 문자가 다를 경우 -> index++
                i++;
            }
        }
        return answer;
    }

    public static boolean 인접한_두_원소_비교(char a, char b){
        return a == b;
    }

    public static String  인접한_두_원소_제거(String parameter, int index){
        StringBuilder sb = new StringBuilder(parameter);
        return sb.deleteCharAt(index).deleteCharAt(index).toString();
    }

}
