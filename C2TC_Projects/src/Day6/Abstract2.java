package Day6;

public class Abstract2 extends Abstract{
	void a() {
		System.out.println("method A");
	}
	void b() {
		System.out.println("method B");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstract2 obj = new Abstract2();	
		obj.a();
		obj.b();
		obj.c();
	}

}
