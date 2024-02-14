
public class Main{
    public static void main(String [] args){


        ListNode head = new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);

        Solution solution= new Solution ();
        ListNode result= solution.removeNthFromEnd(head,2);

        while(result!=null){
            System.out.println(result.val+" ");
            result=result.next;
        }
    }
}

 class Solution {

    public ListNode removeNthFromEnd(ListNode head , int n){
        ListNode leftPointer=head;
        ListNode rightPointer=head;

        //Move right pointer n steps forward
        while (n>0 && rightPointer!=null){
            rightPointer=rightPointer.next;
            n--;
        }


        /*Move the right pointer to the end
        of the list and the left pointer to the right position*/
        while(rightPointer!=null && rightPointer.next!=null){
            leftPointer=leftPointer.next;
            rightPointer=rightPointer.next;

        }

        //Remove the relevant node
        if (leftPointer==head && rightPointer==null){
            return head.next;

        }

    leftPointer.next=leftPointer.next.next;

        return head;
    }
}


/*This class represents linked list nodes.
Each node contains a value (val) and a reference
that points to the next node (next).
 */
class ListNode{
    int val ;
    ListNode next;
    ListNode(int val){
        this.val=val;
    }
}