package B2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1978 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(st.nextToken());
            if(isPrime(a)) {
                cnt++;
            }

        }
        System.out.println(cnt);
    }

    private static boolean isPrime(int a) {
        if (a < 2) {return false;}
        if (a == 2) {return true;}
        if (a%2 == 0) {return false;}
        for (int i = 3; i <= Math.sqrt(a); i += 2) {
            if (a%i == 0) {return false;}
        }
        return true;
    }
}
