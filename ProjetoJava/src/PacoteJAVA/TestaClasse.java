package PacoteJAVA;

public class TestaClasse {
    
    //método principal é uma classe executável
    public static void main(String args[]){
        
        //Para executar um método de outra classe segue:
        double resp = PrimeiroMetodo.somaValor(20.55, 10.53);
        
        System.out.println("A soma = "+resp);
        
        PrimeiroMetodo.somarValor();
        
        PrimeiroMetodo.somandoValor(31.50, 21.50);
        
        String resposta = PrimeiroMetodo.imprimeTexto("Etecia");
        
        System.out.println("O texto retornado = "+resposta);
        
        PrimeiroMetodo.imprimirTexto("Escola Técnica");
               
        
    }
    
}
