package S5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ1181 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Set<String> words = new TreeSet<>(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()));

        for (int i = 0; i < N; i++) {
            words.add(br.readLine());
        }

        for (String word : words) {
            System.out.println(word);
        }
    }
}
