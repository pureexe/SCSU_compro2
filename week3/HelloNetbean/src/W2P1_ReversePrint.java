
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
public class W2P1_ReversePrint {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] box = new int[10000];
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            box[i] = sc.nextInt();
        }
        for(int i=n-1;i>=0;i--){
            System.out.print(""+box[i]+" ");
        }
    }
}
