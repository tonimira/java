

package programacion;


public class matriz6 {
    
}

public static boolean esSimetrica (int[][] m){
    boolean esSimetrica=true;
if (esCuadrada(m)){
for (int i=0;i<m.length && esSimetrica;i++){
for (int j=0;j<m,length;j++){
if (m[i][j]!=m[j][i]){
    esSimetrica=false;

}
}
}
}else
esSimetrica=false;
}