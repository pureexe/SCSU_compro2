
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
public class W3P4_LongestString3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c = 0,b = 0;
        String[] storage = new String[5];
        for(int i = 0;i<5;i++){
            storage[i] = sc.nextLine();
            if(storage[i].length()>=c){
                c = storage[i].length();
                b = i;
            }
        }
        System.out.println(storage[b]);
    }
}
