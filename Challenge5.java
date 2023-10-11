import java.util.Scanner;

public class Challenge5 {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);

        boolean inPlay = true;
        String answer;
        String computerInput;
        int AI;

        while (inPlay != false){
            System.out.println("Rock, Paper, or Scissors? ");
            String userInput = scan.nextLine().toLowerCase();

            // Computer picking their move
            int random = (int) ((Math.random() * 100) + 1);
            if (random <= 33){
                computerInput = "rock";
            }
            else if (random <= 67){
                computerInput = "paper";
            }
            else{
                computerInput = "scissors";
            }

            // Determining a winner
            if ((userInput == "rock") && (computerInput == "scissors"){
                System.out.println("You Win!");
            }
        }
    }
}