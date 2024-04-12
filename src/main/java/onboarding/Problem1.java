package onboarding;

import java.util.ArrayList;
import java.util.List;

public class Problem1 {

    // 01. 책음 임의로 펼친다. -> 인스턴스 생성
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;
        if(Problem1.시작_조건_확인(pobi) || Problem1.시작_조건_확인(crong)) return -1;

        Integer pobiScore = 0;
        Integer pobiL = pobi.get(0);
        Integer pobiR = pobi.get(1);

        Integer crongScore = 0;
        Integer crongL = crong.get(0);
        Integer crongR = crong.get(1);

        pobiScore = Problem1.두_값중_더_큰_값_리턴(
                Problem1.두_값중_더_큰_값_리턴(Problem1.각_자리수_합(pobiL),Problem1.각_자리수_곱(pobiL)),
                Problem1.두_값중_더_큰_값_리턴(Problem1.각_자리수_합(pobiR),Problem1.각_자리수_곱(pobiR)));

        crongScore = Problem1.두_값중_더_큰_값_리턴(
                Problem1.두_값중_더_큰_값_리턴(Problem1.각_자리수_합(crongL),Problem1.각_자리수_곱(crongL)),
                Problem1.두_값중_더_큰_값_리턴(Problem1.각_자리수_합(crongR),Problem1.각_자리수_곱(crongR)));

        if (pobiScore > crongScore) return 1;
        else if(pobiScore < crongScore) return 2;
        else return 0;
    }

    //시작 조건 검사
    public static boolean 시작_조건_확인(List<Integer> parameter){
        return ( parameter.contains(1) || parameter.contains(400) );
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