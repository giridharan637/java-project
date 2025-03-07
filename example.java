import java.util.Scanner;

public class e3xample {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scan.nextInt();
        for (int i = 1; i <= 100; i++) {
            System.out.println(i + " * " + number + " = " + (i * number));
        }
        scan.close();
    }
}
