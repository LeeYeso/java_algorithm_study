import java.util.Scanner;

public class ChangeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        int[] money = {
                50000, 10000, 5000, 1000,
                500, 100, 50, 10
        };

        for (int test_case = 1; test_case <= T; test_case++) {

            int m = sc.nextInt();
            int[] count = new int[money.length];

            for (int i = 0; i < money.length; i++) {
                count[i] = m / money[i];
                m = m % money[i];
            }

            System.out.println("#" + test_case);

            for (int i = 0; i < count.length; i++) {
                System.out.print(count[i]);

                if (i < count.length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
