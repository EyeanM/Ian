import java.util.Scanner;

public class Challenge5 {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);

        boolean inPlay = true;
        String computerInput;
        int AI;
        int score = 0;
        int AIscore = 0;

        while (inPlay != false){
            System.out.println("Rock, Paper, or Scissors? (Please input full word): ");
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
            System.out.println(computerInput);

            // Determining a winner
            if ((userInput.equals("rock")) && (computerInput.equals("scissors"))){
                System.out.println("You Win!");
                score++;
            }
            else if ((userInput.equals("scissors")) && (computerInput.equals("paper"))){
                System.out.println("You Win!");
                score++;
            }
            else if ((userInput.equals("paper")) && (computerInput.equals("rock"))) {
                System.out.println("You Win!");
                score++;
            }
            else if (userInput.equals(computerInput)){
                System.out.println("The game is a draw");
            }
            else{
                System.out.println("You lose.");
                AIscore++;
            }

            System.out.println();
            System.out.println("Your score: " + score + "  |  AI Score: " + AIscore);
            System.out.println();

            System.out.println("Would you like to play again? (y or n): ");
            String answer = scan.nextLine().toLowerCase();

            if (answer.equals("y")){
                continue;
            }
            else if (answer.equals("n")){
                break;
            }
            else {
                System.out.println("ERROR: Did not recognize response.");
            }
        }
    }
}