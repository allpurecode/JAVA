
/*import java.util.*;
public class ListNode {
    int val;
    ListNode next;
    ListNode(int val,ListNode next){
        this.val=val;
        this.next=next;   // Constructor with two parameters
    }
    ListNode(int val){
        this.val=val;
    }
    ListNode(){

    }

    public ListNode removeElement(ListNode head,int val){
        ListNode dummy =new ListNode(0);
        dummy.next=head;
        ListNode current =dummy;

        while(current.next!=null){
            if(current.next.val==val){
                current.next=current.next.next;
            }else{
                current=current.next;
            }
        }
        return dummy.next;
    }
    public static void main(String args[]){
        ListNode head=null;
        ListNode tail=null;
        int i=1,val=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of nodes");
        int n =sc.nextInt();
        while(i<=n){
            System.out.println("Enter node val: ");
            val=sc.nextInt();
            ListNode node=new ListNode(val);
            if(i==1){
                head=node;
                tail=node;}
            else{
                tail.next=node;
                tail=tail.next;
            }
            i++;
        }
        System.out.println("enter node val you want to delete:");
        val=sc.nextInt();


        ListNode obj=new ListNode();
        head=obj.removeElement(head,val);
        while(head!=null){
            System.out.print(head.val +"-->");
            head=head.next;
        }
        System.out.println("x");
    }
}
*/

/*import java.util.Scanner;

public class ListNode {
    int val;
    ListNode next;

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;   // Constructor with two parameters
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode() {

    }

    public ListNode ReverseLinkedlist(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode temp;
        while (curr != null) {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }

    public static void main(String args[]) {
        ListNode head = null;
        ListNode tail = null;
        int i = 1, val = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of nodes");
        int n = sc.nextInt();
        while (i <= n) {
            System.out.println("Enter node val: ");
            val = sc.nextInt();
            ListNode node = new ListNode(val);
            if (i == 1) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                tail = tail.next;
            }
            i++;
        }
        System.out.println("enter node val you want to delete:");
        val = sc.nextInt();


        ListNode obj = new ListNode();
        head = obj.ReverseLinkedlist(head);
        while (head != null) {
            System.out.print(head.val + "-->");
            head = head.next;
        }
        System.out.println("x");
    }


}
*/

import java.util.List;
/*import java.util.Scanner;

public class ListNode {
    int val;
    ListNode next;

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;   // Constructor with two parameters
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode() {

    }

    public ListNode SecondMiddle(ListNode head) {
        ListNode slow=head;
        ListNode fast =head;
        while(fast!=null&& fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public static void main(String args[]) {
        ListNode head = null;
        ListNode tail = null;
        int i = 1, val = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of nodes");
        int n = sc.nextInt();
        while (i <= n) {
            System.out.println("Enter node val: ");
            val = sc.nextInt();
            ListNode node = new ListNode(val);
            if (i == 1) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                tail = tail.next;
            }
            i++;
        }
        System.out.println("enter node val you want to delete:");
        val = sc.nextInt();


        ListNode obj = new ListNode();
        head= obj.SecondMiddle(head);
        while (head != null) {
            System.out.print(head.val + "-->");
            head = head.next;
        }
        System.out.println("x");
    }


}*/

/*import java.util.*;
public class ListNode {
    int val;
    ListNode next;
    ListNode(int val,ListNode next){
        this.val=val;
        this.next=next;   // Constructor with two parameters
    }
    ListNode(int val){
        this.val=val;
    }
    ListNode(){

    }

    public void deleteNode(ListNode node){
        node.val=node.next.val;
        node.next=node.next.next;
    }
    public static void main(String args[]){
        ListNode head=null;
        ListNode tail=null;
        int i=1,val=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of nodes");
        int n =sc.nextInt();
        while(i<=n){
            System.out.println("Enter node val: ");
            val=sc.nextInt();
            ListNode node=new ListNode(val);
            if(i==1){
                head=node;
                tail=node;}
            else{
                tail.next=node;
                tail=tail.next;
            }
            i++;
        }



        ListNode obj=new ListNode();
        head=obj.deleteNode(5);
        while(head!=null){
            System.out.print(head.val +"-->");
            head=head.next;
        }
        System.out.println("x");
    }
}
*/



