
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
public class W3P8_IndexOf {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String cmp = sc.nextLine();
        int index = input.indexOf(cmp);
        if(index == -1){
            System.out.println("string not found");
        }else{
            System.out.println(index +1);
        }
    }
}
