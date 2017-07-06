/*
For the purposes of this challenge, we define a binary tree to be a binary search tree with the following ordering requirements:

The  value of every node in a node's left subtree is less than the data value of that node.
The  value of every node in a node's right subtree is greater than the data value of that node.
Given the root node of a binary tree, can you determine if it's also a binary search tree?

Complete the function in your editor below, which has  parameter: a pointer to the root of a binary tree. It must return a boolean denoting whether or not the binary tree is a binary search tree. You may have to write one or more helper functions to complete this challenge.
*/



/*
The Node class is defined as follows:
    class Node {
    int data;
    Node left;
    Node right;
     }
*/
    boolean checkBST(Node root) {
        
        return helper(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
       
    }

    boolean helper(Node root,int min, int max)
    {
        if(root==null)
            return true;
        if(root.data<min||root.data>max)
            return false;
        else
        {
            return (helper(root.left,min,root.data-1)&&helper(root.right,root.data+1,max));
        }
    }
