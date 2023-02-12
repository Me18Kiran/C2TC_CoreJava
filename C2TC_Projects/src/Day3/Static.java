package Day3;

public class Static {
	static int a = 5;
	static double b = 10.5;
	static void method() {
		int a = 23;
		System.out.println("Method value is : "+a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method();
		System.out.println("The Integer is : "+a);
		System.out.println("The Decimal is : "+b);
		a = 22;
		System.out.println("Modified Integer is : "+a);
	}

}
