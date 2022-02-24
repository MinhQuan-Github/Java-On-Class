// In ra cac so hoan hao nho hon 1000
public class PerfectNumber {
	public static int sumOfDivisors(int n) {
		int sum = 0 ;
		for (int i = 1 ; i <= n / 2 ; i++) {
			if (n % i == 0) sum += i;
		}
		return sum;
	}
	public static void main(String[] args) {
		String number = "";
		for (int i = 1 ; i < 1000 ; i++) {
			if (i == sumOfDivisors(i)) number += i + " ";
		}
		System.out.print(number);
	}
}
