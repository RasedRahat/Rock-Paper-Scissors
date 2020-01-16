/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.twogames;

import java.util.Random;

/**
 *
 * @author Dev10
 */
public class ComputerPlayer implements Player {

    @Override
    public int getTurn() {
        Random rGen = new Random();
        return rGen.nextInt(3) + 1;
    }   
}
