import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String string = sc.next();

        int total = 0;

        for(int i=0; i<string.length(); i++){
            char ch = string.charAt(i);
            boolean result = Character.isDigit(ch);
            if(result)
            {
                total += Character.getNumericValue(ch);
            }
        }
        System.out.print(total);
    }
}
