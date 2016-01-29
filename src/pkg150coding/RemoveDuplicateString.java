/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg150coding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Ranjith Ramesh
 */
public class RemoveDuplicateString {
    
    
    public static void main(String [] args){
        
        String a = "hello";
        
        
        String [] string = a.split("");
        List <String> li = Arrays.asList(string);
        
        Set <String> set = new HashSet<String> (li);
        
        a = set.toString();
        
        System.out.println(a);
        
    }
    
    
}
