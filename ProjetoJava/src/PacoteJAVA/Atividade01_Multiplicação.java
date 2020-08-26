package PacoteJAVA;

import javax.swing.*;

public class Atividade01_Multiplicação {
    
     public static void main(String args[]){
        
        double num1, num2, resp=0;
        String aux=""; 
        
        aux = JOptionPane.showInputDialog(null, "Insira o primeiro número:");
        
        num1 = Double.parseDouble(aux);
        
        aux = JOptionPane.showInputDialog(null, "Insira o segundo número:");
        num2 = Double.parseDouble(aux);
        
        resp = num1 * num2;
        JOptionPane.showMessageDialog(null, "O resultado da multiplicação é: "+resp);
                
                
                
              
        
   }
    
}
