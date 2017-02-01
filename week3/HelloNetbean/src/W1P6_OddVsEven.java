
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
public class W1P6_OddVsEven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int odd=0,even=0,box;
        for(int i = 0;i<8;i++){
            box = sc.nextInt();
            if(box%2==0){
                even+=box;
            }else{
                odd+=box;
            }
        }
        if(odd > even){
            System.out.println("odd");
        }else if(odd < even){
            System.out.println("even");
        }else{
            System.out.println("equal");
        }
        System.out.println(even);
        System.out.println(odd);
    }
}
