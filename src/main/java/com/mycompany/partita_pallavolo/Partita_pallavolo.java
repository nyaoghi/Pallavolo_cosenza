/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.partita_pallavolo;

/**
 *
 * @author olgac
 */
public class Partita_pallavolo {

    public static void main(String[] args) {
        Giocatore g1 = new Giocatore(1);
        Giocatore g2 = new Giocatore(2);
        
        Thread t1 = new Thread(g1);
        Thread t2 = new Thread(g2);
        
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        
        t1.start();
        t2.start();
        
        //prova commit
        
        
       /* Giocatore g2 = new Giocatore(2);
        new Thread(g2, "Olga").start(); */
        
    }
}
