package CTCI.DS;

/**
 * Created by srbkr on 3/13/2017.
 */
public class DetectCycle {
    /*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as:
*/
    class Node {
        int data;
        Node next;
    }


    boolean hasCycle(Node head) {
        if(head==null)
            return false;
        Node slow= head;
        Node fast= head.next;
        while(fast!=null && fast.next!=null){
            if(slow==fast)
                return true;
            slow=slow.next;
            fast=fast.next.next;
        }
        return false;
    }
}
