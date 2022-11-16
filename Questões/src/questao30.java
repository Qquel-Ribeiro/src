// faca um algoritmo para imprimir a quantidade de numeros primos entre 1 e 1000

import javax.swing.JOptionPane;

public class questao30 {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        int contador = 0, numeroPrimo = 0;
        while (i <= 1000) {
            while (j <= i) {
                if (i % j == 0) {
                    contador++;
                }
                j++;
            }
            if (contador == 2) {
                numeroPrimo++;
            }
            i++;
            j = 1;
            contador = 0;
        }
        JOptionPane.showMessageDialog(null,"A quantidade de numeros primos entre 1 e 1000 é: " + numeroPrimo);
    }
}