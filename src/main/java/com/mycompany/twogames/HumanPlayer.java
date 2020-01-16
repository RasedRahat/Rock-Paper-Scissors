/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.twogames;

import java.util.Scanner;

/**
 *
 * @author Dev10
 */
public class HumanPlayer implements Player {

    @Override
    public int getTurn() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Rock, Paper, Scissors?");
        String prompt = sc.nextLine();

        if ("Rock".equals(prompt)) {
            return 1;
        } else if ("Paper".equals(prompt)) {
            return 2;
        } else if ("Scissors".equals(prompt)) {
            return 3;
        } else {
            return 0;
        }

    }
}
