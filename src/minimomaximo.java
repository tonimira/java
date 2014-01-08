import java.util.Scanner;

public class minimomaximo{

	public static void main (String[]args){
	Scanner sc=new Scanner(System.in);
	int num;
	long mayor=0;
	long menor=10000;
	long suma=0;
	long contador=0;
	long media= 0;
	
	System.out.println("Dame un numero");
	num=sc.nextInt();
	
	while (num>=0) {
		
	
            if (num >= mayor){
		mayor=num;}
            if (num <menor){
		menor=num;}
		contador = contador+1;
		suma= suma+ num;
		media = (suma/contador);		
		}            
                System.out.println("Dame un numero");
		
                System.out.println("El maximo es "+mayor);
		System.out.println("El minimo es "+menor);
		System.out.println("La media es "+media);
			
		}
	
}