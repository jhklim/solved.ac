package S4;

import java.io.*;
import java.util.Arrays;

public class BOJ11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());


        String numbers = br.readLine();
        String[] parts = numbers.split(" ");

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }
        Arrays.sort(arr);

        int sum = 0;
        int prefixSum = 0;
        for (int i = 0; i < N; i++) {
            prefixSum += arr[i];
            sum += prefixSum;
        }

        bw.write(String.valueOf(sum));

        bw.flush();
        bw.close();
    }
}
