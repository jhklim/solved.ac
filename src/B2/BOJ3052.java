package B2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class BOJ3052 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Set<Integer> remainderSet = new HashSet<>();

        int[] remainders = new int[10];
        int[] data = new int[10];
        int cnt = 0;

        for (int i = 0; i < 10; i++) {
            remainderSet.add(Integer.parseInt(br.readLine())%42);
        }
        System.out.println(remainderSet.size());
    }
}
