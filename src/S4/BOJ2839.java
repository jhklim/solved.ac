package S4;

import java.io.*;

public class BOJ2839 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int result = -1;

        int count = 0;
        while(N >= 0) {
            if(N%5 == 0) {
                count += N/5;
                result = count;
                break;
            }
            N -= 3;
            count++;
        }

        bw.write(result + "\n");
        bw.flush();
        bw.close();

    }
}
