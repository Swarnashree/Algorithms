/*
You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order and each of their nodes contain a single digit.
Add the two numbers and return it as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.
Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
*/


/*below solution can be optimized further. Hint: while Loop condition can be changed to p1!=null||p2!=null and make necessary logic changes*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class Solution {

    public static void main(String args[])
    {
      /*write code to create Solution Object and run the method with linkedlists*/
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode p1=l1;
        ListNode p2=l2;
        ListNode res=null;
        ListNode head=null;
        ListNode pointer=null;
        int carry=0;
        int sum=0;
        while(p1!=null&&p2!=null)
        {
            sum=p1.val+p2.val+carry;
            if(sum>9)
                carry=1;
            else 
                carry=0;
            ListNode temp=new ListNode(sum%10);
            if(head==null)
            {    head=temp;
                pointer=temp;
                //System.out.println("head "+head);
            }
            
            else
            {
                pointer.next=temp;
                pointer=pointer.next;
            }
            p1=p1.next;
            p2=p2.next;
        }
        
        ListNode remainder=null;
        if(p1!=null)
        {
            remainder=p1;
          //carry=extraAdd(carry,p1,pointer);  
        }
        
        if(p2!=null)
        {
            remainder=p2;
            //=extraAdd(carry,p2,pointer);
        }
        
        while(remainder!=null)
        {
            sum=remainder.val+carry;
            if(sum>9)
                carry=1;
            else
                carry=0;
            ListNode temporary=new ListNode(sum%10);
            pointer.next=temporary;
            pointer=pointer.next;
            remainder=remainder.next;
        }
        
        if(carry==1)
        {
            ListNode temp=new ListNode(1);
            pointer.next=temp;
        }
        
        /*ListNode iter=head;
        while(iter!=null)
        {
            System.out.println("element "+iter);
            iter=iter.next;
        }*/
        return head;
    }
    
    /*public int extraAdd(int carry,ListNode r,ListNode pointer)
    {
        System.out.println(carry);
        while(r!=null)
        {
            int sum=r.val+carry;
            //System.out.println(sum%10);
            if(sum>9)
                carry=1;
            else
                carry=0;
            ListNode temp=new ListNode(sum%10);
            pointer.next=temp;
            pointer=pointer.next;
            System.out.println("Address "+pointer);

            r=r.next;
        }
        
        return carry;
        
    }*/
}
