/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_01;

/**
 *
 * @author PC MSI
 */
public class Baitap1 {
    public static boolean IsPrime(int n){
        if(n<1){
            return false;
        }
        for(int i=2; i<Math.sqrt(i);i++){
            if(n%2 ==0)
                return false;
        }
        return true;
    }
    public static boolean Oddnumber(int n){
        return n%2 != 0;
    }
    
    

    public static void main(String[] args) {
        int a =8;
        int b =6;
        int n = 0;
        if(IsPrime(n)== true){
            System.out.println("This is prime number"+a );
        }else{
            System.out.println("Not prime number"+a);
        }
           
        if(Oddnumber(n)== true){
            System.out.println("this is odd number"+b);
        }else{
            System.out.println("not odd number"+b);
        }
    }
    
}
