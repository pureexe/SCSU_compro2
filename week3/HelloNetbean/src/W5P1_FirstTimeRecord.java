
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
public class W5P1_FirstTimeRecord {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt(),buffer,i = 1;
        boolean isPrint = false;
        while(true){
            buffer = sc.nextInt();
            if(buffer == 0){
                if(!isPrint){
                    System.out.println("target not found");
                }
                return ;
            }else if(buffer == target){
                System.out.println(i);
                return ;
            }
            i++;
        }
    }
}
