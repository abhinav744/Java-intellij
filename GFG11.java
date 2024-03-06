//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG11 {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
                new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();

            Solution11 ob = new Solution11();
            String result = ob.removeDups(s);

            System.out.println(result);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution11 {
    String removeDups(String S) {
        // code here
        LinkedHashSet<Character> seen=new LinkedHashSet<>();
        StringBuilder result=new StringBuilder();
        for(int i=0;i<S.length();i++){
            char ch=S.charAt(i);
            if(!seen.contains(ch)){
                seen.add(ch);
                result.append(ch);
            }
        }
        return result.toString();
    }
}