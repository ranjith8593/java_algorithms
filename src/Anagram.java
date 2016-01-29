/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ranjith Ramesh
 */
public class Anagram {
    
    public static void main(String[] args){
        
        String one = "debit";
        String two = "bad credit";
        char [] a = one.toCharArray();
        char [] b = two.toCharArray();
        
        checkAnagram(a,b);
        
       
    }
    
    public static void checkAnagram ( char[] a, char [] b){
        
        int counter = 0;
        int counter2 = 0;
        int val1;
        int val2;
        
        if( a.length != b.length){
            System.out.println("not an anagram");
        }
        
        for(int i=0;i<a.length ;i++){
            val1 = 'a' - a[i];
            counter |= (1 << val1);
            val2 = 'a' - b[i];
            counter2 |= (1 << val2) ;
            
        }
        
        if(counter == counter2){
            System.out.println("it is an anagram");
        }
    }
}
