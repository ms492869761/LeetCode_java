package leetCode_2;

public class Example {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int add=0;
        ListNode ln=new ListNode(0);
        ListNode next=ln;
        while(l1!=null||l2!=null||add>0) {
            int n1=0;
            int n2=0;
            if(l1!=null) {
                n1=l1.val;
                l1=l1.next;
            }
            if(l2!=null) {
                n2=l2.val;
                l2=l2.next;
            }
            int num=n1+n2+add;
            add=num/10;
            next.next=new ListNode(num%10);
            next=next.next;
        }
        return ln.next;
    }

}

class ListNode{
    int val;
    ListNode next;
    ListNode(int x) { val = x; }

}
