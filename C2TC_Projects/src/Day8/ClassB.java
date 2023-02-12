package Day8;

public class ClassB extends ClassA{
	void a() {
		System.out.println("A in class B");
	}
	void b() {
		System.out.println("B in class B");
	}
	void c() {
		System.out.println("C in class B");
	}
	void d() {
		System.out.println("D in class B");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassB b = new ClassB();
		b.a();
		b.b();
		b.c();
		b.d();
	}

}
