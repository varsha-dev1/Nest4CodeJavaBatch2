import java.util.Scanner;
public class SecondsToTime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the time in seconds:");
		int num = sc.nextInt();
		int day = num/(60*60*24);
		int hour = (num/(60*60))-(day*24);
		int min = (num/60)-((hour*60)+(day*24*60));
		int sec = (num)-((min*60)+(hour*60*60)+(day*24*60*60));
		System.out.println(day+" Days  "+hour+" Hours  "+min+" Minutes  "+sec+" Seconds");
		sc.close();
	}
}
