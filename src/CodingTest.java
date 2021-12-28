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
        int r = solution(c);
        System.out.println(r);
        System.out.println("------------------");

    }

    private static int solution(String s) {
        int answer = 0, sli = 0, qwe = s.length(), min = s.length();
        String result = "";
        for (int i = s.length() / 2; i > 0; i--) {
            if (s.substring(0, i).equals(s.substring(i, i + i))) {
                System.out.println("몇번되띾요?");
                qwe = compareM(s, i).length();
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
        for (int i = sli; i < s.length()+sli; i += sli) {
            if (i == sli) {
                compare = s.substring(0, sli);
            }

            // 길이보다 클경우 비교대상이 무조건 다를거기 때문에 스탑
            // 남은거 뒤에 저장하고
            if (i + sli > s.length()) {
                result += s.substring(i-sli);
                System.out.println("브레이크 발동 "+s.substring(i-sli));
                break;
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
                compare = s.substring(i - sli, i);
            }


        }
        System.out.println("마지막 결과 : "+result);
        return result;
    }
}
