import java.util.Scanner;

public class BOJ9046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String[] text = new String[n];

        for (int i = 0; i < n; i++) {
            text[i] = sc.nextLine();
        }

        sc.close();

        for (int i = 0; i < n; i++) {
            System.out.println("text" + i + ": " + text[i]);
        }
    }
}
