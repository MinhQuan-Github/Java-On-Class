
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonaci {
    public int nhapso() throws IOException {
        InputStreamReader luongvao = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(luongvao);
        String s = br.readLine();
        return Integer.parseInt(s);
    }

    public static int soDaoNguoc(int a) {
        int result = 0;
        while (a != 0) {
            result = result * 10 + a % 10;
            a /= 10;
        }
        return result;
    }

    public boolean isSymmetry(int a) {
        int result = soDaoNguoc(a);
        if (result == a) {
            return true;
        } else {
            return false;
        }
    }

    public int elementOfFibonaci(int element) {
        int a = 1;
        int b = 1;
        for (int i = 3 ; b < element ; i++) {
            if (a + b == element) return i;
            b = a + b;
            a = b - a;
        }
        return -1;
    }


    public static void main(String[] args) throws IOException {
        Fibonaci dt = new Fibonaci();
        int a = 0;
        try {
            do {
                System.out.println("Nhap a : ");
                a = dt.nhapso();
            } while (a < 0);
        } catch (Exception e) {}
        System.out.println("So dao nguoc la " + dt.soDaoNguoc(a));
        if (dt.isSymmetry(a)) {
            System.out.println(a + " la so dao nguoc");
        } else {
            System.out.println(a + " khong phai la so dao nguoc ");
        }
        if (dt.elementOfFibonaci(a) != -1) {
            System.out.println(a + " la phan tu thu " + dt.elementOfFibonaci(a));
        } else {
            System.out.println(a + " khong la phan tu trong day fibonaci");
        }
        System.out.println();
    }
}




