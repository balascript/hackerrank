package CTCI.DS;

import java.util.Stack;

/**
 * Created by srbkr on 3/13/2017.
 */
public class IsBST {
    //The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
    }

    boolean checkBST(Node root) {
        if(root==null)
            return true;
        Stack<Node> stk= new Stack();
        Node temp=null;
        while(root!=null || !stk.isEmpty()){
            while(root!=null){
                stk.push(root);
                root=root.left;
            }
            root=stk.pop();
            if(temp!=null && temp.data>=root.data){
                return false;
            }

            temp=root;
            root=root.right;
        }

        return true;

    }
}
