import java.util.Scanner;
public class patten {
    public static void main(String[] args) {
        int n;
        int s, j;

        Scanner Sc = new Scanner(System.in);
        System.out.println("enter number of line");
        n = Sc.nextInt();

        for (int i = 1; i <= n; i++)
        {
            for (s=1;s<=n-i;s++)
                System.out.print(" ");
            for (j = 1; j <=i; j++)
                System.out.print("*");
            System.out.println();
        }

        for (int i = 1; i <= n; i++)
        {
            for (s=1;s<=i;s++)
                System.out.print(" ");
            for (j = 1; j <=n-i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}