
package programacion;
import java.util.Random;
import java.util.Scanner;

public class rellenandoMatrices {
    
    
    public static void main (String[]args){
        Scanner sc=new Scanner (System.in);
        int [][]matriz;
        
        System.out.println("Dime numero de filas");
        int filas=sc.nextInt();
        
        System.out.println("Dime numero de columnas");
        int columnas=sc.nextInt();
        
        matriz=new int[filas][columnas];
        
        rellenandoMatrices(matriz);
        mostrarMatriz(matriz);
        
   }
    
    public static void rellenandoMatrices (int[][]m){
        Random r=new Random();
        
        for (int i =0;i<m.length;i++){
            for (int j=0;j<m[i].length;j++){
                m[i][j]=r.nextInt(9);
                
            }
    }
    }

    public static void mostrarMatriz (int [][]m){
        System.out.println("");
        for (int i =0;i<m.length;i++){
            for (int j=0;j<m[i].length;j++){
                System.out.print(m[i][j] + " ");
            }
                System.out.println("");
                }
}
}