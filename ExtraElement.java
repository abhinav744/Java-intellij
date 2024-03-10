//{ Driver Code Starts
import java.util.*;
class ExtraElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n - 1];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            for (int i = 0; i < n - 1; i++) b[i] = sc.nextInt();
            Solution22 g = new Solution22();
            System.out.println(g.findExtra(a, b, n));
        }
    }
}
// } Driver Code Ends


/*Complete the function below*/
class Solution22 {
    public int findExtra(int a[], int b[], int n) {
        for (int i = 0; i < n; i++) {
            if (i >= b.length || a[i] != b[i]) {
                return i;
            }
        }
        return n - 1; // If no extra element found, return the last index
    }
}
