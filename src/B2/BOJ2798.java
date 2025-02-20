package B2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ2798 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int sum = 0;
        int max = 0;

        int[] num = new int[N];


        StringTokenizer numbers = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(numbers.nextToken());
        }

        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                for (int k = j+1; k < N; k++) {
                    sum = num[i] + num[j] + num[k];
                    if (sum <= M && sum > max) {
                        max = sum;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
