import java.util.Scanner;
public class W1P4_OperSelect{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double r =0;
    double x = sc.nextDouble();
    double y = sc.nextDouble();
    double z = sc.nextDouble();
    try{
      if(z == 1){
        r = x+y;
      }else if(z == 2){
        r = x-y;
      }else if(z == 3){
        r = x*y;
      }else if(z == 4){
        if(y == 0){
          throw new Exception("cannot divide by zero");
        }
        r = x/y;
      }else if(z == 5){
        if(y == 0){
          throw new Exception("cannot divide by zero");
        }
        r = x%y;
      }
      System.out.println(r);
    }catch(Exception e){
      System.out.println(e.getMessage());
    }
  }
}
