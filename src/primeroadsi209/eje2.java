/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeroadsi209;

import javax.swing.JOptionPane;

/**
 *
 * @author SENA
 */
public class eje2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String numero = JOptionPane.showInputDialog("Ingrese un numero entero");
        int num = Integer.parseInt(numero);

        if (num > 0) {
            String numero2 = JOptionPane.showInputDialog("Ingrese segundo numero");
            int num2 = Integer.parseInt(numero);
            
            int ts=num+num2;
            int tr=num-num2;
            
            JOptionPane.showMessageDialog(null,"Resultado de la suma es: \t"+ts+" \nResultado de la Resta es: \t"+tr);
            
            
            
            
        }

    }

}
