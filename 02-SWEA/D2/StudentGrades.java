
import java.util.Scanner;
import java.util.Arrays;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        String[] grades = {
                "A+", "A0", "A-", "B+", "B0",
                "B-", "C+", "C0", "C-", "D0"
        };

        for (int test_case = 1; test_case <= T; test_case++) {

            int n = sc.nextInt();
            int k = sc.nextInt();

            double[] array = new double[n];
            double kGrade = 0;

            // 1. 학생별 총점 계산
            for (int i = 0; i < n; i++) {
                int t1 = sc.nextInt();
                int t2 = sc.nextInt();
                int t3 = sc.nextInt();

                array[i] = t1 * 0.35 + t2 * 0.45 + t3 * 0.2;
            }

            // 2. K번째 학생의 총점 저장
            kGrade = array[k - 1];

            // 3. 오름차순 정렬
            Arrays.sort(array);

            // 4. 학점별 학생 수
            int studentNum = n / 10;

            // 5. 높은 점수부터 탐색
            for (int i = n - 1; i >= 0; i--) {
                if (kGrade == array[i]) {

                    int rank = n - i;
                    int gradeIndex = (rank - 1) / studentNum;

                    System.out.println("#" + test_case + " "
                            + grades[gradeIndex]);
                    break;
                }
            }
        }

        sc.close();
    }
}
