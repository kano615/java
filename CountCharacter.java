import java.util.Scanner;
public class CountCharacter
{
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
       String kk = sc.nextLine();

        //Counts each character except space
        for(int i = 0; i < kk.length(); i++) {
            if(kk.charAt(i) != ' ')
                count++;
        }

        //Displays the total number of characters present in the given string
        System.out.println("Total number of characters in a string: " + count);
    }
}