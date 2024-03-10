//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class Main2 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution23().countZeroes(arr, n);
            System.out.println(ans);
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution23 {
    int countZeroes(int[] arr, int n) {
        // code here
        HashMap <Integer,Integer> countMap=new HashMap<>();
        int countOne=0;

        for(int i=0;i<n;i++){
            if(arr[i]==1){
                countOne++;
            }else{
                countMap.put(i, countOne);
            }
        }
        return n-countOne;
    }

}
