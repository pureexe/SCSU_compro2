
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pakkapon
 */
public class W1P4_OperSelect {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b,c,sum = 0;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        try{
            if(c == 1){
                sum = a+b;
            }else if(c == 2){
                sum = a-b;
            }else if(c == 3){
                sum = a*b;
            }else if(c == 4){
                if(b == 0){
                    throw new Exception("cannot divide by zero");
                }
                sum = a/b;
            }else{
               if(b == 0){
                    throw new Exception("cannot divide by zero");
                }
                sum = a%b;
            }
            System.out.println(sum);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
