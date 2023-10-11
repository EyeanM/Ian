import java.util.Scanner;

public class Challenge2 {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers are you looking for? ");
        int userInput = scan.nextInt();

        for (int i = 1; i <= userInput; i++){
            System.out.println(i + " Squared is: " + (i * i));
            System.out.println(i + " Cubed is: " + (i * i * i));
            System.out.println("--------------------------------------");
        }
    }
}
