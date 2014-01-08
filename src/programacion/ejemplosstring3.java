package programacion;

public class ejemplosstring3 {

    public static void main (String []args){
        String cadena="hola a todos";
        String cadena2="";
        
        for (int i =0;i<cadena.length();i++){
        //cadena.length es una funcion que calcula el tamaño de la cadena//
            cadena2+=cadena.charAt(i);
            //
        }   
                   
            
            System.out.println(cadena2);
    }
    
}