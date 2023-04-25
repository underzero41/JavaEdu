package Seminar4.Task1;

public class Main {
    public ListNode reverseList(ListNode head){
        ListNode x = null;
        ListNode current = head;
        while (current != null){
            ListNode temp = current.next;
            current.next = x;
            x = current;
            current = temp;
        }
        return  x;
    }
}
