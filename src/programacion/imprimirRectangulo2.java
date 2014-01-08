package programacion;
import java.util.Scanner;


public class imprimirRectangulo2 {
    
    public static void main (String []args){
      int bas;
      int alt;
      Scanner sc=new Scanner(System.in);
      
      System.out.println("Dame una base");
      bas=sc.nextInt();
      System.out.println("Dame una altura");
      alt=sc.nextInt();
      construccion(bas, alt);
      
    }


    
    public static void construccion (int b, int a){
        for (int i=0;i<a;i++){
            
            for (int j=1;j<=b;j++){
            
            if (i==0 || i==a-1){
                System.out.print("*");
              
            }
            
            if ((i>=1 && i<a-1)&& (j>1 && j<b)){
                System.out.print(" ");
            }
            
            if ((i>=1 && i<a-1)&& (j==1 || j == b)){
                System.out.print("*");
            }
        }
            System.out.println("");
    }
    
}
}