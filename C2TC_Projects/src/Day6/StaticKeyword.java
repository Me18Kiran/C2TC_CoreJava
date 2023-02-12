package Day6;

public class StaticKeyword {
	int rollno;
	String name;
	static String college = "Mit";
	StaticKeyword(int r, String n){
		rollno = r;
		name =n;
	}
	void display() {
		System.out.println("Roll no is : "+rollno);
		System.out.println("Name is : "+name);
		System.out.println("College name is : "+college);
	}
	static void d() {
		System.out.println("Method D");
	}
	static {
		System.out.println("I am a Static Block");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticKeyword s1 = new StaticKeyword(111,"AAA");
		StaticKeyword s2 = new StaticKeyword(222,"BBB");
		StaticKeyword s3 = new StaticKeyword(333,"CCC");
		s1.display();
		s2.display();
		s3.display();
		System.out.println();
		StaticKeyword.d();
	}

}
