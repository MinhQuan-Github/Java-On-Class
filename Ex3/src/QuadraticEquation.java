// giai phuong trinh bac hai ax^2+bx+c=0
import java.lang.Math;
public class QuadraticEquation {
	public void solve(double a, double b , double c) {
		if (a == 0) {
			if (b == 0) {
				if (c == 0) {
					System.out.println("Infinite solutions");
				} else {
					System.out.println("Can't solve");
				}
			} else {
				Float answer = (float) (-c * 1.0 / b);
				System.out.println("x = " + answer);
			}
		} else {
			double delta = b * b - 4 * a * c;
			if (delta == 0) {
				Double x = -b / (2 * a);
				System.out.println("x1 = x2 = " + x);
			} else if (delta < 0) {
				System.out.println("Can't solve");
			} else {
				double x1 = (-b + Math.sqrt(delta))/(2 * a);
				double x2 = (-b - Math.sqrt(delta))/(2 * a);
				System.out.println("x1 = " + x1 + "\nx2 = " + x2);
			}
		}
	}
	public static void main(String[] args) {
		QuadraticEquation QE = new QuadraticEquation();
		QE.solve(0, 0, 0);
		QE.solve(0, 0, 1.5);
		QE.solve(0, 1.5, 5);
		QE.solve(1, 2, 1);
		QE.solve(1000, 1, 1);
		QE.solve(1, 3, 2);
	}

}
