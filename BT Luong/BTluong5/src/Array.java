import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array {
    public int nhapso() throws IOException {
        InputStreamReader luongvao = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(luongvao);
        return Integer.parseInt(br.readLine());
    }

    public void input(int [] a) throws IOException {
        for (int i = 0 ; i < a.length ; i++) {
            System.out.println("Nhap phan tu thu " + i + " : ");
            a[i] = nhapso();
        }
    }

    public void output(int [] a) {
        for (int i = 0 ; i < a.length ; i ++) {
            System.out.println(a[i] + "  ");
        }
    }

    public int sumOdd(int []a) {
        int result = 0;
        for (int i = 0 ; i < a.length ; i++) {
            if (a[i] > 0 && a[i] % 2 != 0) result += a[i];
        }
        return result;
    }

    public int positionElement(int [] a, int k) {
        for (int i = 0 ; i < a.length ; i++) {
            if (a[i] == k) return i;
        }
        return -1;
    }

    public int [] sortAccending(int []a) {
        for (int i = 0 ; i < a.length - 1; i++) {
            for (int j = i + 1 ; j < a.length ; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

    public int [] insert(int []a , int p) {
        int []temp = a;
        a = new int[a.length + 1];
        for (int i = 0 ; i < a.length-1; i++) {
            a[i] = temp[i];
        }
        a[a.length-1] = p;
        return a;
    }

    public static void main(String[] args) throws IOException {
        Array array = new Array();
        int n = 0 ;
        System.out.println("Nhap n = ");
        try {
            do {
                n = array.nhapso();
            } while (n < 1);
        } catch (Exception ignore) {}
        int []a = new int[n];
        // Nhap mot mang a gom n phan tu thuoc kieu nguyen int
        array.input(a);
        // Tinh tong cac so duong le mang a
        System.out.println("Tong cac so duong le trong mang : " + array.sumOdd(a));
        // Nhap phan tu k , tim xem k co xuat hien trong man da cho hay khong ? Neu co chi ra phan tu o vi tri dau tien
        int x; System.out.println("Nhap x = "); x = array.nhapso();
        if (array.positionElement(a,x) == -1) {
            System.out.println(x + " khong la phan tu trong mang !!");
        } else {
            System.out.println(x + " la phan tu o vi tri thu " + array.positionElement(a,x) + 1 + " trong mang !!");
        }
        // Sap xep mang a theo thu tu tang dan
        System.out.println("Day truoc khi xep : ");
        array.output(a);
        System.out.println("Day sau khi xep : ");
        array.output(array.sortAccending(a));
        // Chen phan tu p vao mang a sao cho mang a van dam bao tang dan va xuat lai mang a.
        System.out.println("Nhap p = " );
        int p = array.nhapso();
        System.out.println("Mang sau khi chen : ");
        array.output(array.sortAccending(array.insert(a,p)));
    }
}
