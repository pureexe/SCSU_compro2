
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
public class W1P5_HowToBreak {
    public static void main(String[] args){
        int i = 0;
        Scanner sc = new Scanner(System.in);
        while(sc.nextInt()!=0){
            i++;
        }
        System.out.println(i);
    }
}
