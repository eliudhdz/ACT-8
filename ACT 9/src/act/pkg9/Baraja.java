/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act.pkg9;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author aeliu
 */
public class Baraja {
    List<Carta> cartas;
    Scanner input = new Scanner(System.in);
    public void crearBaraja(String[]palo,String[] valores){ 
        
        cartas = new ArrayList<>();
        
        for( int i = 0; i<palo.length; i++){
        for(int j=0;j<valores.length;j++){
        Carta carta =new Carta ();
        if (palo[i].equals("corazon") || palo[i].equals("diamante")){
            carta.color="rojo";
        }else{
            carta.color="Negro";
        }
        carta.palo=palo[i];
        carta.valor=valores[j];
        cartas.add(carta);
        }
        }
            
        System.out.println("El tamaño actual de la baraja son " + cartas.size());



}
    public void mezclar(){
        Collections.shuffle(cartas);
        System.out.println("se mezclo el deck");
    }
    public void head(){
    Carta carta =cartas.get(0);
    System.out.println("tu carta es color:" +carta.color);
    System.out.println("pertenece al palo: "+carta.palo);
    System.out.println("y tiene un valor de:"+carta.valor);
    cartas.remove(0);
    System.out.println("tamaño"+cartas.size());
    }
    
    public void pick(){
    Carta carta=cartas.get(5);
     System.out.println("tu carta es color:" +carta.color);
    System.out.println("pertenece al palo: "+carta.palo);
    System.out.println("y tiene un valor de:"+carta.valor);
    cartas.remove(5);
    Collections.shuffle(cartas);
    System.out.println("tamaño"+cartas.size());
    }
    
    
    public void hand(){
    
        {Carta carta=cartas.get(8);
    System.out.println ("Carta numero 4");
    System.out.println("tu carta es color:" +carta.color);
    System.out.println("pertenece al palo: "+carta.palo);
    System.out.println("y tiene un valor de:"+carta.valor);
    cartas.remove(8);
    Collections.shuffle(cartas);
    System.out.println("tamaño"+cartas.size());}
    
        {Carta carta=cartas.get(6);
    System.out.println ("Carta numero 4");
    System.out.println("tu carta es color:" +carta.color);
    System.out.println("pertenece al palo: "+carta.palo);
    System.out.println("y tiene un valor de:"+carta.valor);
    cartas.remove(6);
    Collections.shuffle(cartas);
    System.out.println("tamaño"+cartas.size());}
    
    {Carta carta=cartas.get(10);
    System.out.println ("Carta numero 3");
    System.out.println("tu carta es color:" +carta.color);
    System.out.println("pertenece al palo: "+carta.palo);
    System.out.println("y tiene un valor de:"+carta.valor);
    cartas.remove(10);
    Collections.shuffle(cartas);
    System.out.println("tamaño"+cartas.size());}
    
    {Carta carta=cartas.get(15);
    System.out.println ("Carta numero 2");
    System.out.println("tu carta es color:" +carta.color);
    System.out.println("pertenece al palo: "+carta.palo);
    System.out.println("y tiene un valor de:"+carta.valor);
    cartas.remove(15);
    Collections.shuffle(cartas);
    System.out.println("tamaño"+cartas.size());}
    
    {Carta carta=cartas.get(12);
    System.out.println ("Carta numero 1");
    System.out.println("tu carta es color:" +carta.color);
    System.out.println("pertenece al palo: "+carta.palo);
    System.out.println("y tiene un valor de:"+carta.valor);
    cartas.remove(12);
    Collections.shuffle(cartas);
    System.out.println("tamaño"+cartas.size());}
   
   
    }
    
    public void showMenu(){
        boolean salir=true;
        while (salir){
            int opcion;
            System.out.println("Bienvenido a poker!");
            System.out.println("Selecciona una opcion:");
            System.out.println("1:para mezclar todas las cartas del deck");
            System.out.println("2:head mostrar la primera carta del deck");
            System.out.println("3:pick para mostrar una carta random del deck");
            System.out.println("4: hand devuelve 5 cartas aleatorias del deck");
            opcion=input.nextInt();
            switch (opcion){
                case 1:
                    mezclar();
                    break;
                case 2:
                    head();
                    break;
                case 3:
                    pick();
                    break;
                case 4:
                    hand();
                default:
                    salir=false;
                    break;
                
                
            }
            
            
        }
    }
}
