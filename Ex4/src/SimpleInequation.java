// Giai he phuong trinh bac nhat 
/* 		ax + by = c 
   		dx + ey = f
*/
public class SimpleInequation {
	public void solve (double a1 , double b1 , double c1 , double a2 , double b2 , double c2) {
		double D  = a1 * b2 - a2 * b1;
		double Dx = c1 * b2 - c2 * b1;
		double Dy = a1 * c2 - a2 * c1;
		if (D != 0) {
			double x = Dx/D;
			double y = Dy/D;
			System.out.println("He phuong trinh co nghiem duy nhat (x,y) = (" + x + "," + y +")" );
		} else {
			if (Dx != 0 || Dy != 0) {
				System.out.println("Can't solve");
			} else {
				System.out.println("Infinite solutions");
			}
		}
	}

	public static void main(String[] args) {
		SimpleInequation SI = new SimpleInequation();
		SI.solve(1, 1, 5, 1, -2, -4);
		SI.solve(1, 1, 2, 2, 2, 4);
		SI.solve(2, 3, 5, 2, 3, 1);

	}

}
