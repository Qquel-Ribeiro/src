import javax.swing.JOptionPane;

// algoritmo para calcular o MDC de dois numeros usando o metodo de euclides usando for


public class questao25 {
  public static void main(String[] args) {
      int a = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o primeiro numero: "));
      int b = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o segundo numero: "));
      int r = 0;
      for (int i = 1; i <= a; i++) {
          r = a % b;
          a = b;
          b = r;
      }
      JOptionPane.showMessageDialog(null,"O MDC é: " + a);
  }
}