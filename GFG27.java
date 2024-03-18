//{ Driver Code Starts
//Initial Template for Java

import java.io.*;

class GFG27{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int Arr[]= new int[N];
            for(int i = 0; i < N; i++)
                Arr[i] = Integer.parseInt(input_line[i]);
            int k = Integer.parseInt(read.readLine());

            Solution27 ob = new Solution27();
            System.out.println(ob.searchInsertK(Arr, N, k));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution27
{
    static int searchInsertK(int Arr[], int N, int k)
    {
        // code here
        int left=0;
        int right=N-1;

        while(left<=right){
            int mid=left+(right-left)/2;

            if(Arr[mid]==k){
                return mid;
            }else if(Arr[mid]<k){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return left;
    }
}