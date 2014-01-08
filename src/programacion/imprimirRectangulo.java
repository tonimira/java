package programacion;
import java.util.Scanner;


public class imprimirRectangulo {
    
    public static void main (String []args){
      int base;
      int altura;
      Scanner sc=new Scanner(System.in);
      
      System.out.println("Dame una base");
      base=sc.nextInt();
      System.out.println("Dame una altura");
      altura=sc.nextInt();
      construccion(base, altura);
      
    }
    
    public static void construccion (int b, int a){
        for (int i=0;i<=b-1;i++){
              System.out.print("*");}
        
              System.out.println(" ");
              
              for (int i=1;i<a-1;i++){
              System.out.print("*");
              
                for (int j=1;j<b-1;j++)
                {
                    System.out.print(" ");
                }
                  System.out.println("*");
                                    }
              for (int i=0;i<=b-1;i++)
              {
                  System.out.print("*");
              }
        }
                
        
    
    }
           
        
    
   

