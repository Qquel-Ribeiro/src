
package exercicios;

import java.math.BigInteger;
import javax.swing.JOptionPane;



public class Exercicio29 {

   
    public static void main(String[] args) {
    
        BigInteger valor=BigInteger.ONE;
        BigInteger soma=BigInteger.ZERO;
        for (int i=1; i<=64; i++){
            if (i>1){
                valor=valor.multiply(BigInteger.TWO);
            }
            soma=soma.add(valor);
            System.out.println(i + " = "+valor);
           
        }
        JOptionPane.showMessageDialog(null, "Quantidade total de graos "+ soma);
    }
    
    
}
