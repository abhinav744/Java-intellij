//{ Driver Code Starts
//Initial Template for Java

import java.util.*;

public class GFG26
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0;i < n;i++)
            {
                arr[i] = sc.nextInt();
            }

            Solution26 sol = new Solution26();
            System.out.println(sol.findOnce(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution26
{
    int findOnce(int arr[], int n)
    {
        // Complete this function
        HashMap <Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        for(int key:map.keySet()){
            if(map.get(key)==1){
                return key;
            }
        }
        return -1;
    }
}