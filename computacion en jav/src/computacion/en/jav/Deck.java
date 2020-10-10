package computacion.en.jav;


import static java.util.Collections.list;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;



/**
 *
 * @author aeliu
 */
public class Deck {
    public void deck(){
    
            Card cart1 = new Card("clubs", "negro", "Ace");
            Card cart2 = new Card("clubs", "negro", "2");
            Card cart3 = new Card("clubs", "negro", "3");
            Card cart4 = new Card("clubs", "negro", "4");
            Card cart5 = new Card("clubs", "negro", "5");
            Card cart6 = new Card("clubs", "negro", "6");
            Card cart7 = new Card("clubs", "negro", "7");
            Card cart8 = new Card("clubs", "negro", "8");
            Card cart9 = new Card("clubs", "negro", "9");
            Card cart10 = new Card("clubs", "negro", "10");
            Card cart11 = new Card("clubs", "negro", "Jack");
            Card cart12 = new Card("clubs", "negro", "Queen");
            Card cart13 = new Card("clubs", "negro", "King");
            Card cart14 = new Card("hearts", "rojo", "Ace");
            Card cart15 = new Card("hearts", "rojo", "2");
            Card cart16 = new Card("hearts", "rojo", "3");
            Card cart17 = new Card("hearts", "rojo", "4");
            Card cart18 = new Card("hearts", "rojo", "5");
            Card cart19 = new Card("hearts", "rojo", "6");
            Card cart20 = new Card("hearts", "rojo", "7");
            Card cart21 = new Card("hearts", "rojo", "8");
            Card cart22 = new Card("hearts", "rojo", "9");
            Card cart23 = new Card("hearts", "rojo", "10");
            Card cart24 = new Card("hearts", "rojo", "Jack");
            Card cart25 = new Card("hearts", "rojo", "Queen");
            Card cart26 = new Card("hearts", "rojo", "King");
            Card cart27 = new Card("spades", "negro", "A");
            Card cart28 = new Card("spades", "negro", "2");
            Card cart29 = new Card("spades", "negro", "3");
            Card cart30 = new Card("spades", "negro", "4");
            Card cart31 = new Card("spades", "negro", "5");
            Card cart32 = new Card("spades", "negro", "6");
            Card cart33 = new Card("spades", "negro", "7");
            Card cart34 = new Card("spades", "negro", "8");
            Card cart35 = new Card("spades", "negro", "9");
            Card cart36 = new Card("spades", "negro", "10");
            Card cart37 = new Card("spades", "negro", "J");
            Card cart38 = new Card("spades", "negro", "Q");
            Card cart39 = new Card("spades", "negro", "K");
            Card cart40 = new Card("Diamonds", "rojo", "Ace");
            Card cart41 = new Card("Diamonds", "rojo", "2");
            Card cart42 = new Card("Diamonds", "rojo", "3");
            Card cart43 = new Card("Diamonds", "rojo", "4");
            Card cart44 = new Card("Diamonds", "rojo", "5");
            Card cart45 = new Card("Diamonds", "rojo", "6");
            Card cart46 = new Card("Diamonds", "rojo", "7");
            Card cart47 = new Card("Diamonds", "rojo", "8");
            Card cart48 = new Card("Diamonds", "rojo", "9");
            Card cart49 = new Card("Diamonds", "rojo", "10");
            Card cart50 = new Card("Diamonds", "rojo", "Jack");
            Card cart51 = new Card("Diamonds", "rojo", "Queen");
            Card cart52 = new Card("Diamonds", "rojo", "King");
    
           
            LinkedList<Card> cartas = new LinkedList<Card>();
            cartas.add(cart1);
            cartas.add(cart2);
            cartas.add(cart3);
            cartas.add(cart4);
            cartas.add(cart5);
            cartas.add(cart6);
            cartas.add(cart7);
            cartas.add(cart8);
            cartas.add(cart9);
            cartas.add(cart10);
            cartas.add(cart11);
            cartas.add(cart12);
            cartas.add(cart13);
            cartas.add(cart14);
            cartas.add(cart15);
            cartas.add(cart16);
            cartas.add(cart17);
            cartas.add(cart18);
            cartas.add(cart19);
            cartas.add(cart20);
            cartas.add(cart21);
            cartas.add(cart22);
            cartas.add(cart23);
            cartas.add(cart24);
            cartas.add(cart25);
            cartas.add(cart26);
            cartas.add(cart27);
            cartas.add(cart28);
            cartas.add(cart29);
            cartas.add(cart30);
            cartas.add(cart31);
            cartas.add(cart32);
            cartas.add(cart33);
            cartas.add(cart34);
            cartas.add(cart35);
            cartas.add(cart36);
            cartas.add(cart37);
            cartas.add(cart38);
            cartas.add(cart39);
            cartas.add(cart40);
            cartas.add(cart41);
            cartas.add(cart42);
            cartas.add(cart43);
            cartas.add(cart44);
            cartas.add(cart45);
            cartas.add(cart46);
            cartas.add(cart47);
            cartas.add(cart48);
            cartas.add(cart49);
            cartas.add(cart50);
            cartas.add(cart51);
            cartas.add(cart52);
            System.out.println();
            System.out.println("Shuffle: El Deck fue mezclado");
            System.out.println("El deck tiene : " + cartas.size()+ " "+"cartas");
            System.out.println("La primera carta del deck es: " + cartas.get(0));
            cartas.remove(0);
            cartas.contains(new String());// Regresa true o false
            System.out.println("Quedan: " + cartas.size()+" "+"cartas");
            Random numeroaleatorio = new Random();
            int n = numeroaleatorio.nextInt(cartas.size());
            System.out.println("La carta al azar es: " + cartas.get(n));
            cartas.remove(n);
            System.out.println("Quedan: " + cartas.size()+" "+"cartas");
           
        }

}
    
    
 