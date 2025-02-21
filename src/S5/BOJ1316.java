package S5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ1316 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            String text = br.readLine();

            if (isGroupNumber(text)) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    private static boolean isGroupNumber(String text) {
        boolean[] alphabet = new boolean[26];

        for (int j = 0; j < text.length(); j++) {
            char current = text.charAt(j);

            if (j > 0 && current != text.charAt(j-1) && alphabet[current - 'a']) {
                return false;
            }
            alphabet[current - 'a'] = true; // 방문 처리

        }
        return true;
    }
}
