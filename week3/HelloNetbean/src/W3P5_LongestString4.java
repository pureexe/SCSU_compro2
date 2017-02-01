
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
public class W3P5_LongestString4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c = 0,b = 0,i=0;
        String[] storage = new String[2000];
        while(true){            
            storage[i] = sc.nextLine();
            if(storage[i].length() == 0){
                break;
            }
            if(storage[i].length()>=c){
                c = storage[i].length();
                b = i;
            }
            i++;
        }
        System.out.println(storage[b]);
    }
}
