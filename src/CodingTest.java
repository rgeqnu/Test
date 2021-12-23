import javax.swing.plaf.synth.SynthToolTipUI;

public class CodingTest {
    public static void main(String[] args) {
        String a = "aabbacdscc";
        String b = "ababcdcdababcdcd";
        String c = "abcabcdede";
        String d = "abcabcabcabcdededededede";
        String e = "xababcdcdababcdcd";
        String qw = "aaaa";
        System.out.println("되나확인");

        System.out.println("------------------");
        //System.out.println("원래문자길이 : "+c.length());
        int r = solution(d);
        System.out.println(r);
        System.out.println("------------------");

    }

    private static int solution(String s) {
        int answer = 0, sli = 0, qwe = 0, min = s.length();
        String result = "";
        for (int i = s.length() / 2; i > 0; i--) {
            if (s.substring(0, i).equals(s.substring(i, i + i))) {
                //qwe = compareM(s, i).length();
                min = Math.min(min, qwe);
            }
        }

        return min;
    }

    private static String compareM(String s, int sli) {
        String result = "";

        int c = 0, check = 1;
        String compare = "";
        //c와 i
        for (int i = 0; i < s.length(); i += sli) {
            if (i == 0) {

            }

            //비교할 단어 저장
            compare = s.substring(i - sli, i);

            if (compare.equals(s.substring(i, i + sli))) {
                check++;
            } else if (check > 1) {
                result += check + compare;
                check = 1;
            } else { //다를경우
                result += compare;
            }
        }
        return result;
    }
}
