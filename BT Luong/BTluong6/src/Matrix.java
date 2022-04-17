import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Matrix {
    public int nhapso() throws IOException {
        InputStreamReader luongvao = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(luongvao);
        return Integer.parseInt(br.readLine());
    }

    public void input(int [][]a) throws IOException {
        for (int i = 0 ; i < a.length; i++ ) {
            for (int j = 0 ; j < a[i].length ; j++) {
                System.out.print("Nhap a[" + i + "][" + j + "] = ");
                a[i][j] = nhapso();
            }
        }
    }

    public void output(int [][]a) {
        for (int i = 0 ; i < a.length; i++ ) {
            for (int j = 0 ; j < a[i].length ; j++) {
                System.out.print(a[i][j] + "     ");
            }
            System.out.println();
        }
    }

    public int tichSoBoi3(int [][]a) {
        int result = 1;
        boolean flag = false;
        for (int i = 0 ; i < a[0].length ; i++){
            if (a[0][i] % 3 == 0) {
                flag = true;
                result *= a[0][i];
            }
        }
        if (flag) return result;
        else return 0;
    }

    public int maxOfArray(int [] a){
        int max = a[0];
        for (int i = 1 ; i < a.length ; i++){
            if (a[i] > max) max = a[i];
        }
        return max;
    }

    public int [] maxArray(int [][]a){
        int [] result = new int[a.length];
        for (int i = 0 ; i < a.length ; i++) {
            result[i] = maxOfArray(a[i]);
        }
        return result;
    }

    public int [] deleteElement(int []a) {
        int [] temp = new int[a.length - 1];
        for (int i = 0 ; i < temp.length ; i++) {
            temp[i] = a[i+1];
        }
        return temp;
    }

    public static void main(String[] args) throws IOException {
        Matrix M = new Matrix();
        int m = 0 , n = 0;
        try {
            do {
                System.out.print("Nhap m : ");
                m = M.nhapso();
                System.out.print("Nhap n : ");
                n = M.nhapso();
            } while (m <= 0 || n <= 0);
        } catch (Exception ignore) {}
        int [][] a = new int[m][n];
        M.input(a);
        M.output(a);
        System.out.println("Tich cac so boi 3 tren dong dau tien cua ma tran la : " + M.tichSoBoi3(a));

        // Tao ra mang mot chieu X[i] la cac gia tri lon nhat tren dong i cua ma tran a
        int [] X = M.maxArray(a);
        System.out.print("Mang cac gia tri lon nhat tren dong i cua ma tran : ");
        for (int i = 0 ; i < X.length ; i++) {
            System.out.print(X[i] + "    ");
        }
        System.out.println();
        // Xoa di phan tu dau tien cua mang X[i], xuat lai mang X[i]
        System.out.print("Mang cac gia tri lon nhat tren dong i khi loai bo phan tu dau tien cua ma tran : ");
        for (int i = 0 ; i < M.deleteElement(X).length ; i++) {
            System.out.print(M.deleteElement(X)[i] + "    ");
        }
        System.out.println();
    }


}
