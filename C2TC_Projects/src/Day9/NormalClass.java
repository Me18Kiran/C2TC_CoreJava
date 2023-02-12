package Day9;

public class NormalClass extends AbstractClass1{
	void hide() {
		System.out.println("Abstract Method1");
	}
	void hide2() {
		System.out.println("Abstract Method2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NormalClass n = new NormalClass();
		n.hide();
		n.hide2();
		n.show();
	}
}
