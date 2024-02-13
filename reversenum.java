import java.util.Scanner;
public class reversenum {

        public static void main(String [] args)
        {
            int number,rev=0;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number: ");
            number = sc.nextInt();
            int count=0;
            while(number > 0)
            {
                count++;
                rev=rev*10+number%10;
                number=number/10;
            }
            System.out.println("reverse digit:"+rev);
            System.out.println("count of digit:"+count);
        }
    }