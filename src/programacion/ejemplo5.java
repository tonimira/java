import java.util.*;


public class ejemplo5{
    public static void main (String[]args){
    int num1, num2, resultado=0;
    int total;
    char car;
    Scanner sc=new Scanner(System.in);
    System.out.println("Dame el primer numero");
    num1=sc.nextInt();
    System.out.println("Dame el segundo numero");
    num2=sc.nextInt();
    System.out.println ("Introduce el operador que vas a aplicar (+  -  *  /)");
    car=sc.next().charAt(0);
    
    total=operacion(num1, num2, car);
    System.out.println("El resultado final es "+total);
}


    public static int operacion (int a, int b, char op){
    int total=0;
    
        switch (op){
            case '+':total= a + b;
            break;
	    case '-': total =a-b;
            break;
            case '*': total= a * b;
            break;
	    case '/':total= a/b;
	    break;
                       
        }
            return total;	
}
}