import java.util.*;
public class palindrom {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter num to check the num is palindrom  or not!!");
            int number = scan.nextInt();
            int originalNumber, remainder=0, result = 0;

            originalNumber = number;
           // string  reversenum=strrev(originalNumber);

            while (originalNumber != 0)
            {
                //remainder = result*10+originalNumber % 10;

                remainder = originalNumber % 10;
                result =result*10+ remainder;
                originalNumber /= 10;
            }
            if(result == number)

                System.out.println(number + " is an palindrom number.");
            else
                System.out.println(number + " is not an palindrom number.");
        }
    }
