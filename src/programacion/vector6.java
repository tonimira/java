package programacion;
import java.util.Scanner;

public class vector6 {
    final static int TAMANYO=3;
    
    public static void main (String[] args){
        int [] vector=new int [TAMANYO];
        vector=rellenarVector(vector);
        int [] vector2=new int [TAMANYO];
        vector2=rellenarVector(vector2);
        sumaVectores(vector,vector2);
        mostrarVector(vector);
        System.out.println("vector resultante es: "+ vector3);
            }
     public static int [] rellenarVector(int[] v){
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<v.length;i++){
            System.out.println("dame elemento");
            v[i]=sc.nextInt();
        }
        return v;
     }
     public static void mostrarVector(int []v){
        for (int i=0;i<v.length;i++){
            System.out.println(v[i]+ " ");
        }
        System.out.println("");}
        
     public static void sumaVectores (int []v1, int []v2, int []v3){
         
         for (int i=0;i<v1.length;i++){
         v3[i]=v1[i]+v2[i];
         }
     return v3;
    }
}