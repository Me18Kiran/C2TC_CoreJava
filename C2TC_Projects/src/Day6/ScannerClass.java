package Day6;
import java.util.Scanner;
public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter an Integer : ");
		int a = s.nextInt();
		System.out.println("Entered Integer is : "+a);
		s.close();
	}

}
