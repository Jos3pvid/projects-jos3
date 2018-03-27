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
public class Calculadora {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
       
        int valor;
        
        System.out.println("Calculadora de Jose");
        System.out.println("Operaciones");
        System.out.println("1)Suma");
        System.out.println("2)Resta");
        System.out.println("3)Multiplicacion");
        System.out.println("4)Division");
        
        System.out.println("Escribe el número de la operación que quieres realizar:");
        valor= sc.nextInt();
         
       
        if(valor ==1)
        {
            System.out.println("Escogiste la operación de suma");
            System.out.println("Escribe el primer número:");
            int num1 =sc.nextInt();
             System.out.println("Escribe el segundo número:");
            int num2 =sc.nextInt();
            int suma = num1 + num2;
            
            if(suma == num1 + num2)
            {
                System.out.println("El resultado de la suma es :" + suma);
            }
        }
        
        if(valor==2)
        {
            System.out.println("Escogiste la operación de resta");
            System.out.println("Escribe el primer número:");
            int num1= sc.nextInt();
            System.out.println("Escribe el segundo número:");
            int num2= sc.nextInt();
            int resta = num1 - num2;
            
            if(resta == num1 - num2){
                System.out.println("El resultado de la resta es:" + resta);
            }
        }
        
        if(valor==3)
        {
            System.out.println("Escogiste la operación de multiplicacion");
            System.out.println("Escribe el primer número:");
            int num1 = sc.nextInt();
            System.out.println("Escribe el segundo número:");
            int num2= sc.nextInt();
            int multiplicacion = num1 * num2;
            
            if(multiplicacion == num1 * num2)
            {
                System.out.println("El resultado de la multiplicacion es:" + multiplicacion);
            }
            
        }
        
        if(valor==4)
        {
            System.out.println("Escogiste la operación de división");
            System.out.println("Escribe el primer número:");
            double num1= sc.nextDouble();
            System.out.println("Escribe el segundo número:");
            double num2= sc.nextDouble();
            double division = num1 / num2;
            
            if(division == num1/num2)
            {
                System.out.println("El resultado de la division es :" + division);
            }
            
        }
        
        else
        {
            System.out.println("Ingrese una opción correcta");
        }
    }
    }

