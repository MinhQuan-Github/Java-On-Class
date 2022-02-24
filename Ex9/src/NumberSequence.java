// S=15-1+1/2-1/3!+....+(-1)^n  1/n!
public class NumberSequence {
	public static double factorial(double n) {
		double answer = 1;
		for (double i = 1 ; i <= n ;i++) {
			answer *= i;
		}
		return answer;
	}
	public void solve(double n) {
		double answer = 0;
		for (double i = 1 ; i <= n; i++) {
			if (i % 2 == 0) {
				answer += (double)(1.0 / factorial(i)) ;
			} else {
				answer -= (double)(1.0 / factorial(i)) ;
			}
		}
		System.out.println("S = " + (15 - answer));
	}
	public static void main(String[] args) {
		NumberSequence NS = new NumberSequence();
		NS.solve(5);
		NS.solve(7);
		NS.solve(100);
	}
}
