package Day17;
import java.time.LocalDate;
public class LocalDateEx1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate a = LocalDate.now();
		System.out.println(a);
		LocalDate yesterday = a.minusDays(1);
		System.out.println(yesterday);
		LocalDate lastmonth = a.minusMonths(1);
		System.out.println(lastmonth);
		LocalDate dob = LocalDate.of(1997, 03, 05);
		System.out.println(dob);
	}
}
