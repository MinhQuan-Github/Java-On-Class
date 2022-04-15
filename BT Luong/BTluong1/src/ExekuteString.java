import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExekuteString {
    public String nhapso() throws IOException {
        InputStreamReader luongvao = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(luongvao);
        String s = br.readLine();
        return s;
    }

    public void daoChuoi(String m) {
        String result = "";
        for (int i = m.length()-1 ; i >= 0 ; i--){
            result += m.charAt(i);
        }
        System.out.println("Chuoi ban dau la : " + m);
        System.out.println("Chuoi sau khi dao la : " + result);
    }

    public void toLowerUpper(String m) {

    }

    public static void main(String[] args) {
        ExekuteString dt = new ExekuteString();
        String m = "";
        try {
            do {
                System.out.println("Nhap mot chuoi : ");
                m = dt.nhapso();
            } while (m.length() <= 0);
        } catch (Exception e) {
        }
        System.out.println("Chuoi da nhap la : " + m);
        dt.daoChuoi(m);
    }
}
