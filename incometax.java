import java.util.Scanner;
public class incometax {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your annual income: ");
            double annualIncome = scanner.nextDouble();

             calculateIncomeTax(annualIncome);
        }

        public static void calculateIncomeTax(double annualIncome) {
            double tax = 0;
          double income=annualIncome-500000;
System.out.println(income);
            if (income <= 500000) {
                System.out.println("tex is zero");
            }
            else if (income >= 500000 || income >= 1000000) {
                tax =(income*10)/100;
                System.out.println("tex is "+tax);

            }else if (income >= 1000000 ||income >= 2000000 )
             {
                 tax =(income*20)/100;
                 System.out.println("tex is "+tax);
            }

        }

}
