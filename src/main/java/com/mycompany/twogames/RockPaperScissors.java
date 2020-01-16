/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.twogames;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Dev10
 */
public class RockPaperScissors {

    public static void main(String[] args) {
        String playAgain;
        do {
            Player p1;
            Player p2;
            Scanner sc = new Scanner(System.in);
            System.out.print("Is player Human or Computer? ");
            String playerInput = sc.nextLine();

            if (playerInput.equals("Human")) {
                p1 = new HumanPlayer();
            } else {
                p1 = new ComputerPlayer();
            }
            
            System.out.println("Is player Human or Computer?? ");
            playerInput = sc.nextLine();
            if (playerInput.equals("Human")) {
                p2 = new HumanPlayer();
            } else {
                p2 = new ComputerPlayer();
            }
            
            
            int round = numRounds(sc);
            Random rGen = new Random();

            int wins = 0;
            int losses = 0;
            int ties = 0;

            while (round > 0) {
                int computerChoice = p2.getTurn();
                if (computerChoice == 1) {
                    System.out.println("Player 2 played Rock");
                } else if (computerChoice == 2) {
                    System.out.println("Player 2 played Paper");
                } else if (computerChoice == 3) {
                    System.out.println("Player 2 played Scissors");
                }
                
                int userChoice = p1.getTurn();
                if (userChoice == 1) {
                    System.out.println("Player 1 played Rock");
                } else if (userChoice == 2) {
                    System.out.println("Player 1 played Paper");
                } else if (userChoice == 3) {
                    System.out.println("Player 1 played Scissors");
                }

                if (userChoice == computerChoice) {
                    System.out.println("Tie!");
                    ties++;
                } else if (userChoice - 1 == computerChoice % 3) {
                    System.out.println("You win!");
                    wins++;
                } else if (computerChoice - 1 == userChoice % 3) {
                    System.out.println("You lose!");
                    losses++;
                }
                round--;
            }
            if (wins > losses) {
                System.out.println("You won!!");
            } else if (wins < losses) {
                System.out.println("You lose!!");
            } else {
                System.out.println("You tied!!");
            }
            System.out.println("Would you like to play again? [Yes/No]");
            playAgain = sc.nextLine();
        } while ("Yes".equals(playAgain));
        System.out.println("Thanks for playing!");
    }

    public static int numRounds(Scanner sc) {
        int round = 0;
        System.out.println("How many rounds would you like to play?:");
        while (round > 10 || round < 1) {
            round = sc.nextInt();
            sc.nextLine();
            if (round > 10 || round < 1) {
                System.out.println("Invalid number!! Try again?");
            }
        }
        return round;
    }
}
