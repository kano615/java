import java.util.*;
class grade {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int avg;
        System.out.println("enter average marks");
        avg = scan.nextInt();
        int av = avg / 10;
        int average = Math.round(av);
        System.out.println(average);

        switch (average) {
            case 7:
                System.out.println("dist");
                break;
            case 6:
                System.out.println("first");
                break;
            case 5:
                System.out.println("second");
                break;
            case 4:
                System.out.println("pass");
                break;
            default:
                System.out.println("try again");
                break;
        }
    }

}
