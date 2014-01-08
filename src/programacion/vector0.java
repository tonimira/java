package programacion;
import java.util.Scanner;

public class vector0 {
    final static int TAMANYO=5;
    //se crea la constante de tipo entero, se nombra en mayusculas y se le asigna el valor
    
    public static void main (String []args){
        int[] vector=new int [TAMANYO];
                //otra forma de crear un vector es dandole el contenido
                int[] vector2={3,4,5,8,9};
        Scanner sc=new Scanner (System.in);
           //con esto se rellena un vector
        for (int i=0;i<vector.length;i++){
            System.out.println("Dame un valor");
            vector[i]=sc.nextInt();
    }
            // para mostrar el vector hay que hacer otro recorrido del vector, viendo lo que hemos almacenado posicion a posicion
    
        for (int i=0;i<vector.length;i++){
            System.out.print(vector [i]+" ");
        }
        
        for (int i=0;i<vector2.length;i++){
            System.out.print(" "+vector2[i]);
        }
    
    }
    
}
