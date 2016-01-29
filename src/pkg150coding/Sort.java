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
public class Sort {
    
      static int [] arr = {5,9,-1,6,2};
    
    public static void main(String [] args){
        
       //bubbleSort(); 
       //selectionsort();
        insertionsort();
       printarray();
       
       
    
        
    }
    
    public static void bubbleSort(){
        
        for(int i = arr.length - 1 ; i > 0 ; i--){
            
            for(int j = 0 ; j < i ; j++){
                
                if(arr[j]>arr[j+1]){
                    swap(j , j+1);  
                     //printarray();
                }
            }
        }
        
        
    }
    
    public static void selectionsort(){
        
        
        
        for(int i = 0 ; i < arr.length ; i++){
            
            int min = i;
            for( int j = i ; j < arr.length ; j++){
                
                if(arr[min] > arr[j]){
                    min = j;
                    //System.out.println(min);
                    
                }
            }
            
            swap(i,min);
            //printarray();
            
        }
    }
    
    public static void insertionsort(){
        int j =0;
        int key = 0;
        for(int i =1;i<arr.length;i++){
            key = arr[i];
            j = i-1;
            
            while(j>=0 && arr[j]>key){
            arr[j+1] = arr[j];
            j--;
        }
            arr[j+1] = key;
        }
    }
    
    public static void  swap(int i , int j){
        
        
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp; 
        
    }
    
    public static void printarray(){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i]);
        }
        
        
    }
    
}
