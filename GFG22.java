//{ Driver Code Starts

import java.util.Scanner;

class GFG22
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int mat[][] = new int[n][m];
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < m; j++)
                    mat[i][j] = sc.nextInt();
            }

            int x = sc.nextInt();

            System.out.println (new Sol().matSearch(mat, n, m, x));
        }

    }
}
// } Driver Code Ends


class Sol
{
    public static int matSearch(int mat[][], int N, int M, int X)
    {
        // your code here
        if(N==0 || M==0)
            return 0;
        int row=0;
        int col=M-1;
        while(row<N && col>=0){
            if(mat[row][col]==X)
                return 1;
            else if(mat[row][col]>X)
                col--;
            else
                row++;
        }
        return 0;
    }
}