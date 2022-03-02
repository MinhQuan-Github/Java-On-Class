// Kiem tra K co thuoc day fibonaci hay khong , neu co thi chi ra do la phan tu o vi tri thu may cua day fibonaci
public class Check {
	public static int fi(int n) {
		if (n == 1 || n == 2) return 1;
		return fi(n-1) + fi(n-2);
	}
	public static int check(int K) {
		int i = 1;
		while (fi(i) <= K) {
			if (K == fi(i)) return i;
			else {
				i++;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		System.out.println(check(32));
		System.out.println(check(89));
	}
	
}
