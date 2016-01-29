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
public class RemoveDuplicate {
    
    public static void main(String [] args){
        
        String a = "aaa";
        char [] b = a.toCharArray();
        
        additionaluniqueString(b);
       //System.out.print(AssortedMethods.charArrayToString(b));
        
    }
    
  
    
    public static void removeDuplicates(char[] str) {
		if (str == null) {
			return;
		}
		int len = str.length;
		if (len < 2) {
			return;
		}
		int tail = 1;
		
		for (int i = 1; i < len; ++i) {
			int j;
			for (j = 0; j < tail; ++j){
				if (str[i] == str[j]) {
					break;
				}
                        }
			if (j == tail) {	
				str[tail] = str[i];
				++tail;
			}
		}
		str[tail] = 0;
                
                System.out.println(str);
	} 
    
    public static void additionaluniqueString(char [] str){
        
        boolean [] hit = new boolean[256];
        for(int i =0 ; i < 256 ; i++){
            hit[i] = false;
        }
        hit[str[0]] = true;
        
        int tail = 1;
        
        for(int i=0;i<str.length;i++){
            
            if(!hit[str[i]]){
                
                hit[str[i]] = true;
                str[tail] = str[i];
                ++tail;
            }
        }
        
        str[--tail] = 0;
        System.out.println(str);
    }
    
    
}
