import java.io.*;
import java.util.*;
class Node{
	int data;
	Node next;
	Node(int d){
        data=d;
        next=null;
    }
}
class Solution{

    public static Node removeDuplicates(Node head) {
        //Write your code here
        //taking a copy for actual "reference of the nodes"
        Node rn = head;
        
        //going to check if a node and its next are same. so to do that, we need to make
        //sure they both are not null.
        //i know we are using .next.next which points to the next one but we will deal
        //with it when we get to that
        while(rn != null && rn.next != null){
            //making sure next is not null again coz we are changing next
            while(rn.next != null && rn.data == rn.next.data){
                rn.next = (rn.next).next;
            }
            rn = rn.next;
        }
        
        return head;
    }

	public static  Node insert(Node head,int data){
        Node p=new Node(data);			
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else{
            Node start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(Node head){
        Node start=head;
        while(start!=null){
            System.out.print(start.data+" ");
            start=start.next;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Node head=null;
        int T=sc.nextInt();
        while(T-->0){
            int ele=sc.nextInt();
            head=insert(head,ele);
        }
        head=removeDuplicates(head);
        display(head);
   }
}