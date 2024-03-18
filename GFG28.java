//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class GFG28 {

    // Driver code
    public static void main (String[] args) throws IOException{
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());

        // looping through all testcases
        while(testcases-- > 0){
            String[] element = br.readLine().split(" ");
            int N = Integer.parseInt(element[0]);
            int M = Integer.parseInt(element[1]);
            int arr [] = new int[N];
            int brr [] = new int[M];
            String[] elements = br.readLine().split(" ");
            for(int i=0; i<N; i++)
                arr[i] = Integer.parseInt(elements[i]);

            String[] ele = br.readLine().split(" ");
            for(int i=0; i<M; i++)
                brr[i] = Integer.parseInt(ele[i]);

            int X = Integer.parseInt(br.readLine());

            Solution28 obj = new Solution28();
            ArrayList<Integer> ans;
            ans = obj.printClosest(arr, brr, N, M, X);
            System.out.println(Math.abs(ans.get(0) + ans.get(1) - X));
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution28 {
    // Function for finding maximum and value pair
    public static ArrayList<Integer> printClosest (int arr[], int brr[], int n, int m, int x) {
        // code here
        ArrayList<Integer> result=new ArrayList<>();
        int diff=Integer.MAX_VALUE;
        int res_l=0,res_r=0;
        int l=0,r=m-1;

        while(l<n && r>=0){
            if(Math.abs(arr[l]+brr[r]-x)<diff){
                res_l=l;
                res_r=r;
                diff=Math.abs(arr[l]+brr[r]-x);
            }
            if(arr[l]+brr[r]>x)
                r--;
            else
                l++;
        }
        result.add(arr[res_l]);
        result.add(brr[res_r]);

        return result;
    }
}