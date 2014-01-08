package programacion;

public class ejemplosstring4 {

    public static void main (String []args){
        String cadena="hola a todos";
        String cadena2="";
        
        for (int i =0;i<cadena.length();i++){
            if (cadena.charAt(i)=='a'|| cadena.charAt(i)=='e'||cadena.charAt(i)=='i'||cadena.charAt(i)=='o'||cadena.charAt(i)=='u'){
                cadena2+=cadena.charAt(i);

            }
    }
        
        
        System.out.println(cadena2);
                 
            
        }
    
}