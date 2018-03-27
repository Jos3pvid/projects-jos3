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
public class Triki {
   
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in); 
        System.out.println("TRIKI");
        System.out.println("Para poder jugar debes ingresar un número que este dentro del siguiente recuadro");
        System.out.println("---------");
        System.out.println("|1||2||3|");
        System.out.println("|4||5||6|");
        System.out.println("|7||8||9|");
        System.out.println("---------");
        System.out.println("Jugador 1 debes ingresar un numero:");
        int num1= sc.nextInt();
        System.out.println("Jugador 2 debes ingresar un numero:");
        int num2= sc.nextInt();
        System.out.println("Jugador 1 debes ingresar un numero:");
        int num3= sc.nextInt();
        System.out.println("Jugador 2 debes ingresar un numero:");
        int num4= sc.nextInt();
        System.out.println("Jugador 1 debes ingresar un numero:");
        int num5= sc.nextInt();
        System.out.println("Jugador 2 debes ingresar un numero:");
        int num6= sc.nextInt();
        
        if(num1==1 && num3==2 && num5==3)
        {
           System.out.println("!Ganaste jugador 1") ;
           
        }
        
         if(num2==1 && num4==2 && num6==3)
        {
           System.out.println("!Ganaste jugador 2") ;
           
        }
         if(num1==4 && num3==5 && num5==6)
        {
           System.out.println("!Ganaste jugador 1") ;
           
        }
        
          if(num2==4 && num4==5 && num6==6)
        {
           System.out.println("!Ganaste jugador 2") ;
           
        }
          
          if(num1==7 && num3==8 && num5==9)
        {
           System.out.println("!Ganaste jugador 1") ;
           
        }
        
          if(num2==7 && num4==8 && num6==9)
        {
          System.out.println("!Ganaste jugador 2") ;  
        } 
         
        
        if(num1==1 && num3==4 && num5==7)
        {
           System.out.println("!Ganaste jugador 1") ;
           
        }
        
         if(num2==1 && num4==4 && num6==7)
        {
           System.out.println("!Ganaste jugador 2") ;
           
        }
         if(num1==2 && num3==5 && num5==8)
        {
           System.out.println("!Ganaste jugador 1") ;
           
        }
        
          if(num2==2 && num4==5 && num6==8)
        {
           System.out.println("!Ganaste jugador 2") ;
           
        }
          
          if(num1==3 && num3==6 && num5==9)
        {
           System.out.println("!Ganaste jugador 1") ;
           
        }
        
          if(num2==3 && num4==6 && num6==9)
        {
            System.out.println("!Ganaste jugador 2") ;
        } 
        
         if(num1==1 && num3==5 && num5==9)
        {
           System.out.println("!Ganaste jugador 1") ;
           
        }
        
          if(num2==1 && num4==5 && num6==9)
        {
          System.out.println("!Ganaste jugador 2") ;  
        } 
        
        
         if(num1==3 && num3==5 && num5==7)
        {
           System.out.println("!Ganaste jugador 1") ;
           
        }
        
          if(num2==3 && num4==5 && num6==7)
        {
          System.out.println("!Ganaste jugador 2") ;  
        }      
    }
}
