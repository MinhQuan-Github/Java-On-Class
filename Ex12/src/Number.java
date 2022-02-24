//Tinh tong va tich cua mot so nguyen duong n cho truoc 
public class Number {
	public void solve(int n) {
		int tong = 0;
		int tich = 1;
		while (n != 0) {
			tong += n % 10;
			tich *= n % 10;
			n /= 10;
		}
		System.out.println("S = " + tong + "\nP = " + tich);
	}
	public static void main(String[] args) {
		Number N = new Number();
		N.solve(11111115);
	}

}
