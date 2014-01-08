import java.util.*;

public class ejemplo4{
    
    public static void main (String[]args){
        int num1, num2, resultado=0;
        Scanner sc=new Scanner(System.in);
        System.out.println ("dame un numero");
        num1=sc.nextInt();
        System.out.println ("dame otro numero");
        num2=sc.nextInt();
        resultado=suma(num1,num2);
        
        System.out.println("La suma es: "+resultado);
    }
    
    public static int suma (int a, int b){

        return a+b;
        }
}