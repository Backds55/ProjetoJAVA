package PacoteJAVA;

public class PrimeiroExemplo {
    //declarando as variáveis globais - estão dentro da classe e fora dos métodos.
    static double valor1,valor2, resultado=0;
    
    //método principal que executa a classe
public static void main(String args[]){
    //System.out.println("Exemplo de uma classe em Java");
    
    //SegundoExemplo.escrever();
    
    //declarando as variáveis locais - porque estão dentro de um método
    int num1,num2,resp=0;//inicialiando a variável resp
    
    //declaração de uma variável constante
    final double pi = 3.14161835;
    
    //inicializar as variáveis
    //o simbolo de = significa que está atribuindo valor
    //resp = 0;//limpar o valor e colocar um valor sem que altere o calculo
    num1 = 10;
    num2 = 20;
    
    //Realizar uma operação
    
    resp = num1 + num2;
    
    System.out.println("A soma é : "+resp);
    
    valor1=25;
    valor2=25;
    
    resultado = valor1 * valor2 * pi;
    
    System.out.println("O valor do resultado é: "+resultado);
    
    double numero = 3.258;
    
    int numerodois = (int) numero;
    
    System.out.println("Imprime = "+numerodois);
      
       
}    
       
}
