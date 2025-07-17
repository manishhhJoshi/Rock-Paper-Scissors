import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Rock, Paper, Scissors Game
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Declare Variables
        String[] choice = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        //Get choice form the user
        do {
            System.out.print("Enter your choice(rock, paper, scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if(!playerChoice.equals("rock") &&
                    !playerChoice.equals("paper") &&
                    !playAgain.equals("scissors")){
                System.out.println("Invalid choice!");
            }

            //Get random choice for the computer
            computerChoice = choice[random.nextInt(3)];
            System.out.println("Computer choice: "+computerChoice);

            //Check win conditions
            if (playerChoice.equals(computerChoice)){
                System.out.println("It's a tie");
            }
            else if (playerChoice.equals("rock") && computerChoice.equals("scissors")){
                System.out.println("You win!");
            }
            else if (playerChoice.equals("paper") && computerChoice.equals("rock")){
                System.out.println("You win!");
            } else if (playerChoice.equals("scissors") && computerChoice.equals("paper")) {
                System.out.println("You win!");
            }
            else {
                System.out.println("You lose");
            }

            System.out.print("Play again(yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();
        }while (playAgain.equals("yes")); //Ask to play again

        //Goodbye message
        System.out.println("Thank you for playing!");

    }
}