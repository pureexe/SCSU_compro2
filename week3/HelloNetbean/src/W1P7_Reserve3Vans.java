/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pakkapon
 */

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pakkapon
 */
public class W1P7_Reserve3Vans {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,t;
        int a = 0, b= 0 ,c= 0;
        n = sc.nextInt();
        for(int i=0;i<n;i++){
            t = sc.nextInt();
            if(a <= b && a <=c){
                System.out.println("A");
                a+=t;
            }else if(b <= a && b<=c){
                System.out.println("B");
                b+=t;
            }else{
                System.out.println("C");
                c+=t;
            }
        }
    }   
}

