
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
public class W5P3_DualEvents {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int e1 = sc.nextInt(),e2=sc.nextInt(),t,b1 = 0,b2 = 0,i=1;
        boolean a1 = false,a2 = false;
        while(a1 == false || a2 == false){
            t = sc.nextInt();
            if(e1 == t && !a1){
                a1 = true;
                b1 = i;
            }
            if(e2 == t && !a2){
                a2 = true;
                b2 = i;
            }
            i++;
        }
        System.out.println(""+b1+" "+b2);
    }
}
