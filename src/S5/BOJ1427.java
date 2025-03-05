package S5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class BOJ1427 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split("");
        Integer[] num = new Integer[s.length];

        for (int i = 0; i < s.length; i++) {
            num[i] = Integer.parseInt(s[i]);
        }

        Arrays.sort(num, Collections.reverseOrder());

        for (int n : num) {
            System.out.print(n);
        }
    }
}
