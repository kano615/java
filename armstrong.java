import java.util.*;

public class armstrong {
    public static void main(String[] args) {

        int number = 153;
        int originalNumber = number;
        int remainder, result = 0;

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if (result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}