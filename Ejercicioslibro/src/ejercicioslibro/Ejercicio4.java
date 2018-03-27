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
public class Ejercicio4 {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el primer digito");
        int dig1= sc.nextInt();
        System.out.println("Escriba el segundo digito");
         int dig2= sc.nextInt();
         
         int suma = dig1 + dig2;
         int resultado = suma;
        if(dig1>=0 && dig1<10  && dig2>=0 && dig2<10)
        {
            if(resultado==suma)
            
            {
                System.out.println("El resultado de sumar los dos digitos del numero   " +dig1 + dig2+ " es : "+ resultado);
            }
        }
    else
        {
            System.out.println("La operación no se puede realizar");
        }
        
    }
}
