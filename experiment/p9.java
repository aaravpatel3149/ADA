public class CoinChange {
    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int amount = 11;

        int[] dp = new int[amount+1];
        for (int i=1;i<=amount;i++) dp[i]=Integer.MAX_VALUE;

        for (int i=1;i<=amount;i++) {
            for (int c : coins) {
                if (i-c>=0 && dp[i-c]!=Integer.MAX_VALUE)
                    dp[i] = Math.min(dp[i], dp[i-c]+1);
            }
        }

        System.out.println(dp[amount]);
    }
}
