//{ Driver Code Starts
//Initial Template for Java

import java.io.*;

class GFG8 {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
                new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();

            Solution8 ob = new Solution8();
            System.out.println(ob.isPalindrome(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution8 {
    int isPalindrome(String S) {
        // code here
        int start=0;
        int end=S.length()-1;
        while(start<end){
            if(S.charAt(start)!=S.charAt(end)){
                return 0;
            }
            start++;
            end--;
        }
        return 1;
    }
}