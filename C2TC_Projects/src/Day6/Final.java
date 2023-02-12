package Day6;

public class Final {
	final int a = 20;
	void a() {
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Final f =new Final();
		//a=22;             This cannot be done because a is declared as final
		f.a();
	}

}
