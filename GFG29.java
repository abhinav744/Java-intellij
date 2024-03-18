//{ Driver Code Starts
import java.io.*;
import java.lang.*;

class GFG29
{

    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());

            int arr[] = new int[n];

            String st[] = read.readLine().trim().split("\\s+");

            for(int i = 0; i < n; i++)
                arr[(int)i] = Integer.parseInt(st[(int)i]);


            System.out.println(new Solution29().maxStep(arr, n));
        }
    }


}



// } Driver Code Ends



class Solution29
{
    //Function to find maximum number of consecutive steps 
    //to gain an increase in altitude with each step.
    static int maxStep(int A[], int N)
    {
        // Your code here
        if(N<=1)
            return 0;

        int maxSteps=0;
        int currentSteps=1;

        for(int i=1;i<N;i++){
            if(A[i]>A[i-1]){
                currentSteps++;
            }else{
                maxSteps=Math.max(maxSteps, currentSteps);
                currentSteps=1;
            }
        }
        maxSteps=Math.max(maxSteps, currentSteps);
        return maxSteps-1;
    }
}