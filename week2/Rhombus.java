import java.util.Scanner;
public class Rhombus{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i,j;
		int n = sc.nextInt();
		n = n/2;
		for(i=0;i<n;i++){
			for(j=0;j<n-i;j++){
				System.out.print(" ");
			}
			for(j=0;j<i*2+1;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
		for(i=0;i<=n;i++){
			for(j=0;j<i;j++){
				System.out.print(" ");
			}
			for(j=0;j<(n-i)*2+1;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
