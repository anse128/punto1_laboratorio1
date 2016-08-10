/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto1laboratorio1;

/**
 *
 * @author practi04
 */

import java.util.Scanner;

public class Punto1laboratorio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        int lado, area, volumen;
        System.out.println("digite el lado: ");
        lado = lector.nextInt();
        System.out.println("el lado digitado es:"+lado);
        area = lado*lado;
        volumen = lado*lado*lado;
        System.out.println("el area es:"+area);
        System.out.println("el volumen es:"+volumen);
        System.out.println(area+" "+volumen);


        
    }
    
}
