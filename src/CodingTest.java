import javax.swing.plaf.synth.SynthToolTipUI;
import java.util.ArrayList;
import java.util.HashMap;


public class CodingTest {
    public static void main(String[] args) {

        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","apeach frodo","apeach frodo","frodo neo","muzi neo","apeach muzi","frodo neo"};
        solution(id_list,report,2);

    }

    public static int[] solution(String[] id_list, String[] report, int k){
        int[] answer = {};
        int a = 0;
        /*일단 중복제거
        *
        *
        *
        * */

        for (int i = 0; i < report.length; i++) {
            if (report[i].equals("x")) {
                System.out.println("확인");
            }else {
                a++;
                for (int j = i + 1; j < report.length; j++) {
                    if (report[i].equals(report[j])) {
                        System.out.println(report[j]);
                        report[j] = "x";
                    }
                }
            }
        }
        System.out.println("a의 값"+a);
        for (String s : report) {
            System.out.println(s);
        }
        return answer;
        }

    }
