package programacion;

public class ejemplostring6 {

    public static void main (String []args){
        String cadena="hola a todos";
        String cadena2="";
        
        for (int i =0;i<cadena.length();i++){
            cadena2+=Character.toUpperCase(cadena.charAt(i));
        }      
            
     System.out.println(cadena2);         
    }
     
}
   

