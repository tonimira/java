package programacion;

public class ejemplostring9 {
    public static void main (String []args){
        String cadena="hola2344 a todos55";
        String cadena2="";
        int cont=0;
        int suma=0;
        
        for (int i=0;i<cadena.length();i++){
            if (cadena.charAt(i)>='0'&& cadena.charAt(i)<='9'){
                suma+=(int)cadena.charAt(i) - (int)'0';
                System.out.println(suma);
                // Primero se hace una conversion de tipos (pasa de tipo char a tipo int) y despues se resta su valor equivalente en la tabla ascii al valor 0 de la tabla ascii para coger el valor numerico real//
            }
        }
    
    }
    
}
