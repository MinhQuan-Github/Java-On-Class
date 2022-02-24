
public class Median {
	public double median(double a , double b , double c) {
		if (a <= b && a >= c || a <= c && a >= b) return a;
		else if (b <= a && b >= c || b <= c && b >= a) return b;
		else return c;
	}

	public static void main(String[] args) {
		Median M = new Median();
		System.out.println(M.median(10, 11, 12));
		System.out.println(M.median(1, 0, 2));
		System.out.println(M.median(1, 1, 3));
		System.out.println(M.median(10, 10, 10));
	}

}
