package programacion;
import java.util.Scanner;

public class matrices6 {
    public static void main (String []args){
        Scanner sc=new Scanner(System.in);
        int[][] m;
         System.out.println("Dime número de filas");
        int filas=sc.nextInt();
        
        System.out.println("Dime número de columnas");
        int columnas=sc.nextInt();
        
        m=new int[filas][columnas];
        
}
public static void rellenarMatriz (int [][]m){
        Scanner sc=new Scanner (System.in);
        for (int i=0;i<m.length;i++){
            for (int j=0;j<m[i].length;j++){
                System.out.println("Dame un valor");
                m[i][j]=sc.nextInt();
            }
        }
}
    
    
    
    
    public static boolean esCuadrada (int[][] m){
    return m.length==m[0].length;
    }
    
    
    public static boolean esTraspuesta (int[][] m){
        for (int i=0;i<m.length;i++){
            for (int j=0;j<m[0].length;j++){
                return m[i][j]==m[j][i];
            }}
        
        
    }
    
    public static boolean esSimetrica (int[][] m){
        if(esCuadrada(m)==true&& esTraspuesta(m)==true){
            System.out.println("Es una matriz simetrica");
       
        }
        else{
            System.out.println("No es simetrica");
            
            }
    }

}

   
}