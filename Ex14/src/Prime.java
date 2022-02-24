// Nhap mot so nguyen m kiem tra m co phai la so nguyen to khong
public class Prime {
	public static boolean checkPrime(int m) {
		if (m <= 2) return false;
		for (int i = 2 ; i <= Math.sqrt(m) ; i++) {
			if (m % i == 0) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		if (checkPrime(83)) System.out.print("true");
		else System.out.print("false");
	}

}
