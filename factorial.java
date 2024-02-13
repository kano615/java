import java.util.Scanner;
class factorial {

        public static void main(String[] args){
            int i,fact=1;
            Scanner scan = new Scanner(System.in);
            System.out.println("enter num to check the number factorial!!");
            int number = scan.nextInt();
            for(i=1;i<=number;i++){
                fact=fact*i;
            }
            System.out.println("Factorial of "+number+" is: "+fact);
        }
    }
