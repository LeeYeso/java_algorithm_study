import java.util.Scanner;

public class SecondLargestDistinct2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            int num = sc.nextInt();

            // 만약 max보다 num이 크다면 num이 max값 갱신 + second값을 max로
            if(num>max){
                second = max;
                max = num;
            }else if (num<max){
                //num이 max보다는 작고
                // second보다는 크거나 같다면 second값 갱신
                if(num >= second){
                    second = num;
                }
            }
        }
        // second 값이 없으면 -1 출력
        System.out.println(
                second == Integer.MIN_VALUE ? -1 : second
        );
    }
}