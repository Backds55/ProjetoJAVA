package PacoteJAVA;

import javax.swing.*;

public class Atividade1_MétodosJOP {

    public static void main(String[] args) {
        double valor1, valor2, resultado;
        String aux = "";

        aux = JOptionPane.showInputDialog(null, "Insira o primeiro número:");
        valor1 = Double.parseDouble(aux);

        aux = JOptionPane.showInputDialog(null, "Insira o segundo número:");
        valor2 = Double.parseDouble(aux);

        resultado = Atividade1_Test.multiplicarValor(valor1, valor2);

        JOptionPane.showMessageDialog(null, "O resultado da multiplicação é = " + resultado);
    }

}