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
public class JavaUniqueString {
    
    public static void main(String [] args){
        
        System.out.println("unique char ??:" + isUniqueString("aabcde"));
       
    }
    
    public static boolean isUniqueString(String input_string){
        
        int checker = 0;
        for(int i = 0 ; i < input_string.length();i++){
            
            
            int val = input_string.charAt(i) - 'a';
            if((checker & (1 << val)) > 0){
                return false;
                
            }
                
            checker |= (1 << val);
        }
       
     return true;
    }
    
}
