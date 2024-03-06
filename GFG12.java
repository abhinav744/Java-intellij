//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.util.*;

class GFG12 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Solution12 obj = new Solution12();
            System.out.println(obj.reverse(sc.next()));
        }
    }
}

// } Driver Code Ends


class Solution12 {

    public String reverse(String S){
        //code here
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<S.length();i++){
            stack.push(S.charAt(i));
        }
        StringBuilder reverse=new StringBuilder();
        while(!stack.isEmpty()){
            reverse.append(stack.pop());
        }
        return reverse.toString();
    }

}