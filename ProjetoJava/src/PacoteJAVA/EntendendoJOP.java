package PacoteJAVA;

//importar as bibliotecas para uso na classe
import javax.swing.*;

public class EntendendoJOP {
    
    public static void main(String args[]){
        //declaração das variáveis locais
        double num1,num2, resp=0;
        String aux=""; //Inicializei uma string com vazio.
        
    aux = JOptionPane.showInputDialog(null,"Insira o primeiro número");
    //conversão de tipos utilizando parse();
    //converte o tipo string para o valor necessário.
    num1 = Double.parseDouble(aux);
    
    aux = JOptionPane.showInputDialog(null,"Insira o segundo número");
    num2 = Double.parseDouble(aux);
    
    resp = num1+num2;
    
    JOptionPane.showMessageDialog(null, "A soma é "+resp);
        
        
        
        
        
    }
    
}
