//{ Driver Code Starts
//Initial template code for JAVA

import java.util.*;
import java.lang.*;

class Node
{
    int data;
    Node2 next;

    Node(int x)
    {
        data = x;
        next = null;
    }
}

class GFG13
{
    public static void makeLoop(Node2 head, Node2 tail, int x){
        if (x == 0) return;

        Node2 curr = head;
        for(int i=1; i<x; i++)
            curr = curr.next;

        tail.next = curr;
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t--> 0)
        {
            int n = sc.nextInt();

            int num = sc.nextInt();
            Node2 head = new Node2(num);
            Node2 tail = head;

            for(int i=0; i<n-1; i++)
            {
                num = sc.nextInt();
                tail.next = new Node2(num);
                tail = tail.next;
            }

            int pos = sc.nextInt();
            makeLoop(head, tail, pos);

            Solution13 x = new Solution13();
            if( x.detectLoop(head) )
                System.out.println("True");
            else
                System.out.println("False");
        }
    }
}

// } Driver Code Ends


//User function template for JAVA

/* Node is defined as

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

*/


class Solution13 {
    //Function to check if the linked list has a loop.
    public static boolean detectLoop(Node2 head){
        // Add code here
        Node2 slow=head;
        Node2 fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
                return true;
        }
        return false;
    }
}