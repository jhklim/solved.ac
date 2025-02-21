package B1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ10989_CountingSort {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] list = new int[10001];

        for (int i = 0; i < N; i++) {
            list[Integer.parseInt(br.readLine())]++;
        }

        for (int i = 1; i < 10001; i++) {
            if (list[i] > 0) {
                for (int j = 0; j < list[i]; j++) {
                    bw.write(i + "\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
