// tim UCLN va BCNN cua hai so nguyen a va b
public class Number {
	public static int UCLN(int a, int b) {
		if (a == 0 || b == 0) return a+b;
		while (a != b) {
			if (a >	 b) a -= b;
			else b -= a;
		}
		return a;
	}
	public static int BCNN(int a, int b) {
		return (a * b)/UCLN(a,b);
	}

	public static void main(String[] args) {
		System.out.println(UCLN(8, 12));
		System.out.println(UCLN(12,15));
		System.out.println(BCNN(12,15));
	}

}
