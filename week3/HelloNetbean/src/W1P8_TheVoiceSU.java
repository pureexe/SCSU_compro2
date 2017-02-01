
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
public class W1P8_TheVoiceSU {
    public static void main(String[] args){
        int n,k,a=0,b=0,x,y,z;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        for(int i=1;i<=n;i++){
            x = sc.nextInt();
            y = sc.nextInt();
            z = sc.nextInt();
            if(y > 8 && z > 8){
                if(x == 1){
                   if(a<k){
                        System.out.println(i+" 1");
                        a++;
                   }else if(b < k){
                        System.out.println(i+" 2");
                        b++;
                   }
                }else{
                   if(b<k){
                        System.out.println(i+" 2");
                        b++;
                   }else if(a < k){
                        System.out.println(i+" 1");
                        a++;
                   }                    
                }
            }else if(y > 8 && a < k){
                System.out.println(i+" 1");
                a++;
            }else if(z > 8 && b < k){
                System.out.println(i+" 2");
                b++;
            }
        }
    }
}
