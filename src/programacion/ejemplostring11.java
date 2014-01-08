package programacion;
import java.util.Scanner;


public class ejemplostring11 {

    public static void main (String [] args){
    Scanner sc=new Scanner(System.in);
		String datos;
		int coma=0;
                
                
                
                System.out.println("Dame tus datos ");
		datos=sc.next();
                
                for (int i=0;i<datos.length();i++){
                    if (datos.charAt(i)==','){
                    coma=i;
                                     
                         }   
                }
                String apellidos=datos.substring(0,coma);
                String nombre=datos.substring(coma+1,datos.length());
                
                System.out.println(nombre+ " " + apellidos);
                }
    }
               
