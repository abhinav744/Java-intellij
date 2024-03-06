//{ Driver Code Starts
import java.util.*;
import java.io.*;

class Node3 {
    int data;
    Node3 next;

    Node3(int x){
        data = x;
        next = null;
    }

    @Override
    public String toString() {
        return "{" + data + next + '}';
    }
}
class GFG15{
    static void printList(Node3 node)
    {
        while (node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0){

            int n = sc.nextInt();

            Node3 head = new Node3(sc.nextInt());
            Node3 tail = head;

            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node3(sc.nextInt());
                tail = tail.next;
            }

            Solution15 ob = new Solution15();
            head = ob.reverseList(head);
            printList(head);
            t--;
        }
    }
}

// } Driver Code Ends


//function Template for Java

/* linked list node class:

class Node {
    int data;
    Node next;
    Node(int value) {
        this.value = value;
    }
}

*/

class Solution15
{
    //Function to reverse a linked list.
    Node3 reverseList(Node3 head)
    {
        // code here
        Node3 prev=null;
        Node3 current=head;
        Node3 nextNode=null;

        while(current!=null){
            nextNode=current.next;
            current.next=prev;
            prev=current;
            current=nextNode;
        }
        head=prev;
        return head;
    }
}
