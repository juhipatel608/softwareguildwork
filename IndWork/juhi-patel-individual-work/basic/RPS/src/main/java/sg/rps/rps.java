/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sg.rps;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author apprentice
 */
public class rps {

    public void doit() {
        Scanner capture = new Scanner(System.in);
        Random randomizer = new Random();

        //boolean values, game has started but we dont know if user input is ok yet
        boolean validCheck = false,
                keepPlaying = true;

        int rounds = 11,
                compNumber;

        String userPick,
                computerPick;

        do {
            int tie = 0;
            int userWins = 0;
            int computerWins = 0;

            do {

                System.out.println("Let's play!!");
                System.out.println("Choose number of rounds from 1 to 10 rounds");
                if (capture.hasNextInt()) {
                    rounds = capture.nextInt();
                    if (rounds >= 0 && rounds <= 10) {
                        validCheck = true;
                    }
                } else {
                    System.out.println("That is not a number from 1 to 10!");
                    capture.next();
                }
            } while (!validCheck);

            for (int i = 1; i < (rounds + 1); i++) {
                System.out.println("Pick: rock, paper, or scissors. CHECK YOUR SPELLING");
                userPick = capture.next().toLowerCase();
                System.out.print("Round " + i + "    You picked " + userPick);

                compNumber = randomizer.nextInt(3);
                switch (compNumber) {
                    case 0:
                        computerPick = "rock";
                        break;
                    case 1:
                        computerPick = "paper";
                        break;
                    default:
                        computerPick = "scissors";
                        break;
                }
                System.out.println("    The computer picks " + computerPick);

                if ((userPick.equals("rock") && computerPick.equals("scissors"))
                        || (userPick.equals("paper") && computerPick.equals("rock"))
                        || (userPick.equals("scissors") && computerPick.equals("paper"))) {
                    userWins += 1;
                    System.out.println("You Win!");
                } else if (userPick.equals(computerPick)) {
                    tie += 1;
                    System.out.println("Tie!");
                } else {
                    computerWins += 1;
                    System.out.println("Sorry, you loose");
                }
            }

            System.out.println("User wins: " + userWins + " Computer wins: " + computerWins + " Ties: " + tie);
            if (userWins > computerWins) {
                System.out.println("You win!!");
            } else if (userWins == computerWins) {
                System.out.println("Kiss your sister, It's a tie");
            } else {
                System.out.println("You lose..");
            }

            System.out.println("Keep Playing? (y/n)");
            String play = capture.next();

            if (play.equals("n")) {
                keepPlaying = false;
            }
        } while (keepPlaying == true);

    }
}
