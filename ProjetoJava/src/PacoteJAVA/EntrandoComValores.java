package PacoteJAVA;

import javax.swing.*;

public class EntrandoComValores {

    public static void main(String[] args) {
        double valor1, valor2, resultado;
        String aux = "";

        aux = JOptionPane.showInputDialog(null, "Entre com o primeiro valor");
        valor1 = Double.parseDouble(aux);

        aux = JOptionPane.showInputDialog(null, "Entre com o segundo valor");
        valor2 = Double.parseDouble(aux);

        resultado = PrimeiroMetodo.somaValor(valor1, valor2);

        JOptionPane.showMessageDialog(null, "O resultado da soma é = " + resultado);
    }

}
