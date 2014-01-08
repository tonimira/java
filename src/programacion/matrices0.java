package programacion;
import java.util.Scanner;






public class matrices0 {
    public static void main (String []args){
            
       int [][] m=new int [3][3];
            
    
            
    for (int i =0;i<3;i++){
            
        for (int j=0; j<3;j++){
          if (m[i]==m[j]){
              m [i][j]=1;}
              else {
                      m[i][j]=0;
                      }
             
                             }         
        
                            }
    for (int i=0;i<3;i++){  
            
        for (int j=0;j<3;j++){
                    System.out.print(m[i][j]+" ");        
                            }
                    System.out.println("");
                        }
      
        
    
                                        }
    
                    }
