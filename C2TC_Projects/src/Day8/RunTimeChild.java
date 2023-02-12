package Day8;
public class RunTimeChild extends RunTime{
	void a() {
		System.out.println("Method A of Child");
	}
	void b() {
		System.out.println("Method B of Child");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunTime r =new RunTime();
		r.a();    // Upcasting- Means Parent methods are considered not children.
		r.b();
	}
}