//{ Driver Code Starts
import java.io.*;

class Node2
{
    int data;
    Node2 next;
    Node2(int d)
    {
        data = d;
        next = null;
    }


    @Override
    public String toString() {
        return "Node2{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}



public class LinkedList_Element_From_Last
{
    Node2 head;
    Node2 tail;
    /* Function to print linked list */
    void printList(Node2 head)
    {
        Node2 temp = head;
        while (temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }


    /* Inserts a new Node at front of the list. */
    public void addToTheLast(Node2 node)
    {

        if (head == null)
        {
            head = node;
            tail = node;
        } else
        {
            tail.next = node;
            tail = node;
        }
    }

    /* Drier program to test above functions */
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(in.readLine().trim());

        while(t>0)
        {
            String s[]=in.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            LinkedList_Element_From_Last llist = new LinkedList_Element_From_Last();
            //int n=Integer.parseInt(br.readLine());
            s=in.readLine().trim().split(" ");
            int a1=Integer.parseInt(s[0]);
            Node2 head= new Node2(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++)
            {
                int a = Integer.parseInt(s[i]);
                llist.addToTheLast(new Node2(a));
            }

            //System.out.println(llist.head.data);
            Solution14 g = new Solution14();
            //System.out.println(k);
            System.out.println(g.getNthFromLast(llist.head,k));

            t--;
        }
    }
}




// } Driver Code Ends


/* Structure of node

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class Solution14
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node2 head, int n)
    {
        // Your code here
        if(head==null)
            return -1;

        Node2 slow=head;
        Node2 fast=head;

        for(int i=0;i<n;i++){
            if(fast==null)
                return -1;
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;

        }
        return slow.data;
    }
}