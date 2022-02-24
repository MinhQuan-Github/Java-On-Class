// S=1+1/3!+1/5!+.....+1/(2n-1)!
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
			answer += (double)(1.0 / factorial(2*i-1)) ;
		}
		System.out.println("S = " + answer);
	}
	public static void main(String[] args) {
		NumberSequence NS = new NumberSequence();
		NS.solve(5);
		NS.solve(11);
		NS.solve(100);
	}
}
