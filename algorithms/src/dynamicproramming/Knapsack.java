package dynamicproramming;

public class Knapsack {
    
    // Returns the maximum value that can be put in a knapsack of capacity W
    public static int knapSack(int W, int wt[], int val[], int n) {
        int[][] dp = new int[n+1][W+1];
        
        for (int i = 1; i <= n; i++) {
            for (int w = 1; w <= W; w++) {
                if (wt[i-1] <= w) {
                    dp[i][w] = Math.max(val[i-1] + dp[i-1][w-wt[i-1]], dp[i-1][w]);
                } else {
                    dp[i][w] = dp[i-1][w];
                }
            }
        }
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        return dp[n][W];
    }
    
    public static void main(String args[]) {
        int val[] = new int[]{60, 100, 120};
        int wt[] = new int[]{1, 2, 3};
        int W = 5;
        int n = val.length;
        System.out.println(knapSack(W, wt, val, n)); // prints 220
    }
}

