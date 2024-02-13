import java.util.*;
public class sumofdigit {
    public static void main(String [] args)
    {
        int number,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        number = sc.nextInt();
        while(number > 0)
        {
            sum=sum+number%10;
            number=number/10;
        }
        System.out.println("Sum of Digits: "+sum);
    }
}
