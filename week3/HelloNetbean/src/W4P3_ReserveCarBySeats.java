
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
public class W4P3_ReserveCarBySeats {
    public static int filterCar(Car[] cars,int length,int need) throws Exception{
        int sPtr = -1,i;
        for(i=0;i<length;i++){
            if(cars[i].getCapcity() >= need){
                if(sPtr == -1){
                    sPtr = i;
                }else if(cars[sPtr].getCapcity() > cars[i].getCapcity()){
                    sPtr = i;
                }else if(cars[sPtr].getCapcity() == cars[i].getCapcity() && cars[sPtr].getStorage() > cars[i].getStorage()){
                    sPtr = i;
                }
            }
        }
        if(sPtr == -1){
            throw new Exception("sorry");
        }
        return sPtr;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int taskCount,carCount,i,ptr,input,input2;
        taskCount = sc.nextInt();
        carCount = sc.nextInt();
        Car[] cars = new Car[carCount];
        for(i = 0; i<carCount;i++){
            cars[i] = new Car();
            cars[i].setNumber(i+1);
            cars[i].setCapacity(sc.nextInt());
        }
        for(i = 0;i<taskCount;i++){
            try{
                input = sc.nextInt();
                input2 = sc.nextInt();
                ptr = filterCar(cars,carCount,input);
                cars[ptr].add(input2);
                System.out.println(ptr+1);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
class Car{
    private int number;
    private int storage;
    private int capacity;
    Car(){
        number = 0;
        storage = 0;
        capacity = 0;
    }
    public int getNumber(){
        return this.number;
    }
    public int getStorage(){
        return this.storage;
    }
    public void setNumber(int n){
        this.number = n;
    }
    public void add(int n){
        this.storage += n;
    }
    public void setCapacity(int n){
        this.capacity = n;
    }
    public int getCapcity(){
        return this.capacity;
    }
}