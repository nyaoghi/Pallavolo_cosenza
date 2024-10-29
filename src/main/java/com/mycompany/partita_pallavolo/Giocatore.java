/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.partita_pallavolo;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author olgac
 *
 */
class Giocatore implements Runnable {
    private int id;
    private int n_pass;
    
    public Giocatore(int id){
        this.id = id;
        this.n_pass = 0;
    }
    
    
    public void run(){
    
System.out.println("Giocatore: "+Thread.currentThread().getName()+" e "+Thread.currentThread().getPriority());

while(n_pass<50){
 
 n_pass++;
System.out.println("Numero Passaggi: "+n_pass+" Giocatore: "+id);
     try {
         sleep(2000);
     } catch (InterruptedException ex) {
         Logger.getLogger(Giocatore.class.getName()).log(Level.SEVERE, null, ex);
     
}
     }

Thread.yield();

 
     Thread.interrupted();
     System.out.println("Termine dei passaggi");

//lo yeld non funziona correttamente

    }
}







