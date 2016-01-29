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
public class ReverseString {
     static String reverse = "";
     
     public static void main(String [] args){
         
         System.out.println(reverseString("ranj"));
     }
    
    public static String reverseString( String str){
        
       if(str.length() > 0){
         reverse = reverse + str.charAt(str.length() -1);
         reverseString(str.substring(0,str.length() -1));   
       }
        
        return reverse;
    }
}
