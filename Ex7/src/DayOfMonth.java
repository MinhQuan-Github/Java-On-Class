// So ngay trong 1 thang
public class DayOfMonth {
	int thang ;
	int nam;
	
	public DayOfMonth(int thang , int nam) {
		this.thang = thang;
		this.nam   = nam;
	}
	
	public static boolean namNhuan(int nam) {
		if (nam % 4 == 0 && nam % 100 != 0 || nam % 400 == 0) {
			return true;
		}
		return false;
	}
	
	public int dayOfMonth() {
		if (this.thang == 1 || 
			this.thang == 3 || 
			this.thang == 5 || 
			this.thang == 7 || 
			this.thang == 8 || 
			this.thang == 10|| 
			this.thang == 12) {
			return 31;
		} else if (this.thang == 2) {
			if (namNhuan(this.nam)) return 29;
			else return 28;
		} else return 30;
	}
	
	public static void main(String[] args) {
		DayOfMonth DOM1 = new DayOfMonth(2, 2000);
		DayOfMonth DOM2 = new DayOfMonth(2, 2004);
		DayOfMonth DOM3 = new DayOfMonth(2, 2022);
		System.out.println(DOM1.dayOfMonth());
		System.out.println(DOM2.dayOfMonth());
		System.out.println(DOM3.dayOfMonth());
	}

}
