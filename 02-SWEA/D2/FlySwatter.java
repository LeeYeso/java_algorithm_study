import java.util.Scanner;

public class FlySwatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {

            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] array = new int[n][n];
            int maxSum = 0;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    array[i][j] = sc.nextInt();

                    if (i >= m - 1 && j >= m - 1) {
                        int sum = 0;

                        for (int k = 0; k < m; k++) {
                            for (int l = 0; l < m; l++) {
                                sum += array[i - k][j - l];
                            }
                        }

                        if (sum > maxSum) {
                            maxSum = sum;
                        }
                    }
                }
            }

            System.out.println("#" + test_case + " " + maxSum);
        }

        sc.close();
    }
}

