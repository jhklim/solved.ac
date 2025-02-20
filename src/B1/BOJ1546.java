package B1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1546 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] score = new int[N];
        double sum = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            score[i] = Integer.parseInt(st.nextToken());
            sum += score[i];
        }
        Arrays.sort(score);

        double M = score[N-1];

        double modifiedScore = (double) (sum/M)*100;
        double average = modifiedScore/N;
        System.out.println(average);

    }
}
