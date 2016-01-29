/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitypackage;

/**
 *
 * @author Ranjith Ramesh
 */
public class TreeNode {
    
    public TreeNode left;
    public TreeNode right;
    public TreeNode parent;
    public int data;
    
    public  TreeNode(int data){
        
      data = this.data;
    }
    
    public void setLeftnode(TreeNode left){
        this.left = left;
        if(left != null){
        left.parent = this;
        }
    }
    
    public void setRightnode (TreeNode right){
        
        this.right = right;
        
        if(right != null){
           right.parent = this; 
        }
        
    }
    
     public static TreeNode addToTree(int [] array  , int start , int end){
            
            if (end < start) {
		
                return null;
                
            }
         
            int mid = (start + end )/ 2;
            
            TreeNode n = new TreeNode(array[mid]);
            
            n.setLeftnode(addToTree(array , start , mid -1));
            n.setRightnode(addToTree(array,mid+1, end));
            
            return n;
            
            
            
        }
        public static TreeNode createTree(int array[]){
            
            return addToTree( array , 0 , array.length - 1);
            
            
        }
        
        
    
}
