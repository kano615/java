import java.util.Scanner;

public class productofnum {
        public static void main(String [] args)
        {
            int number,product=1;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number: ");
            number = sc.nextInt();
            while(number > 0)
            {
                product=product * (number%10);
                number=number/10;
            }
            System.out.println("product of digit: "+product);
        }
    }
