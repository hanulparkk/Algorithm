import java.io.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        //input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int N;
        int[][] dp = new int[41][2];
        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;

        //logic
        while (T-- > 0) {
            N = Integer.parseInt(br.readLine());

            for (int i = 2; i <= N; i++) {
                dp[i][0] = dp[i - 1][0] + dp[i - 2][0];
                dp[i][1] = dp[i - 1][1] + dp[i - 2][1];
            }

            //output
            System.out.println(dp[N][0] + " " + dp[N][1]);
        }
    }
}