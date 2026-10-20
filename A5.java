public class A5 {
     public static void main(String[] args) {
    
        double[] b={-3.4,-5.51,-7.2,-8.7,-9.01,-1.47} ;
        int p=0;
        double max=b[p];     
 
        System.out.println();
        for(int i=0 ; i<b.length ; i++)
        {
           if(b[i]>max){
                max=b[i];
                p=i;
            }

        }
        System.out.printf("b[%d] max=%.2f   ",p,max);
        System.out.println();
        // ============================================================ 隔開線
        max=b[0]; //
        System.out.println();
        for(double x:b){
            if(x>max){
                max=x;
            }
        }
        System.out.printf("max=%.2f   ",max);
    }
}
