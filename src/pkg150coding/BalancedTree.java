/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg150coding;

import utilitypackage.TreeNode;

/**
 *
 * @author Ranjith Ramesh
 * 
 * 
 */

public class BalancedTree {
    
    
        
        
        public static int maxdepth( TreeNode node){
            
            if ( node == null)
                return 0;
            else
                return 1+ Math.max( maxdepth(node.left) , maxdepth(node.right));
            
            
        }
        
        public static int mindepth(TreeNode node){
            
            if(node == null)
                return 0;
            
            else
                return 1+ Math.min(mindepth(node.left), mindepth(node.right));
        }
        
        public static boolean isBalance(TreeNode root){
            
            return (maxdepth(root) - mindepth(root) <= 1);
        }
        
       public static void main(String [] args){
           
          int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
          
         TreeNode n = TreeNode.createTree(array);
          
          if(isBalance(n)){
              
              System.out.println("balanced");
          }
          
          else{
              System.out.println(" not balanced");
          }
          
       }
        
        
        
    
    
}


    

