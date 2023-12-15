/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2p1_josealvarez;

/**
 *
 * @author jkalvarezb
 */
import java.util.Scanner;
public class Ex2P1_JoseAlvarez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("1. ¡Ejercicio práctico 1 – Kingdom Hearts Re-Re:Coded! ");
        System.out.println("2. Salir");
        int opcion = leer.nextInt();
        
        switch(opcion){
            case 1:
                System.out.println("Bienvenido a Ejercicio práctico 1 – Kingdom Hearts Re-Re:Coded! ");
                System.out.println("Menu");
                System.out.println("1.Attack");
                System.out.println("2.Magic");
                System.out.println("3.Items");
                System.out.println("4.Party");
                System.out.print("Elija uno: ");
                int opcionelegir = leer.nextInt();
        }
        
    }
    
}
