// Kiem tra M co phai la so doi xung hay khong
public class SymmetricalNumber {
	public static boolean check(int P) {
		int _P = P;
		int temp = 0;
		while (_P > 0) {
			temp = temp * 10 + _P % 10;
			_P /= 10;
		} 
		if (temp == P) return true;
		return false;
	}
	public static void main(String[] args) {
		if (check(123456)) System.out.print("true");
		else System.out.print("false");
		if (check(12321)) System.out.print("true");
		else System.out.print("false");
	}

}
