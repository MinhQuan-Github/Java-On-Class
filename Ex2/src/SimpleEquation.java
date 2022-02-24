// giai phuong trinh bac nhat ax+b=0
public class SimpleEquation {
	public void solve(int a , int b) {
		if (a == 0) {
			if (b == 0) {
				System.out.println("Infinite solutions");
			} else {
				System.out.println("Can't solve");
			}
		} else {
			Float answer = (float) (-b * 1.0 / a);
			System.out.println("x = " + answer);
		}
	}
	public static void main(String[] args) {
		SimpleEquation SE = new SimpleEquation();
		SE.solve(0, 2);
		SE.solve(0, 0);
		SE.solve(1, 5);
		SE.solve(4, 5);
	}
}
