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
public class Ejercicio6 {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite un numero:");
        int num= sc.nextInt();
       
        if(num>=10 && num<=20)
        {
            
            if(num/num==1 && num/1==11)
                
        {  
          System.out.println("Es primo");
          
          
        }
             if(num/num==1 && num/1==13)
                
        {  
          System.out.println("Es primo");  
        }
              if(num/num==1 && num/1==17)
                
        {  
          System.out.println("Es primo");
           
        }
               if(num/num==1 && num/1==19)
                
        {  
          System.out.println("Es primo");
      
        }
               else
            {
                System.out.println("No es un numero primo");
            }
    }
    
    else
    {
    System.out.println("Digite un valor que este dentro del intervalo");
}
}
}