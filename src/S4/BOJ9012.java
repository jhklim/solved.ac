package S4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class BOJ9012 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        String[] list = new String[T];

        for (int i = 0; i < T; i++) {
            list[i] = br.readLine();
        }


        for (String one : list) {
            Stack<Character> stack = new Stack<>();
            boolean isVPS = true;

            for (char c : one.toCharArray()) {
                if(c == '(') {
                    stack.push(c);
                } else { // ')'
                    if(stack.empty()) {
                        isVPS = false;
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }

            if (!stack.empty()) {
                isVPS = false;
            }

            if (isVPS) {
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
