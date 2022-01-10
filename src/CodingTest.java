import javax.swing.plaf.synth.SynthToolTipUI;

public class CodingTest {
    public static void main(String[] args) {
        String a = "aabbaccc";
        String b = "ababcdcdababcdcd";
        String c = "abcabcdede";
        String d = "abcabcabcabcdededededede";
        String e = "xababcdcdababcdcd";
        String qw = "aaaa";
        System.out.println("되나확인");

        System.out.println("------------------");
        //System.out.println("원래문자길이 : "+c.length());
        int r = solution(qw);
        System.out.println(r);
        System.out.println("-----------------");

    }

    private static int solution(String s) {
        int answer = 0, sli = 0, qwe = s.length(), min = s.length();
        String result = "";
        for (int i = 1; i <= s.length() / 2; i++) {
            if (s.substring(0, i).equals(s.substring(i, i + i))) {
                System.out.println("몇번?");
                qwe = compareM(s, i).length();
                min = Math.min(min, qwe);
            }
        }

        return min;
    }

    private static String compareM(String s, int sli) {
        String result = "";

        int check = 1;
        String compare = "";
        //c와 i
        for (int i = sli; i < s.length()+sli; i += sli) {
            if (i == sli) {
                compare = s.substring(0, sli);
            }

            // 길이보다 클경우 비교대상이 무조건 다를거기 때문에 스탑
            // 남은거 뒤에 저장하고
            if (i + sli > s.length()) {
                if (check > 1) {
                    result += check + s.substring(i - sli);
                    break;
                } else {
                    result += s.substring(i-sli);

                    System.out.println("\n브레이크 발동 "+s.substring(i-sli));
                    System.out.println("숫자합 "+(i+sli));
                    System.out.println("문자길이 "+s.length());
                    System.out.println("체크 : "+ check);
                    break;
                    //해결 : 체크를 하다가 넘어가버림 문자길이를
                }
            }

            if (compare.equals(s.substring(i, i + sli))) {
                check++;
            } else if (check > 1) {
                result += check + compare;
                check = 1;
                compare = s.substring(i, i + sli);
                System.out.println("체크가 있지만 틀릴때 "+compare);
                System.out.println(s.substring(i, i + sli));
                System.out.println(result);
            } else { //다를경우
                result += compare;
                //비교할 단어 저장
                compare = s.substring(i, i+sli);
                System.out.println("다를떄 " +compare);
                System.out.println(result);
                System.out.println(s);
            }


        }
        System.out.println("마지막 결과 : "+result);
        return result;
    }
}
