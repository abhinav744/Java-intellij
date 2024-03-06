//{ Driver Code Starts
import java.util.*;

class Node5
{

    int data;
    Node5 next;

    Node5(int d)
    {
        data = d;
        next = null;
    }

    @Override
    public String toString() {
        return "Node5{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}


public class LinkedList
{



    /* Function to print linked list */
    public static void print(Node5 root)
    {
        Node5 temp = root;
        while(temp!=null)
        {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }


    /* Driver program to test above functions */
    public static void main(String args[])
    {

        /* Constructed Linked List is 1.2.3.4.5.6.
         7.8.8.9.null */
        int value;
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0 && sc.hasNextInt() )
        {
            int n = sc.nextInt();

            //int n=Integer.parseInt(br.readLine());
            int a1 = sc.nextInt();
            Node5 head = new Node5(a1);
            Node5 tail = head;

            for (int i = 1; i < n && sc.hasNextInt() ; i++)
            {
                int a = sc.nextInt();
                tail.next = new Node5(a);
                tail = tail.next;
            }


            Node5 result = new Solution18().compute(head);
            print(result);
            System.out.println();
            t--;
        }
    }
}
// } Driver Code Ends


/*
class Node {
   int data;
   Node next;

  Node(int data) {
      this.data = data;
  }
}
*/
class Solution18 {
    Node5 compute(Node5 head) {
        if (head == null || head.next == null)
            return head;

        Node5 prev = null;
        Node5 curr = head;
        Node5 nextNode;
        while (curr != null) {
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        head = prev;

        Node5 maxNode = head;
        curr = head;
        while (curr != null && curr.next != null) {
            if (curr.next.data < maxNode.data) {
                curr.next = curr.next.next;
            } else {
                maxNode = curr.next;
                curr = curr.next;
            }
        }

        prev = null;
        curr = head;
        while (curr != null) {
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        head = prev;

        return head;
    }
}

  