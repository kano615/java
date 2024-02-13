import java.util.*;
public class prime {
        public static void main(String[] args) {

            int num, flag = 0;
            Scanner scan = new Scanner(System.in);
            System.out.println("enter num to check the num is prime or not!!");
            num = scan.nextInt();
            if (num == 2 && num==0 && num==1) {
                System.out.println(num + " is an prime number.");
            } else {
                for (int i = 2; i <= num / 2; i++) {
                    if (num % i == 0) {
                        flag = 1;
                    }
                }
                if (flag == 0)
                    System.out.println(num + " is an prime number.");
                else
                    System.out.println(num + " is not an prime number.");
            }
        }
    }

