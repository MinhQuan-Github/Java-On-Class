// Ex1 : Tim max cua 3 so a , b , c
public class Max {
	public int max(int a , int b , int c) {
		if (a >= b && a >= c) {
			return a;
		} else {
			if (b >= c) {
				return b;
			}
			return c;
		}
	}
	public static void main(String[] args) {
		Max M = new Max();
		int a = 2 , b = 4 , c = 1;
		System.out.print("Max cua 3 so a , b , c la : " + M.max(a, b, c));

	}

}
