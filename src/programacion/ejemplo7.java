package programacion;
import java.util.Scanner;


 
public class ejemplo7 {

    public static void main (String []args){
        Scanner sc=new Scanner (System.in);
        String cadena="";
        System.out.println("Dame una cadena");
        cadena=sc.nextLine();
        char [] vector= new char [cadena.length()];
        
        for (int i=0;i<vector.length;i++){
            vector[i]=cadena.charAt(i);
            
        }
        int tamanyo=vector.length-1;
        
        for (int i=0;i<vector.length;i++){
            if (vector[i]=='n' && vector [i+1]=='y'){
                vector [i]='ñ';
                
                for (int j=i+1; j<tamanyo;j++){
                    vector [j]=vector [j+1];
                }
                vector [tamanyo--]=' ';
            }
            
        }
        
        System.out.println(vector);
    }
}
