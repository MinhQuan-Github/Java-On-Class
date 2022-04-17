import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chuoi {
    public String nhapso() throws IOException {
        InputStreamReader luongvao = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(luongvao);
        return br.readLine();
    }

    public static String toLower(String m) {
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

    public String toLowerFirstElement(String m) {
        char [] charArray = toLower(m).toCharArray();
        boolean foundspace = true;
        for (int i = 0 ; i < m.length() ; i++) {
            if (Character.isLetter(charArray[i])) {
                if (foundspace) {
                    charArray[i] = (char)(charArray[i] - 32);
                    foundspace = false;
                }
            } else {
                foundspace = true;
            }
        }
        return String.valueOf(charArray);
    }

    public String StringByLine(String m ) {
        char [] charArray = toLower(m).toCharArray();
        boolean foundspace = true;
        boolean flag = false;
        String result = "\n";
        for (int i = 0 ; i < m.length() ; i++) {
            if (Character.isLetter(charArray[i])) {
                if (foundspace) {
                    foundspace = false;
                }
                result += charArray[i];
                flag = false;
            } else {
                if (flag == false) {
                    result += "\n";
                    flag = true;
                }
                foundspace = true;
            }
        }
        return result;
    }

    public String nguyenAm(String m) {
        char [] charArray = toLower(m).toCharArray();
        boolean foundspace = true;
        String result = "\n";
        for (int i = 0 ; i < m.length() ; i++) {
            if (Character.isLetter(charArray[i])) {
                if (foundspace) {
                    result += charArray[i] + "\n";
                    foundspace = false;
                }
            } else {
                foundspace = true;
            }
        }
        return result;
    }

    public int count(String m) {
        int k = 0;
        char [] charArray = toLower(m).toCharArray();
        boolean foundspace = true;
        for (int i = 0 ; i < m.length() ; i++) {
            if (Character.isLetter(charArray[i])) {
                if (foundspace) {
                    k++;
                    foundspace = false;
                }
            } else {
                foundspace = true;
            }
        }
        return k;
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
        System.out.println("Chuoi sau khi viet hoa chu dau tien la : " + dt.toLowerFirstElement(m));
        System.out.println("Chuoi sau khi viet xuong dong la : " + dt.StringByLine(m));
        System.out.println("Nguyen am cua chuoi la : " + dt.nguyenAm(m));
        System.out.println("So tu co trong chuoi la : " + dt.count(m));
    }
}
