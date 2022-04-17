import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chuoi {
    public String nhapso() throws IOException {
        InputStreamReader luongvao = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(luongvao);
        return br.readLine();
    }

    public String daoChuoi(String m) {
        StringBuilder result = new StringBuilder();
        for (int i = m.length()-1 ; i >= 0 ; i--){
            result.append(m.charAt(i));
        }
        return result.toString();
    }

    public String toUpper(String m) {
        StringBuilder result = new StringBuilder();
        for(int i = 0 ; i < m.length() ; i++) {
            if ((int)(m.charAt(i)) <= 122 && (int)(m.charAt(i)) >= 97) {
                result.append((char) (m.charAt(i) - 32));
            } else {
                result.append(m.charAt(i));
            }
        }
        return result.toString();
    }

    public String toLower(String m) {
        StringBuilder result = new StringBuilder();
        for(int i = 0 ; i < m.length() ; i++) {
            if ((int)(m.charAt(i)) <= 90 && (int)(m.charAt(i)) >= 65) {
                result.append((char) (m.charAt(i) + 32));
            } else {
                result.append(m.charAt(i));
            }
        }
        return result.toString();
    }

    public String toLowerUpper(String m) {
        StringBuilder result = new StringBuilder();
        for(int i = 0 ; i < m.length() ; i++) {
            if ((int)(m.charAt(i)) <= 90 && (int)(m.charAt(i)) >= 65) {
                result.append((char) (m.charAt(i) + 32));
            } else if ((int)(m.charAt(i)) <= 122 && (int)(m.charAt(i)) >= 97) {
                result.append((char) (m.charAt(i) - 32));
            } else {
                result.append(m.charAt(i));
            }
        }
        return result.toString();
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
        System.out.println("Chuoi sau khi dao la : " + dt.daoChuoi(m));
        System.out.println("Chuoi sau khi sang chu hoa la : " + dt.toUpper(m));
        System.out.println("Chuoi sau khi sang chu thuong la : " + dt.toLower(m));
        System.out.println("Chuoi sau khi doi hoa sang thuong va thuong sang hoa la : " + dt.toLowerUpper(m));
    }
}
