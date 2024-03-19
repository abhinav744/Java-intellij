//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
class GfG30
{
    public static void main (String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0)
        {
            int l = sc.nextInt();
            int n = sc.nextInt();

            int arr[] =  new int[l];

            for(int i = 0;i<l;i++)
                arr[i] = sc.nextInt();

            Solution30 ob = new Solution30();

            if(ob.findPair(arr, l, n)==true)
                System.out.println(1);

            else
                System.out.println(-1);

        }

    }
}
// } Driver Code Ends


//User function Template for Java

class Solution30
{
    public boolean findPair(int arr[], int size, int n)
    {
        //code here.
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<size;i++){
            if(set.contains(arr[i]-n) || set.contains(arr[i]+n)){
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }
}