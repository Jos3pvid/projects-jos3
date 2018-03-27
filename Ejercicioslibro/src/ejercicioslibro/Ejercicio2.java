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
public class Ejercicio2 {
    
    public static void main( String[] args)
    {
          
        Scanner sc = new Scanner(System.in);
        
       System.out.println("Digite el número: ");
       int num = sc.nextInt();
         if( num>=100 && num<=999 )
            {
                System.out.println("El número :" + num + " es de 3 digitos");
                
           
            }
      else
         {
             System.out.println("El numero :" + num + " no es de 3 digitos");
         }
    }
}
