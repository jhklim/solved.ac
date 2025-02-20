package B1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ4344 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(br.readLine());

        for (int i = 0; i < C; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());

            int[] list = new int[N];
            double sum = 0;
            for (int j = 0; j < N; j++) {
                list[j] = Integer.parseInt(st.nextToken());
                sum += list[j];
            }
            double avg = sum/N;

            double cnt = 0;
            for (int j = 0; j < N; j++) {
                if (list[j] > avg) {
                    cnt++;
                }
            }
            double proportion = (cnt/N)*100;
            System.out.printf("%.3f%%\n", proportion);
        }
    }
}
