// Problem1.java
public class Problem1 {
    public static ListNode concatenate(ListNode l1, ListNode l2) {
        // TODO: Implement the concatenate method
        // This method should concatenate l2 to l1 and return l1
        // Remember to create new nodes instead of directly linking l1 to l2
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        ListNode head = null;
        while(curr1.next != null){
            curr1 = curr1.next;
            if(curr1.next == null){break;}
            //System.out.println(curr1.val);
        }
        while(curr2.next != null){
            if(curr2.next == null){break;}
            curr1.next = new ListNode(curr2.val);
            curr1 = curr1.next;
            curr2 = curr2.next
        }
        return null;

        
        
    }
}