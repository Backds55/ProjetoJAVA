package PacoteJAVA;

public class PrimeiroMetodo {
    
    //criando um método com parâmetros e com retorno
    public static double somaValor(double v1, double v2){
        return (v1+v2);
    }
    //método sem parâmetro e sem retorno
    //Executa por si mesmo
    public static void somarValor(){
        double v1, v2, resp;
        v1=10.5;
        v2=10.5;
        resp = v1+v2;
        System.out.println("Somar Valor = "+resp);
    }
    //Método sem retorno mas com parâmetros
    public static void somandoValor(double v1,double v2){
        
        double resp = (v1+v2);
        
        System.out.println("Somando valor = "+resp);
    }
    public static String imprimeTexto(String texto){
        return texto;
    }
    
    public static void imprimirTexto(String texto){
        System.out.println("Texto impresso = "+texto);
    }
}
