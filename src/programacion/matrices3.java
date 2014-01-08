
package programacion;

public class matrices3 {

    public static void main (String []args){
        int[][] m={{10,20,30},{40,50,60},{70,80,90}};
        int[][] m2=new int [m.length][m[0].length];
        
        for (int i=0;i<m.length;i++){
            System.arraycopy(m[i],2,m2[i],2,m[0].length-2);
        }
        
        for (int i=0;i<m2.length;i++){
            for (int j=0;j<m2[0].length;j++){
                System.out.print(m2[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
