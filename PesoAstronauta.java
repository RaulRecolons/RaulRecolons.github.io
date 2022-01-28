package com.mycompany.exev1raulrecolons;

/**
 *
 * @author rarec
 * version: 1.0
 */

import java.util.Scanner;

public class PesoAstronauta {
    public static void calculaPeso(){
        double masa;
        char N = 'N';
        char n = 'n';
        final double GRAVEDADMARTE = 3.72; 
        final double GRAVEDADVENUS = 8.87; 
        final double GRAVEDADMERCURIO = 3.7; 
        final double GRAVEDADJUPITER = 24.79;
        final double GRAVEDADSATURNO = 10.44;
        String planeta;
        double gravedadPlanetas = 0;
        char continuar;
                        
        System.out.println("¡Bienvenido al programa de cálculo de peso de Astronautas!");
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Introduce la masa del astronauta en kilogramos: ");
            masa = sc.nextInt();
            System.out.println("Escribe el nombre de el planeta en el que quieres hacer el calculo tal cual los ves en la siguiente lista");
            System.out.println("mercurio, venus, marte, jupiter, saturno");
            
            planeta = sc.next();
            
            switch (planeta){
                case "venus": gravedadPlanetas = masa*GRAVEDADVENUS;
                    System.out.println("El peso del astronauta en Venus es " + gravedadPlanetas + " N");
                    break;
                case "marte": gravedadPlanetas = masa*GRAVEDADMARTE;
                    System.out.println("El peso del astronauta en Marte es " + gravedadPlanetas + " N");
                    break;
                case "mercurio": gravedadPlanetas = masa*GRAVEDADMERCURIO;
                    System.out.println("El peso del astronauta en Mercurio es " + gravedadPlanetas + " N");
                    break;
                case "jupiter": gravedadPlanetas = masa*GRAVEDADJUPITER;
                    System.out.println("El peso del astronauta en Júpiter es " + gravedadPlanetas + " N");
                    break;
                case "saturno": gravedadPlanetas = masa*GRAVEDADSATURNO;
                    System.out.println("El peso del astronauta en Saturno es " + gravedadPlanetas + " N");
                    break;
                default: System.out.println("error");
                    break;
            }           
            System.out.println("Si desea continuar escriba N si no escriba cualquier cosa");
            continuar = sc.next().charAt(0);
        }while(continuar != N && continuar != n);
        
        System.out.println("Fin del programa.");
        sc.close();
    }
}