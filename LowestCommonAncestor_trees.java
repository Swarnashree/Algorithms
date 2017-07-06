/*
You are given pointer to the root of the binary search tree and two values v1 and v2. You need to return the lowest common ancestor (LCA) of v1 and v2 in the binary search tree. You only need to complete the function.

*/


/* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

static Node lca(Node root,int v1,int v2)
    {
        
        if((v1<root.data&&v2>root.data)||(v1>root.data&&v2<root.data)||(v1==root.data)||v2==root.data)
                 return root;
        else
        {
            if(v1<root.data&&v2<root.data)
            {   
                return lca(root.left,v1,v2);
            }
            
            else
            {
                
                return lca(root.right,v1,v2);
            }
        }
    }




