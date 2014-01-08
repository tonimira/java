package programacion;
import java.util.Scanner;


public class leerTriangulo {




  
    public static void main (String []args){
      int lado1;
      int lado2;
      int lado3;
      Scanner sc=new Scanner(System.in);
      
      System.out.println("Dame lado");
      lado1=sc.nextInt();
      System.out.println("Dame lado");
      lado2=sc.nextInt();
      System.out.println("Dame lado");
      lado3=sc.nextInt();
      
      
      if(lado1==lado2&& lado2==lado3){
          System.out.println("El triangulo es equilatero");}
      
      else if (lado1==lado2 ||lado1==lado3|| lado2==lado3){
          System.out.println("El triangulo es isosceles");}
    
      if (lado1!=lado2 && lado2!=lado3){
          System.out.println("El triangulo es escaleno");
      }
    }
    }
