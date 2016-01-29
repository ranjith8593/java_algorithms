/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg150coding;

import java.lang.*;
import java.util.Arrays;

/**
 *
 * @author Ranjith Ramesh
 */
public class MedianofArray {
    
    public static void main(String[] args){
        
        MedianofArray f = new MedianofArray();
        
        f.medianofArray();
    }
    
    
    public void medianofArray(){
        
        int [] array1 = {1,5,6,8,12,4};
        int [] array2 = {12,2,58,1,3,7};
        int [] array3 = new int [array1.length + array2.length];
        Arrays.sort(array1);
        Arrays.sort(array2);
        
        int i = 0, j = 0; int k = 0;
        while( i < array1.length && j < array2.length){
            
            if( array1[i] > array2[j] ){
                
                array3[k] = array2[j];
                array3[k+1] = array1[i];
                k = k+2;
                
            }
            else{
                array3[k] = array1[i];
                array3[k+1] = array2[j];
                k = k+2;
            }
            
            i++; j++;
        }
        
        for( int x = 0 ; x < array3.length ;  x++){
            
           System.out.println(array3[x]);
        }
        
        
        
        if(array3.length % 2 == 0){
            
            int n = array3.length - 1;
            int median = (n/2 + ((n/2)+1));
            System.out.println("median is"+median);
        }
        
        else {
            
            int n = array3.length;
            int median = ((n+1)/2);
            System.out.println(median);
        }
        
    }
}
