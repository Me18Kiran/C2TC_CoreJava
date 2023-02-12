package Day3;

public class oop {
	int a = 5;
	int b = 10;
	double c = 11.1;
	void MethodA() {
		System.out.println("Method A");
	}
	void MethodB() {
		System.out.println("Method B");
	}
	void MethodC() {
		System.out.println("Method C");
	}
	void MethodD() {
		System.out.println("Method D");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		oop obj1 = new oop();
		oop obj2 = new oop();
		oop obj3 = new oop();
		obj1.MethodA();
		obj1.MethodB();
		obj1.MethodC();
		obj1.MethodD();
		obj2.MethodA();
		obj2.MethodC();
		obj3.MethodD();
		obj3.MethodB();
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		System.out.println(obj2.b);
		System.out.println(obj3.c);
	}

}
