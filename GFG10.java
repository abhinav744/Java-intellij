//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;
class GFG10
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();

            Solution10 ob = new Solution10();
            System.out.println(ob.longestSubstrDistinctChars(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution10 {
    static int longestSubstrDistinctChars(String s){
        // code here
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int maxLength = 0, i = 0, j = 0;

        while (i < n && j < n) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                maxLength = Math.max(maxLength, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }

        return maxLength;
    }
}