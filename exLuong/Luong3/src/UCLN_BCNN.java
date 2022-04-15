import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UCLN_BCNN {
    public int nhapso() throws IOException {
        InputStreamReader luongvao = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(luongvao);
        String s = br.readLine();
        return Integer.parseInt(s);
    }

    public int UCLN(int a , int b) {
        while (a!=b) {
            if (a > b) a -= b;
            else b -= a;
        }
        return a;
    }

    public int BCNN(int a , int b) {
        return (a * b) / UCLN(a,b);
    }

    public static void main(String[] args) throws IOException {
        UCLN_BCNN dt = new UCLN_BCNN();
        int a = 0;
        int b = 0;
        try {
            do {
                a = dt.nhapso();
                b = dt.nhapso();
            } while (a <= 0 || b <= 0);
        } catch (Exception e) {}
        System.out.println("UCLN va BCNN la : " + dt.UCLN(a,b) + " " + dt.BCNN(a,b));

    }
}

