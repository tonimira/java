package programacion;

public class ejemplostring10 {
    public static void main (String []args){
        String cadena="hola a todos";
        String cadena2="";
             
        
        for (int i=0;i<cadena.length();i++){
            if (cadena.charAt(i)>=97 && cadena.charAt(i)<=123)
                   
            cadena2+= (char) ( cadena.charAt(i) - 32);
            
            else{
                cadena+=cadena.charAt(i);
            }
               
            }
        System.out.println(cadena2);
    }
    
    }
    

