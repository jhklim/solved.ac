package S5;

public class BOJ4673 {
    public static void main(String[] args) throws Exception {
        boolean[] list = new boolean[10001];

        for (int i = 0; i < 10000; i++) {
            int dnum = func_d(i+1);
            if (dnum < 10001) {
                list[dnum] = true;
            }
        }

        for (int i = 1; i < 10000; i++) {
            if (!list[i]) {
                System.out.println(i);
            }
        }
    }

    private static int func_d(int num) {
        int result = num;

        while (num > 0) {
            result += num%10;
            num /= 10;
        }
        return result;
    }
}
