import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chuoi {
    public String nhapso() throws IOException {
        InputStreamReader luongvao = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(luongvao);
        return br.readLine();
    }

    public void daoChuoi(String m) {
        StringBuilder result = new StringBuilder();
        for (int i = m.length()-1 ; i >= 0 ; i--){
            result.append(m.charAt(i));
        }
        System.out.println("Chuoi ban dau la : " + m);
        System.out.println("Chuoi sau khi dao la : " + result);
    }

    public static void main(String[] args) {
        Chuoi dt = new Chuoi();
        String m = "";
        try {
            do {
                System.out.println("Nhap mot chuoi : ");
                m = dt.nhapso();
            } while (m.length() <= 0);
        } catch (Exception ignored) {}
        System.out.println("Chuoi da nhap la : " + m);
        dt.daoChuoi(m);
    }
}
