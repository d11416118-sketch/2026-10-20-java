

public class A7 {
    public static void main(String[] args) {
            int a=6;
            int [] b={1,2,3};
            System.out.println("=== before ===");
            System.out.printf("a=%d\n ",a);
            for(int i=0 ;i<b.length ;i++){
                System.out.printf("b[%d]=%d  ",i,b[i]);

            }
            m(a);
            m(b);
            System.out.println("\n ==== after ====\n");
            System.out.printf("a=%d\n ",a);
            for(int i=0 ;i<b.length ;i++){
                System.out.printf("b[%d]=%d  ",i,b[i]);

            }
    }
    //overloading
    public static void m(int a) {
        a=a+10;
        System.out.printf("    in SUB #a=%d    \n",a );
    }
    public static void m(int[] c) {
        for(int i=0 ; i<c.length ; i++){
            c[i]=c[i]+10;
        }
         for(int i=0 ; i<c.length ; i++){
            System.out.printf("in SUB #b[i]=%d\n",i,c[i]);
        }

    }

}
