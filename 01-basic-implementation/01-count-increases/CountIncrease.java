import java.util.Scanner;

public class CountIncrease {
    public static void main(String[] args) {

        //1일차 코딩테스트 연습 : 문제 1. 이전보다 큰 숫자 세기

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nList = new int[n];

        for(int i=0; i<n; i++)
        {
            nList[i]=sc.nextInt();
        }

        int count =0;
        for(int i=1; i< nList.length; i++)
        {
            if(nList[i]>nList[i-1])
            {
                count +=1;
            }
        }
        System.out.print(count);
    }
}
