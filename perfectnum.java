import java.util.*;

public class perfectnum {
    public static void main(String[] args) {
        int num;
        int sum=0;
     Scanner scan=new Scanner(System.in);
     System.out.println("enter num to check the num is perfect or not!!");
     num=scan.nextInt();
     for (int i=1;i<=num/2;i++)
     {
         if(num%i==0)
         {
             sum=sum+i;
         }
     }

     if(num==sum){
         System.out.println(num+" "+"this number is perfect!1");
     }else {
         System.out.println(num+" "+"this number is not perfect!1");
     }

    }
}

