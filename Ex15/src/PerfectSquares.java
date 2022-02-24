// Kiem tra so P co phai la so chinh phuong khong
public class PerfectSquares {
	public static boolean check(double P) {
		if (Math.sqrt(P) == (double)((int)Math.sqrt(P))) return true;
		return false;
	}
	public static void main(String[] args) {
		if (check(0)) System.out.print("true");
		else System.out.print("false");
		if (check(100)) System.out.print("true");
		else System.out.print("false");
	}
}
