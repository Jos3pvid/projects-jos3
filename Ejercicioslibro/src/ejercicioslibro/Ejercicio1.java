/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicioslibro;

import java.util.Scanner;

/**
 *
 * @author JOSE
 */
public class Ejercicio1 {
     
    
     
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el numero : " );
        num= sc.nextInt();
        if( num %10==4)
        {
            System.out.println("El numero : " + num + " Termina en 4");
        }
    
        else
        {
            System.out.println("El numero : " + num + " No termina en 4");
        }
}
}

