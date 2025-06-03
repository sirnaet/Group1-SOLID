import javax.swing.*;
import java.util.*;

//Demonstrating  violation the Single Responsibility Principle
//This is a guessing game that takes record of guesses made before the right answer

public class SingleResponsibilityViolation {
    public static void main(String[] args) {
        var theGuess = 0;
        var theMagicNumber = 7;
        var count = 0;

        while (theGuess != -1) {
            while (theGuess != theMagicNumber) {
                String input = JOptionPane.showInputDialog("What is your guess?");
                try {
                    theGuess = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    System.exit(0); // Exit if non-numeric input
                }

                if (theGuess == -1) System.exit(0);

                if (theGuess < theMagicNumber) {
                    JOptionPane.showMessageDialog(null, theGuess + " is too low!");
                } else if (theGuess > theMagicNumber) {
                    JOptionPane.showMessageDialog(null, theGuess + " is too high!");
                } else {
                    JOptionPane.showMessageDialog(null, theMagicNumber + " is correct!");
                }

                count++;
            }

            new GameResult(count, theMagicNumber);
            GameResult.printHistory();

            // Reset for new round
            theGuess = 0;
            count = 0;
        }
    }
}

class GameResult {
    static List<GameResult> history = new ArrayList<>();
    int guesses;
    int magicNumber;

    GameResult(int numberOfGuesses, int theNumber) {
        guesses = numberOfGuesses;
        magicNumber = theNumber;
        history.add(this);
    }

    static void printHistory() {
        System.out.println("\n\nGuesses\tMagic Number");
        System.out.println("---------------------");
        for (GameResult gameResult : history) {
            System.out.println(gameResult.guesses + "\t" + gameResult.magicNumber);
        }
        System.out.println("---------------------");
    }
}

//The game above violates SRP because the GameResult Class should not store the history but only focus on handling the results instead.
    //The game history should not be associated with only one gameplay that is shown by the output(despite multiple guesses, it displays the number of guesses)
    //If one would wish to change the magic number, they would have to make the change twice.
