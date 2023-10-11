import java.util.Scanner;

public class Challenge4 {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);

        int random;
        random = (int) ((Math.random() * 100 ) + 1);
        System.out.println(random);

        System.out.println("Guess a number 1-100: ");
        int userInput = scan.nextInt();

        boolean runWhileLoop = false;

        while (runWhileLoop == false){
            if (userInput < random){
                System.out.println("Your guess is too low.");
                System.out.println("Guess again: ");
                userInput = scan.nextInt();
            }
            else if (userInput > random){
                System.out.println("Your guess is too high.");
                System.out.println("Guess again: ");
                userInput = scan.nextInt();
            }
            else if (userInput == random){
                System.out.println("Congratulations! You guessed correctly!");
                System.out.println("The number was: " + random);
                runWhileLoop = true;
            }
            else {
                System.out.println("ERROR.");
                System.out.println("Guess again: ");
                userInput = scan.nextInt();
            }
        }
    }
}
