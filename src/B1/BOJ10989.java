package B1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class BOJ10989 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] list = new int[N];

        for (int i = 0; i < N; i++) {
            list[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(list);

        for (int l : list) {
            bw.write(l+"\n");
        }
        bw.flush();
        bw.close();
    }
}
