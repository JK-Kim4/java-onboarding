package onboarding;

import java.util.ArrayList;
import java.util.List;

public class Problem1 {

    // 01. 책음 임의로 펼친다. -> 인스턴스 생성
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;

        return answer;
    }

    //시작 조건 검사
    public static boolean 시작_조건_확인(List<Integer> parameter){
        return !( parameter.contains(1) || parameter.contains(400) );
    }

    //각 자리수 합 (재귀 호출)
    public static Integer 각_자리수_합(Integer parameter){
        Integer result = 0;
        while ( parameter != 0){
            result += (parameter % 10);
            parameter = parameter / 10;
        }
        return result;
    }

    //각 자리수 곱(재귀 호출)
    public static Integer 각_자리수_곱(Integer parameter){
        Integer result = 1;
        while ( parameter != 0){
            result *= (parameter % 10);
            parameter = parameter / 10;
        }
        return result;
    }

    //두 값 비교
    public static Integer 두_값중_더_큰_값_리턴(Integer parameter1, Integer parameter2){
        return Math.max(parameter1, parameter2);
    }
}