import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {

            int palindrome = 1;
            String t = sc.next();

            for (int i = 0; i < t.length() / 2; i++) {
                if (t.charAt(i) != t.charAt(t.length() - 1 - i)) {
                    palindrome = 0;
                    break;
                }
            }

            System.out.println("#" + test_case + " " + palindrome);
        }
    }
}
