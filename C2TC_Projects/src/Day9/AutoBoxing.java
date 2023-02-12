package Day9;

public class AutoBoxing {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=58;
		Integer d = a;
		Integer b = Integer.valueOf(a);
		Integer c = b;
		char e ='a';
		Character f = Character.valueOf(e);
		Character g = e;
		System.out.println("Int value is : "+a);
		System.out.println("Integer value is : "+b);
		System.out.println("Char value is : "+e);
		System.out.println("Character value is : "+f);
	}
}