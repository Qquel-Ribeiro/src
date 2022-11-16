// algoritmo que imprime a constante de euler

import javax.swing.JOptionPane;

public class questao28 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um numero inteiro: "));
        int i = 1;
        double euler = 1;
        while (i <= numero) {
            euler += 1 / fatorial(i);
            i++;
        }
        JOptionPane.showMessageDialog(null,"O numero digitado é: " + euler);
    }
    public static double fatorial(int numero) {
        int i = 1;
        double fatorial = 1;
        while (i <= numero) {
            fatorial *= i;
            i++;
        }
        return fatorial;
    }
}