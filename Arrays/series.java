import java.util.*;

public  class series {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        // int t=in.nextInt();
        // for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();

            int n = in.nextInt();
            // int term = a+b*((int)Math.pow(2,n)-1);
            // System.out.println(term);
            for(int j=1; j<n+1;j++) {
                int term = a+b*((int)Math.pow(2,n)-1);
                System.out.print(term + " ");
            }
        // }
    }
}