package programacion;
import java.util.Scanner;

public class vector5 {
    final static int TAMANYO=5;
    
    public static void main (String []args){
        int [] vector=new int [TAMANYO];
        vector=rellenarVector(vector);
        mostrarVector(vector);
        System.out.println("El tamanyo es: "+ devuelveTamanyoVector(vector));
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
        System.out.println("");
    }
    public static int devuelveTamanyoVector(int[] v){
        return v.length;
}
    
}
