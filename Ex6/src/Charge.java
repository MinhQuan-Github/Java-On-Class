// Tinh tien karaoke
public class Charge {
	int a;
	int b;
	public Charge(int a , int b) {
		this.a = a;
		this.b = b;
	}
	public int charge() {
		int money;
		if (b < 18) money = (b - a) * 45000;
		else {
			money = (18 - a) * 45000 + (b - 18) * 60000;
		}
		return money;
	}

	public static void main(String[] args) {
		Charge C1 = new Charge(10 , 12);
		System.out.println(C1.charge()+ "d");
		Charge C2 = new Charge(13, 21);
		System.out.println(C2.charge()+ "d");
	}

}
