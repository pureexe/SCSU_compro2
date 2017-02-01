
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
public class W3P2_LongestString1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c = 0,b = 0;
        for(int i = 0;i<5;i++){
            b = sc.nextLine().length();
            if(b>c){
                c = b;
            }
        }
        System.out.println(c);
    }
}
