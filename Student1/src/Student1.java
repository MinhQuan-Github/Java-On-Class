
public class Student1 {
	int id;
	String name;
	static String college = "Dai hoc Bach Khoa";

	static void change() {
		college = "DHBK";
	}
	Student1(int id , String name){
		this.id = id;
		this.name = name;
	}
	void display() {
		System.out.println(id + " - " + name + " - " + college);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s1 = new Student1(777,  "Mai Ha");
		Student1 s2 = new Student1(888, "Tue Nhi");
		Student1 s3 = new Student1(999 , "Tue Nghi");
		s1.display();
		s2.display();
		s3.display();
		Student1.change();
		s1.display();
		s2.display();
		s3.display();
	}

}
