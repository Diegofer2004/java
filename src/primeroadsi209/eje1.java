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
public class eje1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String numero=JOptionPane.showInputDialog("Ingrese un numero entero");
       int num=Integer.parseInt(numero);
        if (num>0) {
            JOptionPane.showMessageDialog(null,"El numero es positivo");
        }else{
            if (num<0) {
                JOptionPane.showMessageDialog(null,"El numero es negativo");
            }else{
                JOptionPane.showMessageDialog(null,"El numero es neutro");
            }
        }
       
    }
    
}
