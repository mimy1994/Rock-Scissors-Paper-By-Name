import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    private static final String ROCK = "Rock";
    private static final String PAPER = "Paper";
    private static final String SCISSORS = "Scissors";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose [r]ock, [p]aper, or [s]cissors: ");
        String playerChoose = scanner.nextLine();

        if (playerChoose.equals("r") || playerChoose.equals("rock")) {
            playerChoose = ROCK;
        } else if (playerChoose.equals("p") || playerChoose.equals("paper")) {
            playerChoose = PAPER;
        } else if (playerChoose.equals("s") || playerChoose.equals("scissors")) {
            playerChoose = SCISSORS;
        } else {
            System.out.println("Invalid input. Try Again...");
            return;
        }

        Random rand = new Random();
        int computerRandomNum = rand.nextInt(4);
        String computersChoose = "";
        switch (computerRandomNum) {
            case 1:
                computersChoose = "Rock";
                break;
            case 2:
                computersChoose = "Paper";
                break;
            case 3:
                computersChoose = "Scissors";
                break;
        }
        System.out.printf("The computer chose %s.%n", computersChoose);

        if (playerChoose.equals(ROCK) && computersChoose.equals(SCISSORS) ||
                (playerChoose.equals(PAPER) && computersChoose.equals(ROCK) ||
                        (playerChoose.equals(SCISSORS) && computersChoose.equals(PAPER)))) {
            System.out.println("You win!");
        } else if (playerChoose.equals(ROCK) && computersChoose.equals(PAPER) ||
                (playerChoose.equals(PAPER) && computersChoose.equals(SCISSORS) ||
                        playerChoose.equals(SCISSORS) && computersChoose.equals(ROCK))) {
            System.out.println("You lose!");
        } else if (playerChoose.equals(ROCK) && computersChoose.equals(ROCK) ||
                (playerChoose.equals(PAPER) && computersChoose.equals(PAPER)) ||
        (playerChoose.equals(SCISSORS) && computersChoose.equals(SCISSORS))) {
            System.out.println("Drawn!");
        }
    }
}
