public class A4 {
    public static void main(String[] args) {
        // 正確的要在這裡面比
        double[] b={-3.4,-5.51,-7.2,-8.7,-9.01,-1.47} ;
        double max=b[0];     
 
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
        max=b[0]; //這行必須存在 避免資料有變
        System.out.println();
        for(double x:b){
            if(x>max){
                max=x;
            }
        }
        System.out.printf("%.2f   ",max);
    }
}
