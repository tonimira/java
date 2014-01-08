

public static int operacion(int a, int b, char op){

    int resultado=0;
        switch(op){
            case '+': resultado =a+b;break;
            case '-':resultado=a-b;break;
            case '*':resultado = a*b;break;
            case '/':resultado= a/b;break;
            default: System.out.println("operador invalido");
}
    return resultado;
}
}
}