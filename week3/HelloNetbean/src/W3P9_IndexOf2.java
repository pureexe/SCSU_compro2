
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
public class W3P9_IndexOf2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String cut = sc.nextLine();
        int position = 0,newPosition = 0;
        boolean isDo = false,isPrint = false;
        while(true){
            newPosition = input.indexOf(cut,position);
            if(newPosition == -1){
                break;
            }
            System.out.print(""+(newPosition+1)+" ");
            isDo = true;
            position = newPosition+1;
        }
        if(!isDo){
            System.out.println("string not found");
        }
    }
}
