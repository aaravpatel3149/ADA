import java.util.*;

public class LCS {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String X = sc.next();

        System.out.print("Enter second string: ");
        String Y = sc.next();

        int m = X.length();
        int n = Y.length();

        int dp[][] = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (X.charAt(i - 1) == Y.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        System.out.println("\nLCS Length: " + dp[m][n]);

        System.out.println("\nDP Table:");
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print(dp[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
