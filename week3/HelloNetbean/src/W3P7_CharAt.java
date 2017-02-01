
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
public class W3P7_CharAt {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int at = sc.nextInt();
        try{
            System.out.println(input.charAt(at-1));
        }catch(Exception e){
            System.out.println("invalid position");
        }
    }
}
