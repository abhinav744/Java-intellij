//{ Driver Code Starts
// Initial Template for Java

import java.io.*;

class GFG3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = Integer.parseInt(str[i]);
            String[] xy = br.readLine().trim().split(" ");
            int x = Integer.parseInt(xy[0]);
            int y = Integer.parseInt(xy[1]);
            Solution3 g = new Solution3();
            System.out.println(g.minDist(a, n, x, y));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution3 {
    int minDist(int a[], int n, int x, int y) {
        // code here
        int ans=Integer.MAX_VALUE,left=-1,right=-1;
        for(int i=0;i<n;i++){
            if(a[i]==x){
                left=i;
            }
            if(a[i]==y){
                right=i;
            }
            if(left!=-1&&right!=-1){
                ans=Math.min(ans,Math.abs(left-right));
            }
        }
        if(ans==Integer.MAX_VALUE){
            return -1;
        }
        return ans;
    }
}