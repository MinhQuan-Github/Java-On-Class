// n!!=1*3*5*.....*n(n le)
//    =2*4*6*....*n(n chan)
public class SuperFactorial {
	public double superFactorial(double n) {
		double answer = 1;
		if (n % 2 == 0) {
			for (double i = 2 ; i <= n ;i += 2) {
				answer *= i;
			}
		} else {
			for (double i = 1 ; i <= n ;i += 2) {
				answer *= i;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		SuperFactorial SF = new SuperFactorial();
		System.out.println("10!! = " + SF.superFactorial(10));
		System.out.println(" 7!! = " + SF.superFactorial(7));
		System.out.println("15!! = " + SF.superFactorial(15));
	}
}
