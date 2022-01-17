import javax.swing.plaf.synth.SynthToolTipUI;
import java.util.ArrayList;
import java.util.HashMap;


public class CodingTest {
    public static void main(String[] args) {

        System.out.println(solution(312));

    }

    public static String solution(int n) {
        String answer = "";
        String[] ans = {"0","1","2","4"};
        //받은 숫자를 나눠 줍시다
        if (n == 3) {
            answer = 4+answer;
        } else if (n < 4) {
            answer = n+answer;
        } else {
            while (n / 3 > 0) {
                System.out.println("실행");
                if (n % 3 == 0) {
                    answer = 4 + answer;
                    n = (n / 3) - 1;
                } else {
                    answer = n % 3 + answer;
                    n = n / 3;
                }
                if (n / 3 == 0) {
                    answer = n + answer;
                }
            }
        }
        return answer;
        }

    }
