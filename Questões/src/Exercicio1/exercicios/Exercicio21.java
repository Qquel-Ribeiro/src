
package exercicios;

import javax.swing.JOptionPane;

public class Exercicio21 {

   
    public static void main(String[] args) {
    //SE TODO O ANO FOSSE DE FERIAS ALEGRES, DIVERTIRMO-NOS TORNAR-SE-IA MAIS ABORRECIDO DO QUE TRABALHAR!
//A)LETRA A = 10 ,LETRA Z=0
//B)100 CARACTERES
//C)43 consoantes
//D) LETRA V
//E)1
//
    String caracteres="";
    
    caracteres= JOptionPane.showInputDialog(null, "Digite os caracteres");
    System.out.println("O caracter é"+caracteres);
    int qtdCaracteres = caracteres.length();
    int qtdA=0;
    int qtdZ=0;
    int qtdConsoantes=0;
    int qtdExclamacao =0;
    int maiorValor =0;
    char maiorLetra=' ';
    System.out.println("letra B)quantidade:"+qtdCaracteres);
    
    for (int i=0;i<qtdCaracteres;i++){
        char c = caracteres.charAt(i);
        if (c == '#'){
            JOptionPane.showMessageDialog(null,"Caracter '#' encontrado..finalizando analise");
            break;
        }
        int valor = c;
        if (valor > maiorValor){
            maiorLetra = c;
            maiorValor = valor;
        }
        if (c == 'A'){
            qtdA = qtdA + 1;
        }
        if (c == 'Z'){
            qtdZ = qtdZ + 1;
        }
        if (c == 'B' || c == 'C'||c == 'D' ||c == 'F'
                ||c == 'G' ||c == 'H' ||c == 'J'
                ||c == 'K' ||c == 'L' ||c == 'M' ||c == 'N' ||c == 'P'
                ||c == 'Q' ||c == 'R' ||c == 'S' ||c == 'T' ||c == 'V' ||
                c == 'W' ||c == 'X' ||c == 'Y' ||c == 'Z'){
        qtdConsoantes = qtdConsoantes + 1;
        
    }
        if (c == '!'){
            qtdExclamacao = qtdExclamacao +1;
        }
        //System.out.println(c);
        
    }
    JOptionPane.showMessageDialog(null,
    "Quantidade de letras A "+ qtdA+
    "\nQuantidade de letras Z "+ qtdZ+
    "\nQuantidades de consoantes "+ qtdConsoantes+
    "\nQuantidade de exclamação "+ qtdExclamacao+
    "\nMaior letra "+maiorLetra);
    }
    
    
}
