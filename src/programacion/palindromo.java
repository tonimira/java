package programacion;
import java.util.Scanner;

public class palindromo {
    
    public static void main (String []args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Dame una frase");
        String  frase=sc.nextLine();
        frase=frase.toLowerCase();
        char [] vector=frase.toCharArray();
        char [] vector2=new char [vector.length];
        
        int j=0;
         
        //quitar espacios
        
        for (int i=0;i<vector.length;i++){
            if (vector [i]!=' '){
                vector2[j]=vector[i];
                j++;
            }
            
        }
        
        boolean palindromo=true;
        int i=0;
        
        while (i<=j/2 && palindromo){
            palindromo=vector2[i]==vector2[j-1-i];
            i++;
        }
        
        if (palindromo){
            System.out.println("Es Palindroma");
            
        }
        else { 
            System.out.println("No es palindroma");
        }
    }
}