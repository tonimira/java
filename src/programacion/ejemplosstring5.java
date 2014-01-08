package programacion;

public class ejemplosstring5 {

    public static void main (String []args){
        String cadena="hola a todos";
        String cadena2="";
        
        for (int i =0;i<cadena.length();i++){

		switch (cadena.charAt(i)){
			case 'a': case 'e': case 'i': case 'o': case 'u': 
				cadena2+=cadena.charAt(i);
			             
                }
        }
        System.out.println(cadena2);}
}