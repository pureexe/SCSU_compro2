
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
public class W4P4_Cat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int taskCount = sc.nextInt();
        String buffer;
        buffer = sc.nextLine(); // Clear Enter
        for(int i = 0 ;i <taskCount;i++){
            buffer = sc.nextLine();
            if(buffer.indexOf("meow") != -1){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }

}
