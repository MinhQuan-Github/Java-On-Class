// In ra n chu so fibonaci dau tien
public class Fibonaci {
	public static int fi(int n) {
		if (n == 1 || n == 2) return 1;
		return fi(n-1) + fi(n-2);
	}
	public static void main(String[] args) {
		String answerString = "";
		for (int i = 1 ; i <= 20 ; i++) { // in ra 20 so hang dau tien cua day Fibonaci
			answerString += fi(i) + " ";
		}
		System.out.print(answerString);
	}

}
