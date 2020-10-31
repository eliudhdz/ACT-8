/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act.pkg9;

import java.util.ArrayList;

/**
 *
 * @author aeliu
 */
public class Main {
    
    public static void main(String[] args) {
        String [] valores ={"A","2","3","4","5","6","7","8","9","10","J","K","Q"};
        String [] palo = {"corazones","pika","diamante","trebol"};
       Baraja baraja=new Baraja();
       baraja.crearBaraja(palo,valores);
       baraja.showMenu();
       baraja.mezclar();
       baraja.head();
       baraja.pick();
       baraja.hand();
       
        }
    }
