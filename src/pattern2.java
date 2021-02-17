public class pattern2 {
    public static void main(String[] args) {
        /*
                A
A B
A B C
A B C D
A B C D E
A B C D E F
         */
        int n=6;
        for(int i=1;i<=n;i++)
        {
            for (int j=65;j<=i+65-1;j++)
            {
//                System.out.print(num+" ");
//                num++;
                System.out.print((char)j+" ");
            }
            System.out.println();
        }
    }
}
