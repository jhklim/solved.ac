package S5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ2941 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String text = br.readLine();
        int cnt = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (i < text.length() - 1) {
                if (ch == 'c' && (text.charAt(i+1) == '=' || text.charAt(i+1) == '-')) {
                    i++;
                } else if (ch == 'd') {
                    if (text.charAt(i+1) == '-') {
                        i++;
                    } else if (i < text.length() - 2 && text.charAt(i+1) == 'z' && text.charAt(i+2) == '=') {
                        i += 2;
                    }
                } else if ((ch == 'z' || ch == 's') && text.charAt(i+1) == '=') {
                    i++;
                } else if ((ch == 'l' || ch == 'n') && text.charAt(i+1) == 'j') {
                    i++;
                }
            }

            cnt++;
        }
        System.out.println(cnt);
    }
}
