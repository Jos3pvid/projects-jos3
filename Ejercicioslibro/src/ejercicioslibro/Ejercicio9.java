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
public class Ejercicio9 {
    
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el primer digito");
        int dig1 = sc.nextInt();
        System.out.println("Escriba el segundo digito");
        int dig2 = sc.nextInt();
        
        if(dig1==2 || dig1==3 || dig1==5 || dig1==7 )
        {
            System.out.println("El primer digito es un numero primo");
        }
        
        else{
            System.out.println("El primer digito no es un numero primo");
        }
        
        if(dig2==2 || dig2==3 || dig2==5 || dig2==7 )
        {
            System.out.println("El segundo digito es un numero primo");
        }
        
        else{
            System.out.println("El segundo digito no es un numero primo");
        }
    }
}
