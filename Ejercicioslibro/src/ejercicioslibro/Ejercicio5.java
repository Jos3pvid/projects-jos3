/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioslibro;

import java.util.Scanner;
public class Ejercicio5 {
    
    public static void main(String args[])
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer digito");
        int dig1=sc.nextInt();
        System.out.println("Ingrese el segundo digito");
        int dig2=sc.nextInt();
        
        
        
        if( dig1>=0 && dig1<10 &&  dig2>=0 && dig2<10)
        {
            if( dig1%2==0 )
            {
            
                System.out.println("El primer digito del numero " + dig1 + dig2 + " es par");
            }
                
           if(dig2%2==0)
           {
               System.out.println("El segundo digito del numero " + dig1 + dig2+ " es par");
           }
          
           if(dig1%2==1)
           {
               System.out.println("El primer digito del numero " + dig1 + dig2+ " es impar");
           }
           if(dig2%2==1)
           {
               System.out.println("El segundo digito del numero " + dig1 + dig2+ " es impar");
           }  
        
        }
        else
        {
            System.out.println("Solo puede ingresar un valor de dos digitos");
        }
        
        }
    }


