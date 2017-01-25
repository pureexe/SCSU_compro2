import java.util.Scanner;
public class TimeConversation{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int raw = sc.nextInt();
		int hour = raw/3600;
		int minute = raw%3600/60;
		int second = raw%60;
		System.out.println(hour+":"+minute+":"+second);
	}
}
