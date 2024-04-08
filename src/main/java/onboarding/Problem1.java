package onboarding;

import java.util.List;

class Problem1 {

    // 01. 책음 임의로 펼친다. -> 인스턴스 생성
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;
        // 00. 시작 면이나 마지막 면이 나오도록 책을 펼치지 않는다.(예외사항)
        if(startCondition(pobi) && startCondition(crong)) return -1;

        // 02. 왼쪽 페이지 번호의 각 자리 숫자를 모두 더하거나, 모두 곱해 가장 큰 수를 구한다.
        // 03. 오른쪽 페이지 번호의 각 자리 숫자를 모두 더하거나, 모두 곱해 가장 큰 수를 구한다.
        // 04. 2~3 과정에서 가장 큰 수를 본인의 점수로 한다.
        // 02 - 04 findScore() 호출하여 각각 최고 점수 생성

        // 05. 점수를 비교해 가장 높은 사람이 게임의 승자가 된다.





        return answer;
    }


    private static boolean startCondition(List<Integer> target){
        return !target.contains(1) && !target.contains(400);
    }

    private static Integer findScore(List<Integer> target){


        return null;
    }
}