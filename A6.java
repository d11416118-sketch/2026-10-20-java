public class A6 {
     public static void main(String[] args) {
            int a=6;
            int [] b={1,2,3};
            System.out.println("=== before ===");
            System.out.printf("a=%d\n ",a);
            for(int i=0 ;i<b.length ;i++){
                System.out.printf("b[%d]=%d  ",i,b[i]);

            }
            m1(a);
            m2(b);
           
    }
    //overloading
    public static void m1(int a) {
        a=a+10;
        System.out.printf("    in SUB #a=%d    \n",a );
    }
    public static void m2(int[] b) {
        for(int i=0 ; i<b.length ; i++){
            b[i]=b[i]+10;
        }
         for(int i=0 ; i<b.length ; i++){
            System.out.printf("in SUB #b[i]=%d\n",i,b[i]);
        }

    }

}

