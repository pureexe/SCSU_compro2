
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
public class W5P2_FirstTilLastTimeRecord {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt(),buffer,i = 1,first = -1,last = 0,count = 0;
        boolean isPrint = false;
        while(true){
            buffer = sc.nextInt();
            if(buffer == 0){
                if(!isPrint){
                    System.out.println("target not found");
                }else{
                    System.out.println(first);
                    System.out.println(last);
                    System.out.println(count);
                }
                return ;
            }else if(buffer == target){
                isPrint = true;
                if(first == -1){
                    first = i;
                }
                last = i;
                count++;
            }
            i++;
        }
    }
}
