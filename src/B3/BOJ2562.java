package B3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2562 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[9];

        int max = 0;
        int index = 0;

        for (int i = 0; i < 9; i++) {
            array[i] = Integer.parseInt(br.readLine());
            if (array[i] > max) {
                max = array[i];
                index = i+1;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
