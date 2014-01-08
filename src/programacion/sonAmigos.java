package programacion;


public class sonAmigos {
    
    public static boolean sonAmigos (int a, int b){
        
        if ((sumadivisores2(a)==b) && (sumadivisores2(b)==a)){
            return true;
        }
        else{
            return false;
        }
    }
    public static int sumadivisores2(int num){
        int sumadivisores=0;
        int divisor=1;
        while (num>divisor){
            if (num%divisor==0){
                //System.out.println(divisor);
                sumadivisores+=divisor;
            }
        }
    }
}
