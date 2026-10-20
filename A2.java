public class A2 {
    public static void main(String[] args) {
        
        double[] b={3.4,5.51,7.2,8.7,9.01,1.47} ;
        double max=0.0;     
 
        System.out.println();
        for(int i=0 ; i<b.length ; i++)
        {
           if(b[i]>max){
            max=b[i];
           }
        }
        System.out.printf("%.2f   ",max);
        System.out.println();
        // ============================================================ 隔開線
        
        System.out.println();
        for(double x:b){
            if(x>max){
                max=x;
            }
        }
        System.out.printf("%.2f   ",max);
    }
}
