import java.util.*;
public class array {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter number of element");
        int size=scan.nextInt();
        int [] aa=new int[size];
        int k=0;
        for(int i=0;i<=aa.length-1;i++)
        {
            k++;
            System.out.println("enter array element"+ " :"+k+":");
            aa[i]=scan.nextInt();
        }
        System.out.println("array elements are:");
        for(int i=0;i<=aa.length-1;i++)
        {

            System.out.print(aa[i]+" ");
        }
        for (int element : aa)

            System.out.print(element + " ");
        System.out.println();

    }
}
