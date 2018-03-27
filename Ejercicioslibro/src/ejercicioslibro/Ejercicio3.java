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
public class Ejercicio3 {
   
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite un numero");
        int num= sc.nextInt();
        
        if(num<0)
        {
            System.out.println("El numero: " + num + " Es negativo");
        }
        
        else
        {
            System.out.println("El numero:" + num + "No es negativo");
        }
        
    }
}
