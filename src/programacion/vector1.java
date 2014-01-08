package programacion;
import java.util.Scanner;

public class vector1 {
    final static int TAMANYO=3;
    
    public static void main (String []args){
        int num=0;
        int[]vector2={0,0,0};
        int[] vector=new int [TAMANYO];
        Scanner sc=new Scanner (System.in);
        
        for (int i=0;i<vector.length;i++){
            System.out.println("Dame un valor");
            vector[i]=sc.nextInt();
    }
            System.out.println("Dame un numero para que multiplique");
            num=sc.nextInt();
            
            for (int i=0;i<vector.length;i++){
            vector2[i]=num*vector[i];
            System.out.print(vector2[i]);
    }
                  
}
    
}