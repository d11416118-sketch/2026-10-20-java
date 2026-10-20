import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        int [] a={3,5,7,8,9,1};
        double[] b={3.4,5.51,7.2,8.7,9.01,1.47} ;
        for(int i=0 ; i<a.length ; i++)
        {
            System.out.printf("%d   ",a[i]);

        }
        System.out.println();
        for(int i=0 ; i<b.length ; i++)
        {
            System.out.printf("%.2f   ",b[i]);

        }
        System.out.println();
        // ============================================================ 隔開線
        for(int x:a){
            System.out.printf("%d   ",x);
        }
        System.out.println();
        for(double x:b){
            System.out.printf("%.2f   ",x);
        }
    }
}