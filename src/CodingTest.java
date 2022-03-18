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
        Arrays.fill(nut,0);
        int a = 0;
        /*일단 중복제거
        *확인해야할게 k넘는게 있는지
        *있다면? > 그아이디 확인
        *신고한사람을 찾아야지 레포트배열에서
        *윗내용은 어제생각한거
        * 바꾸는 이유 너무 비효율적임 비교를 몇번하는거야 또 스플릿에 나눠야되고
        * 바꿔야될거같은게 해시이용해서 누가누구를 신고했는지 리스트에 저장
        * 마지막에 리스트 확인해서 그사람 있으면 메일전송횟수 증가 시키면
        * ㄴㄴ그냥 바이너리서치하면됨
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
        for (int i = 0; i < report.length; i++) {
            if (!report[i].equals("x")) {
                String[] split = report[i].split(" ");
                int num = Arrays.binarySearch(id_list, split[1]);
                if (num==-nut.length) {
                    nut[0]++;
                }else{
                    nut[num]++;
                }
            }
        }
        for (int i = 0; i < id_list.length; i++) {
            if (nut[i]>=k) {

            }
            if (!report[i].equals("x")) {
                String[] split = report[i].split(" ");

                }
            }


        System.out.println("a의 값"+a);
        for (int s : nut) {
            System.out.println(s);
        }
        return answer;
        }

    }
