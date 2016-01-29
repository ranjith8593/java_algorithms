/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg150coding;

/**
 *
 * @author Ranjith Ramesh
 */
public class Fibanocci {
    
    
    
    public static void main(String [] args){
        
        //System.out.println(1);
       // System.out.println(1);
        Fibanocci f = new Fibanocci();
       // f.fibanocci(5);
        
        int n = 5;
        
        
        for(int i =1 ; i< n ;i++){
            
            System.out.println(f.fib(i));
        }
        
    }
    
    public int fib(int n){
        
        System.out.println("n:"+n);
        
        if(n==1 || n == 2)
            return 1;
        return fib( n-1)+ fib(n-2);
    }
    
    public void fibanocci(int n){
       
       int num,first,second;
        
        first = 1;
        second = 1;
      for(int i = 3 ; i<= n;i++){
          
           System.out.println("i:"+i);
          num = first + second;
          System.out.println(num);
          first = second;
          second = num;
          
        }
    }
    
}
