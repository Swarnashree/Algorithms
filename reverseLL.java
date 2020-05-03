//Given a linked list, write a function to reverse every k nodes (where k is an input to the function).
//Input: 1->2->3->4->5->6->7->8->NULL, K = 3
//Output: 3->2->1->6->5->4->8->7->NULL
//
//Input: 1->2->3->4->5->6->7->8->NULL, K = 5
//Output: 5->4->3->2->1->8->7->6->NULL

public class reverseLL {


    public static void main(String args[]) {
        LL ll = new LL();
        for (int i = 1; i <= 800; i++) {
            ll.insertNode(i);
        }

        //ll.traverseLL();
        ll.head = reverseLL(ll.head);
        ll.traverseLL();

        //ll.head = reverseSet(ll.head,4);
        //ll.traverseLL();

    }

//

    public static LLNode reverseLL(LLNode head) {

        if (head == null || head.next == null)
            return head;
        LLNode rest = reverseLL(head.next);
        head.next.next = head;
        head.next  = null;
        return rest;

    }



    public static LLNode reverseSet(LLNode head, int setSize) {
        int count = 0;
        LLNode setHead = head;
        LLNode newHead = null;
        LLNode temp = head;
        LLNode previousTail = null;
        while (temp != null) {
            count++;
            if (count == 1) {
                setHead = temp;
                temp = temp.next;
            }
            else{
                if (count == setSize || temp.next == null ) {
                    LLNode temptemp = temp.next;
                    temp.next = null;
                    if (previousTail != null) {
                        previousTail.next = reverseLL(setHead);
                    }
                    else
                    {
                        newHead = reverseLL(setHead);
                    }
                    previousTail = setHead;
                    temp = temptemp;
                    count = 0;

                }
                else
                    temp = temp.next;
            }
        }
        return newHead;
    }
}

