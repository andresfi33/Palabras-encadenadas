/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import java.util.Scanner;

/**
 *
 * @author AndresFI
 */
public class Juego {

    public static void main(String[] args) {
        String palabra1 = "";
        String palabra2 = "";
        char ultimaLetraChar;
        String ultimaLetraString = "";
        String ganador = "Jugador 2";
        boolean salir = false;
        Scanner sc = new Scanner(System.in);
        
        while(!salir){
            System.out.println("Jugador 1, introduce una palabra: ");
            palabra1 = sc.next();
            sc.nextLine();
                if (palabra1.startsWith(ultimaLetraString)) {
                ultimaLetraChar = palabra1.charAt(palabra1.length()-1);
                ultimaLetraString = String.valueOf(ultimaLetraChar);
                
                System.out.println("Jugador 2, introduce una palabra: ");
                palabra2 = sc.next();
                sc.nextLine();
                
                    if (palabra2.startsWith(ultimaLetraString)) {
                    ultimaLetraChar = palabra1.charAt(palabra1.length()-1);
                    ultimaLetraString = String.valueOf(ultimaLetraChar);
            } else{
                    salir = true;
                    ganador = "Jugador 1";
                }
        }
        
    }
        System.out.println("El ganador es el " + ganador);
    }
}
