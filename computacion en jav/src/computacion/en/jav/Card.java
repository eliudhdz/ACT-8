/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computacion.en.jav;

/**
 *
 * @author aeliu
 */

    public class Card {
    public static void main(String[] args) {
    }
    public Card(String palos, String color, String valor) {
            this.palos = palos;
            this.color = color;
            this.valor = valor;

        }
  
    public String toString() {
        return "" + palos +   " " + color +  " " + valor ;
    }
    private final String palos;
    private final String color;
    private final String valor;

    }

