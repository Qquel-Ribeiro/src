// ler um numero inteiro e imprimir se ele é primo ou nao usando for

import javax.swing.JOptionPane;

public class questao26 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um numero inteiro: "));
        int i = 1;
        int contador = 0;
        for (i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                contador++;
            }
        }
        if (contador == 2) {
            JOptionPane.showMessageDialog(null,"O numero digitado é primo");
        } else {
            JOptionPane.showMessageDialog(null,"O numero digitado não é primo");
        }
    }
}