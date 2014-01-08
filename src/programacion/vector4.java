package programacion;
import java.util.Scanner;


public class vector4 {
     
       final static int TAMANYO=20;       

    public static void main (String[]args){
        
        char[] vector=new char [TAMANYO];
        String cadena="El ninyo esta nyonyo";
         for (int i=0;i<cadena.length();i++){
            vector[i]=cadena.charAt(i);}
        
        
              
        for (int i=0;i<vector.length;i++){
             if (vector[i]=='n' && vector [i+1]=='y'){
                 vector[i]='ñ';
                 
             for (int j=i+1;j<vector.length-1;j++){    
                 vector [j]=vector[j+1];
                                             
                 }                   
                 vector[vector.length-1]=' ';}
                    
              }
          
           System.out.println(vector);
     
    }   

}

