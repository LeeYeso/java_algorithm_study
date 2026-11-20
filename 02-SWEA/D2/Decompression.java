import java.util.Scanner;

public class Decompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {

            int n = sc.nextInt();
            System.out.println("#" + test_case);
            int count = 0;

            for (int i = 0; i < n; i++) {
                String s = sc.next();
                int num = sc.nextInt();

                for (int j = 0; j < num; j++) {
                    System.out.print(s);
                    count++;

                    if (count % 10 == 0) {
                        System.out.println();
                    }
                }
            }

            // 마지막 줄이 10글자로 끝나지 않았다면 줄바꿈
            if (count % 10 != 0) {
                System.out.println();
            }
        }

        sc.close();
    }
}
