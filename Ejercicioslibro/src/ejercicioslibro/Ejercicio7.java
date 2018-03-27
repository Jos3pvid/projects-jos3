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
public class Ejercicio7 {
    
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el Número") ;
        int dig1 = sc.nextInt();
        
       
        if(dig1<=-11 && dig1>=-97)
        {
            if( dig1==-11 || dig1==-13 || dig1==-17 || dig1==-19 || dig1==-23 || dig1==-29 || dig1==-31 )
            {
                System.out.println("El numero " + dig1 + " Es primo y es negativo");
            }
            
            if( dig1==-37 || dig1==-41 || dig1==-43 || dig1==-47 || dig1==-53 || dig1==-59 || dig1==-61 )
            {
                System.out.println("El numero " + dig1 + " Es primo y es negativo");
            }
            
             if( dig1==-67 || dig1==-71 || dig1==-73 || dig1==-79 || dig1==-83 || dig1==-89 || dig1==-97 )
            {
                System.out.println("El numero " + dig1 + " Es primo y es negativo");
            }
             
        }
            else{
                 System.out.println("El numero " + dig1 + " No es primo");
             } 
             
               
    }
      


}


        
            
        
    
    
            
            
            
            




            

  
            




