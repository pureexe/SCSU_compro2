
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
public class W2LP2_TargetPrice {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] land = new int[n];
        for(int i = 0;i<n;i++){
            land[i] = sc.nextInt();
        }
        int q = sc.nextInt(),sum = 0,k,m;
        for(int i=0;i<q;i++){
            try{
               sum = 0;
               k = sc.nextInt();
               m = sc.nextInt()-1;
               if(m-k/2<0){
                    for(int j=0;j<=m+k/2;j++){
                        sum+=land[j];
                    }
                    throw new Exception("Out of bound");
               }
               for(int j=m-k/2;j<=m+k/2;j++){
                   sum+=land[j];
               }
               System.out.println(sum);
            }catch(Exception e){
                System.out.println("no "+sum);
            }
        }
    }
}
