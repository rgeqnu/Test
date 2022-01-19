import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CodingTestTest {

    @Test
    void main() {
        assertEquals(solution(1),"1");
        assertEquals(solution(17),"122");
        assertEquals(solution(30),"244");
        assertEquals(solution(3),"4");
        assertEquals(solution(4),"11");
        System.out.println(solution(302));
    }

    public String solution(int n) {
        String answer = "";
        String[] ans = {"4","1","2"};
        //받은 숫자를 나눠 줍시다
        while (n > 0) {
            int a = n % 3;
            answer = ans[a] + answer;
            if (a == 0) n--;
            n/=3;
        }
        return answer;
    }
}