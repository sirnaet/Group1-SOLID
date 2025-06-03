import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

// Demonstrating adherence to the Single Responsibility Principle
// This is a guessing game that takes record of guesses made before the right answer
public class SingleResponsibilityAdherence {
    public static void main(String[] args) {
        var theGuess = 0;
        var theMagicNumber = 7; // This is the fixed number to guess
        var count = 0;

        // While loop that terminates when the correct guess is made
        while (theGuess != -1) {
            while (theGuess != theMagicNumber) {
                String input = JOptionPane.showInputDialog("What is your guess?");
                try {
                    theGuess = Integer.parseInt(input); // Convert the input into an integer
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
            // Object calling the method for printing history found in the GameResult class - PRINTS ALL GAME RESULTS
            GameHistory.printResults();

            // Reset for new round
            theGuess = 0;
            count = 0;
        }
    }
}

// Created a new class that allows for history to be taken down for each specific guess made and adds to a list called results
class GameHistory {
    static List<gameResult> results = new ArrayList<gameResult>();

    static void printResults() {
        System.out.println("\n\nGuesses:");
        System.out.println("---------------");
        for (gameResult gameResult : results) {
            System.out.println(gameResult + " " + gameResult.magicNumber);
        }
    }
}

class gameResult {
    int guesses;
    int magicNumber;

    gameResult(int numberOfGuesses, int theNumber) {
        guesses = numberOfGuesses;
        magicNumber = theNumber;
        GameHistory.results.add(this);
    }
}