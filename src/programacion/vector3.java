    package programacion;
    import java.util.Scanner;


    public class vector3 {
        final static int TAMANYO=5;

        public static void main (String []args){
            Scanner sc=new Scanner (System.in);

            int []vector=new int[TAMANYO];


            for (int i=0;i<vector.length;i++){
                System.out.println("dame un numero");
                vector[i]=sc.nextInt();            
            }
                int min=vector[0];
                int max=vector[0];
            for (int i=0;i<vector.length;i++){
                if (vector[i]>max){
                    max=vector[i];}
                if (vector[i]<min){
                    min=vector[i];}

                }
            System.out.println("El maximo es "+max);
            System.out.println("El minimo es "+min);
            }


        }


