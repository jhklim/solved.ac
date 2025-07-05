package S4;

import java.io.*;

public class BOJ11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] parts = br.readLine().split(" ");

        int N = Integer.parseInt(parts[0]); // 10
        int K = Integer.parseInt(parts[1]); // 4200

        int[] coins = new int[N];
        for (int i = 0; i < N; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (K >= coins[N-i]) {
                count += K/coins[N-i];
                K %= coins[N-i];
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}
