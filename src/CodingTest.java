import javax.swing.plaf.synth.SynthToolTipUI;
import java.util.ArrayList;
import java.util.HashMap;


public class CodingTest {
    public static void main(String[] args) {
        String[] a = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        String[] b = solution(a);
        for (String i : b) {
            System.out.println(i);
        }
    }

    public static String[] solution(String[] record) {
        HashMap<String,String> id = new HashMap<>();

        ArrayList<String[]> arrayList = new ArrayList<String[]>();

        for (int i = 0; i < record.length; i++) {
            String[] a = record[i].split(" ");
            if (!a[0].equals("Change")) arrayList.add(a);
            if (!a[0].equals("Leave")) id.put(a[1],a[2]);
        }

        String[] result = new String[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            String x;
            if (arrayList.get(i)[0].equals("Enter")) {
                result[i] = id.get(arrayList.get(i)[1])+"님이 들어왔습니다.";
            }else if(arrayList.get(i)[0].equals("Leave")){
                result[i] = id.get(arrayList.get(i)[1]) + "님이 나갔습니다.";
            }
        }
        return result;
    }
}
