
package exercicios;

import javax.swing.JOptionPane;

public class Exercicio23 {

   
    public static void main(String[] args) {
    int valor=0;
    int qtdValorAte25=0;
    int qtdValorAte50=0;
    int qtdValorAte75=0;
    int qtdValorAte100=0;
   // String svalor;
    while (valor >=0){
        valor=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a nota"));
        
        if (valor <=0){
            break;
            
        }
        else if ( valor <=25){
            qtdValorAte25 =qtdValorAte25 +1;
        }
        else if ( valor <=50){
            qtdValorAte50 =qtdValorAte50 +1;
        }
        else if ( valor <=75){
            qtdValorAte75 =qtdValorAte75 +1;
        }
        else if ( valor <=100){
            qtdValorAte100 =qtdValorAte100 +1;
        }
        else {
            System.out.println("O valor maior que 100 é desconsiderado");
        }
    }
    
    JOptionPane.showMessageDialog(null, "\nQuantidade até 25 = "+ qtdValorAte25 +
"\nQuantidade até 50 = "+ qtdValorAte50 +
"\nQuantidade até 75 = "+ qtdValorAte75 +
"\nQuantidade até 100 = "+ qtdValorAte100);
    
    
      
    
    }
    
    
}
