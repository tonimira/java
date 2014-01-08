package programacion;
import java.util.Scanner;

public class vector2 {
    final static int TAMANYO=5;
    
    public static void main (String []args){
        Scanner sc=new Scanner (System.in);
        char[] vector=new char [TAMANYO];
        char[] vector2=new char [TAMANYO];
        char aux=0;
        
        for (int i=0;i<vector.length;i++){
            System.out.println("Dame un caracter");
            vector[i]=sc.next().charAt(0);}
        
        for (int i=0;i<vector.length;i++){
            System.out.println("Dame mas caracteres");
            vector2[i]=sc.next().charAt(0);}
        
        for (int i=0;i<vector.length;i++){
            aux=vector[i];}
        for (int i=0;i<vector.length;i++){
            vector[i]=vector2[i];
            System.out.print(vector[i]);}
        for (int i=0;i<vector.length;i++){
            vector2[i]=aux;
            System.out.print(vector2[i]);}
        
        
        
            
        }
        
        
        
}

    
