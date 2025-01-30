import java.util.Scanner;

public class qn_03_Scanner {
    public static void main(String[] args) {
        System.out.println("Enter any number: ");

        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        if (x % 2 == 0) {

            if (x >= 0 && x <= 10) {
                System.out.println("hi");

            }
            if (x >= 10 && x <= 20) {
                System.out.println("hello");
            }
            if (x > 20) {
                System.out.println("Bye");
            }
        } else {
            System.out.println("odd");
        }
    }
}
