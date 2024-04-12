package onboarding;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Problem1Test {

    @Test
    void 시작조건_확인_테스트(){
        List<Integer> trueParam = List.of(4,5);
        List<Integer> falseParam = List.of(1,2);

        assertThat(Problem1.시작_조건_확인(trueParam)).isEqualTo(true);
        assertThat(Problem1.시작_조건_확인(falseParam)).isEqualTo(false);
    }

    @Test
    void 각_자리수_합_테스트(){
        Integer param1 = 123;
        Integer param2 = 4352;
        Integer param3 = 2;

        assertThat(Problem1.각_자리수_합(param1)).isEqualTo(6);
        assertThat(Problem1.각_자리수_합(param2)).isEqualTo(14);
        assertThat(Problem1.각_자리수_합(param3)).isEqualTo(2);
    }

    @Test
    void 각_자리수_곱_테스트(){
        Integer param1 = 123;
        Integer param2 = 4352;
        Integer param3 = 2;

        assertThat(Problem1.각_자리수_곱(param1)).isEqualTo(6);
        assertThat(Problem1.각_자리수_곱(param2)).isEqualTo(120);
        assertThat(Problem1.각_자리수_곱(param3)).isEqualTo(2);
    }

    @Test
    void 두_값중_더_큰_값_테스트(){
        List<Integer> result5 = List.of(4,5);
        List<Integer> result2 = List.of(1,2);

        assertThat(Problem1.두_값중_더_큰_값_리턴(result5.get(0), result5.get(1))).isEqualTo(5);
        assertThat(Problem1.두_값중_더_큰_값_리턴(result2.get(0), result2.get(1))).isEqualTo(2);
    }
}
