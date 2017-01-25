import java.util.Scanner;
public class SixOddNumbers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int input = sc.nextInt();
		while(i<6){
			input++;
			if(input%2 == 1){
				System.out.println(input);
				i++;
			}
		}
	}
}
