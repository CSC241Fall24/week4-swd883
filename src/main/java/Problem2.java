
public class Problem2 {
    public static ListNode insert(ListNode head, int val, int position) {
        // TODO: Implement the insert method
        // This method should insert a new node with the given value at the specified position
        // If the position is out of bounds, insert the node at the end of the list
        ListNode curr = head;
        if(position == 1){
            ListNode node = new ListNode(val);
            node.next = curr;
            return node;
        }
        for(int i = 2; i<position; i++){
            if(curr.next == null){break;}
            curr = curr.next;
        }
    
        ListNode node = new ListNode(val);
        node.next = curr.next;
        curr.next = node;

        return head;
    }
}
