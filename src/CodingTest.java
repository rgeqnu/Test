import javax.swing.plaf.synth.SynthToolTipUI;
import java.util.ArrayList;
import java.util.HashMap;


public class CodingTest {
    public static void main(String[] args) {

        System.out.println(solution(17));

    }

    public static String solution(int n) {
        String answer = "";
        String[] ans = {"4","1","2"};
        //받은 숫자를 나눠 줍시다
        if (n / 3 < 1) {
            //수정해야한
            answer = ans[n] + answer;
        } else {
            while (n / 3 > 0) {
                answer = ans[n % 3] + answer;
                if (n % 3 == 0) {
                    n = (n / 3) - 1;
                } else {
                    n = n / 3;
                }
                if (n / 3 == 0) {
                    //여기도 수정
                    answer = n + answer;
                }
            }
        }
        return answer;
        }

    }
