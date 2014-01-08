package programacion;


public class ejemplostring7 {

    public static void main (String []args){
        
        String cadena="hola2344 a todos552";
        String cadena2="";
        int cont=0;
        int suma=0;
        char ch=0;
        for (int i=0;i<cadena.length();i++){
            
            if (Character.isDigit(cadena.charAt(i))){
                cont++;
                suma+=Character.digit(cadena.charAt(i), cadena.length());
            //en este metodo, se pone cadena.length fijando el maximo como el tamaño de la cadena//
            }
        }
            System.out.println("Hay un total de "+cont+ " digitos");
            System.out.println("La suma de de todos los digitos es de "+suma);
    }
    
    
}
