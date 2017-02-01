
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
public class W3P6_LongestCount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int max=0,len = 0,count = 0;
        while(true){            
            len = sc.nextLine().length();
            if(len == 0){
                break;
            }
            if(len>max){
                max = len;
                count = 1;
            }else if(len == max){
                count++;
            }
        }
        System.out.println(max);
        System.out.println(count);
    }
}
