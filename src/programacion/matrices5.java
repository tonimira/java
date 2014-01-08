 package programacion;
import java.util.Scanner;

public class matrices5 {
    
    public static void main (String []args){
        Scanner sc=new Scanner(System.in);
        int[][] matriz;
        System.out.println("Dime número de filas");
        int filas=sc.nextInt();
        
        System.out.println("Dime número de columnas");
        int columnas=sc.nextInt();
        
        matriz=new int[filas][columnas];
        
         for (int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz[0].length;j++){
                System.out.println("Dame un valor");
                matriz[i][j]=sc.nextInt();}
                                            }          
         
                        
            for(int i=0;i<matriz.length;i++){
                for (int j=0;j<matriz[0].length;j++){
                if (matriz[i][j]!=matriz[j][i]){
                    System.out.println("No es simetrica");
                  
                }
                else{
                    System.out.println("Es simetrica");
                
                    } 
                                                    }     
           
                                            }
                                            }
         
                }            