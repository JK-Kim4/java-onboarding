package onboarding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem2 {

    public static String solution(String cryptogram) {
        //stack 응용
        StringBuilder sb = new StringBuilder();
        List<Character> resultList = new ArrayList<>();

        for(char c: cryptogram.toCharArray()){
            if(resultList.size() == 0){
                resultList.add(c);
            }else{
                if(resultList.get(resultList.size()-1) == c){
                    resultList.remove(resultList.size()-1);
                }else {
                    resultList.add(c);
                }
            }
        }

        for(Character c: resultList){
            sb.append(c);
        }

        return sb.toString();
    }

//    public static boolean 인접한_두_원소_비교(char a, char b){
//        return a == b;
//    }
//
//    public static String  인접한_두_원소_제거(String parameter, int index){
//        StringBuilder sb = new StringBuilder(parameter);
//        return sb.deleteCharAt(index).deleteCharAt(index).toString();
//    }

}
