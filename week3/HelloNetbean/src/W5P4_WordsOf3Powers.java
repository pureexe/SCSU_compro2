
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
public class W5P4_WordsOf3Powers {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int b1 = 0,b2 = 0,b3 = 0,i=1;
        String t;
        boolean a1 = false,a2 = false,a3 = false;
        while(a1 == false || a2 == false || a3 == false){
            t = sc.nextLine();
            if(t.indexOf("Dana") != -1 && !a1){
                a1 = true;
                b1 = i;
            }
            if(t.indexOf("Sila") != -1 && !a2){
                a2 = true;
                b2 = i;
            }
            if(t.indexOf("Bhavana") != -1 && !a3){
                a3 = true;
                b3 = i;
            }
            i++;
        }
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(i - 1);
    }
}
