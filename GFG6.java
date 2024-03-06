//{ Driver Code Starts
//Initial Template for Java

import java.util.Arrays;
import java.util.Scanner;


class GFG6 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a[] = new int[n];

            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }

            Solution6 obj = new Solution6();

            System.out.println(obj.Maximize(a,n));
        }

    }
}

// } Driver Code Ends


//User function Template for Java


class Solution6{

    int Maximize(int arr[], int n)
    {
        // Complete the function
        int mod = 1000000007;
        Arrays.sort(arr);
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum = (sum + ((long)arr[i] * i) % mod) % mod;
        }
        return (int)sum;
    }
}

