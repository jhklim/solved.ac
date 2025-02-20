package B1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ1157 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine().toUpperCase();

        int[] alphabet = new int[26];

        for (int i = 0; i < text.length(); i++) {
            alphabet[text.charAt(i) - 'A']++;
        }

        int max = 0;
        char result = '?';

        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] > max) {
                max = alphabet[i];
                result = (char) (i + 'A');
            } else if (alphabet[i] == max) {
                result = '?';
            }
        }
        System.out.println(result);
    }
}
