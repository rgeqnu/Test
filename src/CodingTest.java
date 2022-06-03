import javax.swing.plaf.synth.SynthToolTipUI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


public class CodingTest {
    public static void main(String[] args) {

        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        solution(id_list,report,2);

    }

    public static int[] solution(String[] id_list, String[] report, int k){
        int[] answer = {};
        int[] nut = new int[id_list.length];
        int[] result = new int[id_list.length];
        for (int i = 0; i < report.length; i++) {
            if (!report[i].equals("x")) {
                for (int j = i + 1; j < report.length; j++) {
                    if (report[i].equals(report[j])) {
                        report[j] = "x";
                    }
                }
            }
        }
        for (int i = 0; i < report.length; i++) {
            if (!report[i].equals("x")) {
                String[] split = report[i].split(" ");
                nut[Arrays.asList(id_list).indexOf(split[1])]++;
            }
        }
        for (int i = 0; i < id_list.length; i++) {
            if (nut[i]>=k) {
                for (int j = 0; j < report.length; j++) {
                    if (!report[j].equals("x")) {
                        String[] split = report[j].split(" ");
                        if (split[1].equals(id_list[i])) {
                            result[Arrays.asList(id_list).indexOf(split[0])]++;
                        }
                    }
                }
            }
            }


        for (int s : result) {
            System.out.println(s);
        }
        return result;
        }

    }
