package S4;

import java.io.*;

public class BOJ1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int count;

        if(N < 100) {
            count = N;
        } else {
            count = 99;
            for (int i = 100; i < N+1; i++) {
                int a = i / 100;
                int b = (i / 10) % 10;
                int c = i % 10;

                if((a - b) == (b - c)) {
                    count++;
                }
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}
