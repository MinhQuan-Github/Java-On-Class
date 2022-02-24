// In ra cac so nguyen to nho hon hoac bang so nguyen duong n cho truoc
public class Prime {
	public static boolean checkPrime(int m) {
		if (m <= 2) return false;
		for (int i = 2 ; i <= Math.sqrt(m) ; i++) {
			if (m % i == 0) return false;
		}
		return true;
	}
	public static void show(int n) {
		String S = "";
		for (int i = 3 ; i <= n; i += 2) {
			if (checkPrime(i)) S += i + "  ";
		}
		System.out.print(S);
	}
	public static void main(String[] args) {
		show(1000);
	}

}
