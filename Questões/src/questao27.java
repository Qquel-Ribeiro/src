// tabela de equivalencia de unidades de temperatura, celcuis, fahrenheit e kelvin de 0 a 100

import javax.swing.JOptionPane;


public class questao27 {
    public static void main(String[] args) {
        double celsius = 0, fahrenheit = 0, kelvin = 0;
        String valoresString = "";
        for (int i = 0; i <= 100; i++) {
            celsius = i;
            fahrenheit = (celsius * 9/5) + 32;
            kelvin = celsius + 273.15;
            valoresString = valoresString + " " + celsius + "        |     " + fahrenheit + "          |       " + kelvin + "\n ";
        } 
        JOptionPane.showMessageDialog(null, "Celcius  |  Fahrenheit   |   Kelvin \n" + valoresString);
    }
  
    
}
