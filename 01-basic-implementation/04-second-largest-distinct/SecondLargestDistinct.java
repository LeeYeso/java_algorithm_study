import java.util.Scanner;

public class SecondLargestDistinct {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nList = new int[n];

        int temp = 0;
        int countNum =1;
        int second =0;
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++){
                if(nList[i]<nList[j]){
                    temp=nList[i];
                    nList[i] = nList[j];
                    nList[j] = temp;
                }
            }
        }

        for(int i=1; i<n; i++){
            if(nList[i]!=nList[i-1]){
                second = nList[i];
                break;
            }
            if(nList[i]==nList[i-1]){
                countNum +=1;
            }
        }
        if(countNum == n){
            System.out.println(-1);}
        else System.out.println(second);
    }
}
