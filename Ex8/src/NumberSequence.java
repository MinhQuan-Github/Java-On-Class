// S=1+1/2+1/3+....+1/n
public class NumberSequence {
	public void solve(double n) {
		double answer = 0;
		for (double i = 1 ; i <= n; i++) {
			answer += (double)(1.0 / i) ;
		}
		System.out.println("S = " + answer);
	}
	public static void main(String[] args) {
		NumberSequence NS = new NumberSequence();
		NS.solve(5);
		NS.solve(7);
		NS.solve(100);
	}
}
