import java.util.Scanner;
public class SortAscend{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i,j,temp;
    int[] box = new int[n];
    for(i=0;i<n;i++){
      box[i] = sc.nextInt();
    }
    for(i=0;i<n;i++){
      for(j=0;j<n-1;j++){
        if(box[j]<box[j+1]){
          temp = box[j];
          box[j] = box[j+1];
          box[j+1] = temp;
        }
      }
    }
    for(i=0;i<n;i++){
      System.out.print(box[i]+" ");
    }
  }
}
