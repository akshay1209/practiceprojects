import java.util.Scanner;
public class dp1_fibonacci {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fibn = fibmemo(n, new int[n + 1]);
        System.out.println(fibn);
    }

    public static int fibmemo(int n, int[] p) {
        if (n == 0 || n == 1)
        {
            return n;
        }
        if(p[n] != 0)
        {return p[n];}
        int fibn1 = fibmemo(n-1,p);
        int fibn2 = fibmemo(n-2,p);
        int fibn= fibn1+fibn2;
        p[n]=fibn;
        return fibn;
    }
}