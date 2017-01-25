import java.util.Scanner;
public class ForwardBackwordPrint{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] box = new int[n];
    for(int i = 0;i<n;i++){
      box[i] = sc.nextInt();
    }
    int s = sc.nextInt();
    if(s>0){
      for(int i=0;i<n;i++){
        System.out.print((box[i]+s)+" ");
      }
    }else{
      for(int i=n-1;i>=0;i--){
        System.out.print((box[i]+s)+" ");
      }
    }
  }
}
