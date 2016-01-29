/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg150coding;

import java.util.Scanner;

/**
 *
 * @author Ranjith Ramesh
 */
public class primeNumber {
    
    
    public static void main(String [] args){
        
        Boolean ch = check();
        if(ch){
            
            System.out.println("prime");
        }
        else
            System.out.println("not prime");
        
    }
    
    public static boolean check()
    {
        
        Scanner in = new Scanner(System.in);
        int ip ;
        System.out.println("enter the number: ");
        ip = in.nextInt();
        
        for( int i =2 ; i < ip/2; i++){
            
            if ( ip % i == 0){
                
                return false;
            }
            
            
        }
        
        return true;
    }
    
}
