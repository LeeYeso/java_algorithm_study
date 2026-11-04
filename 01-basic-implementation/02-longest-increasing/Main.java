import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nList = new int[n];

        for(int i=0; i<n; i++)
        {
            nList[i]=sc.nextInt();
        }

        int range = 1;
        int maxRange = 0;

        for(int i =1; i<nList.length; i++)
        {
           if(nList[i]>nList[i-1])
           {
               range +=1;
           } else {
               if(maxRange<range)
               {maxRange = range;}
                range = 1;
           }
        }
        if(maxRange<range)
        {maxRange = range;}
        System.out.print(maxRange);
    }
}
