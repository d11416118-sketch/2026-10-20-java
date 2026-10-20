public class A8 {
     public static void main(String[] args) {
            int[] b={1,2,3};
            int[] z;
            System.out.println("=== before ===");
            for(int i=0 ;i<b.length ;i++){
                System.out.printf("b[%d]=%d  ",i,b[i]);
            }
            z=m(b);
            System.out.println("\n ==== after ====\n");
            for(int i=0 ;i<b.length ;i++){
                System.out.printf("b[%d]=%d  ",i,b[i]);
            }
            System.out.println();
            for(int i=0 ;i<z.length ;i++){
                System.out.printf("z[%d]=%d  ",i,z[i]);
            }
    }
    //overloading
  
    public static int[]  m(int[] c) {
        for(int i=0 ; i<c.length ; i++){
            c[i]=c[i]+10;
        }
        System.out.println();
         for(int i=0 ; i<c.length ; i++){
            System.out.printf("in SUB #b[i]=%d\n",i,c[i]);
           
        }
         return  c;
    }

}


