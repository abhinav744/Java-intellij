//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.util.*;

class Driverclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int k = sc.nextInt();

            System.out.println(new Solution24().countOccurence(arr, n, k));
        }
    }
}

// } Driver Code Ends


class Solution24
{
    //Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int n, int k)
    {
        // your code here,return the answer
        HashMap<Integer,Integer> freqMap=new HashMap<>();
        for(int num : arr){
            freqMap.put(num, freqMap.getOrDefault(num,0)+1);
        }
        int threshold=n/k;
        int count=0;
        for(int freq : freqMap.values()){
            if(freq>threshold){
                count++;
            }
        }
        return count;
    }
}
