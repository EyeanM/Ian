import java.util.Scanner;

public class Main {
    public static void main (String[]args) {
        // demonstrates the use of while loop
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the limit on the counter? ");

        int LIMIT = scan.nextInt();
        int count = 1;

        while (count <= LIMIT) {
            System.out.println(count);
            count += 1; // Counter = counter + 1
        }
        System.out.println("Done.");
    }
}