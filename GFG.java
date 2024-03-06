//////{ Driver Code Starts
////// Initial Template for Java
////
////import java.io.BufferedReader;
////import java.io.InputStreamReader;
////
////class GFG {
////    // Driver code
////    public static void main(String[] args) throws Exception {
////        BufferedReader br =
////                new BufferedReader(new InputStreamReader(System.in));
////        int t = Integer.parseInt(br.readLine().trim());
////        while (t-- > 0) {
////            int n = Integer.parseInt(br.readLine().trim());
////            String[] str = br.readLine().trim().split(" ");
////            int[] a = new int[n];
////            for (int i = 0; i < n; i++) {
////                a[i] = Integer.parseInt(str[i]);
////            }
////
////            int ans = new Solution().findKRotation(a, n);
////            System.out.println(ans);
////        }
////    }
////}
////
////// } Driver Code Ends
////
////
////// User function Template for Java
////
////class Solution {
////    int findKRotation(int arr[], int n) {
////        // code here
//////        int minimum=arr[0];
//////        int smallest=0;
//////        for(int i=1;i<n;i++){
//////            if(minimum>arr[i]){
//////                minimum=arr[i];
//////                smallest=i;
//////            }
//////        }
//////        return smallest;
////        int minimum=arr[0];
////        int smallest=0;
////        for(int i=1;i<n;i++){
////            if(minimum>arr[i]){
////                minimum=arr[i];
////                smallest=i;
////                break;
////            }
////        }
////        return smallest;
////    }
////}
//
////{ Driver Code Starts
//// Initial Template for Java
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//
//class GFG {
//    // Driver code
//    public static void main(String[] args) throws Exception {
//        BufferedReader br =
//                new BufferedReader(new InputStreamReader(System.in));
//        int t = Integer.parseInt(br.readLine().trim());
//        while (t-- > 0) {
//            int n = Integer.parseInt(br.readLine().trim());
//            String[] str = br.readLine().trim().split(" ");
//            int[] a = new int[n];
//            for (int i = 0; i < n; i++) {
//                a[i] = Integer.parseInt(str[i]);
//            }
//
//            int ans = new Solution().findKRotation(a, n);
//            System.out.println(ans);
//        }
//    }
//}
//
//// } Driver Code Ends
//
//
//// User function Template for Java
//
//class Solution {
//    int findKRotation(int arr[], int n) {
//        int low = 0, high = n - 1;
//
//        // If the array is not rotated, return the first element
//        if (arr[low] <= arr[high])
//            return low;
//
//        while (low <= high) {
//            int mid = low + (high - low) / 2;
//            int next = (mid + 1) % n;
//            int prev = (mid + n - 1) % n;
//
//            // Check if mid is the minimum element
//            if (arr[mid] <= arr[next] && arr[mid] <= arr[prev]) {
//                // Found the minimum element, break the loop
//                return mid;
//            }
//
//            // If mid is not the minimum element, adjust low and high
//            if (arr[mid] <= arr[high])
//                high = mid - 1;
//            else if (arr[mid] >= arr[low])
//                low = mid + 1;
//        }
//
//        // This line should never be reached in a rotated sorted array
//        return -1;
//    }
//}
//{ Driver Code Starts
// Initial Template for Java

import java.io.BufferedReader;
import java.io.InputStreamReader;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int ans = new Solution().findKRotation(a, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int findKRotation(int arr[], int n) {
        int low=0, high=n-1;
        while (low<=high) {
            if (arr[low]<=arr[high])
                return low;
            int mid=(low+high) / 2;
            if (arr[low]<=arr[mid]) {
                if (arr[mid]>arr[mid+1])
                    return mid+1;
                else
                    low=mid+1;
            }
            else{
                if (arr[mid]<arr[mid-1])
                    return mid;
                else
                    high=mid-1;
            }
        }
        return -1;
    }

//    int findKRotation1(int arr[], int n) {
//        int low=0, high=n-1;
//        if (arr[low]<=arr[high])
//            return low;
//        while (low <= high) {
//            int mid=(low+(high-low)/2);
//            System.out.println("Low = " + low + ", High = " + high + ", Mid = " + mid);
//            if (mid-1 >= 0 && arr[mid]<arr[mid-1])
//                return mid;
//            if (mid + 1 < n && arr[mid]>arr[mid+1])
//                return mid + 1;
//            if (arr[low]<=arr[mid])
//                low=mid + 1;
//            else
//                high=mid - 1;
//        }
//        return -1;
    }

