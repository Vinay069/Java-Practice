public class Pattern3{
    public static void main(String[] args) {
        /*
         * * * *
         *     *
         *     *
         * * * *
         */
        int n=4;

           for (int i=0;i<n;i++){
               if (i==0 || i==n-1){
                   for (int j=0;j<n;j++){
                       System.out.print("* ");
                   }
                   System.out.println();
               }
               else{
                   for (int k=0;k<n;k++){
                       if (k==0 ||k==n-1)
                           System.out.print("* ");
                       else {
                           System.out.print("  ");
                       }
                   }
                   System.out.println();
               }
           }
    }
}
