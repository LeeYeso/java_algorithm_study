import java.util.Scanner;

public class PatternLength {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            String t = sc.next();
            int l =0;
            for (int i = 0; i <= 10; i++) {
                        l +=1;
                        boolean equal = true;
                            for(int j = l; j<t.length(); j++) {
                                if (t.charAt(j) != t.charAt(j - l)) {
                                    equal = false;
                                    break;
                                }
                            }
                            if(equal) {
                                System.out.println("#" + test_case + " " + l);
                                break;
                            }
                }

            }
        }

    }
