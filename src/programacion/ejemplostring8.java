

package programacion;

public class ejemplostring8 {

    public static void main (String []args){
        String cadena="El ninyo esta nyonyo";
        String cadena2="";
        
        for (int i=0;i<cadena.length();i++){
            if (cadena.charAt(i)=='n' && cadena.charAt(i+1)=='y'){
                cadena2+='ñ';
                i++;
            }else{
            //importante añadir el else, que es cuando la condicion no se cumple//
            cadena2+=cadena.charAt(i);
            }
        }
        System.out.println(cadena2);
    }
    
}
