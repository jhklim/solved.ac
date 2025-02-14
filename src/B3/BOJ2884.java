package B3;

import java.util.Scanner;

public class BOJ2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();

        sc.close();

        int target_H = 0;
        int target_M = 0;

        if (M >= 45) {
            M -= 45;
        } else {
            H -= 1;
            M = 60 + (M - 45);
            if (H < 0) {
                H = 23;
            }
        }
        System.out.print(H + " " + M);
    }
}
