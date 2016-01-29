/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ranjith Ramesh
 */
public class MaxString {
    
    public static void main(String [] args){
        
        System.out.println(findMaxString("aaab"));
    }
 
    public static char findMaxString(String str){
        
        char [] strchar = str.toCharArray();
        int count = 0;
        int max = 0;
        int index = 0;
        int j;
        
        for(int i =0;i< strchar.length ;i++){
            count = 0;
            for( j=0 ;j< strchar.length;j++){
                if(strchar[i] == strchar[j]){
                    count++;
                }     
            }
            System.out.println(count);
            if(count > max){
                    max = count;
                    index = i;
                } 
        }
        
        return strchar[index ];
    }
}
