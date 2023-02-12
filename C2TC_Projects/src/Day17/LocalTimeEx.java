package Day17;
import java.time.LocalTime;
public class LocalTimeEx {
	public static void main(String[] args) {
		LocalTime now = LocalTime.now();
		System.out.println(now);
		LocalTime own = LocalTime.of(12,30,55, 675894);
		System.out.println(own);
		LocalTime plus = now.plusMinutes(40);
		System.out.println(plus);
	}
}