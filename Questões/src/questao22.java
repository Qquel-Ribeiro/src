

 
import javax.swing.JOptionPane;

public class questao22 {
    public static void main(String[] args) {
    
        int n=0, qtdFilhos=0, qtdPessoas = 0;
        double salario=0, mediaSalario = 0, mediaFilhos = 0, maiorSalario = 0, percSalario = 0;
        for (int i = 1; i > 0; i++) {
            salario = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o salario da pessoa " + (n+1) + ": "));
            if (salario > 0) {
                qtdFilhos = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a quantidade de filhos da pessoa " + (n+1) + ": "));
            }
            if (salario > 0) {
                mediaSalario += salario;
                mediaFilhos += qtdFilhos;
                qtdPessoas++;
                if (salario > maiorSalario) {
                    maiorSalario = salario;
                }
                if (salario < 200) {
                    percSalario++;
                }
            } else {
                i = -1;
            }
            n++; 
        }
      
        mediaSalario /= n;
        mediaFilhos /= n;
        percSalario = (qtdPessoas * 100) / n;

        JOptionPane.showMessageDialog(null,"A media de salarios é: " + mediaSalario + "\nA media de filhos é: " + mediaFilhos + "\nO maior salario é: " + maiorSalario + "\nA porcentagem de pessoas com salario menor que 200 é: " + percSalario + "%");
      
    }
}
