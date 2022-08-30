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
public class sumas_Y_restas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String op = JOptionPane.showInputDialog(null, "ingresar simbolo de la operación");
        String numero1 = JOptionPane.showInputDialog(null, "ingresar primer numero");
        String numero2 = JOptionPane.showInputDialog(null, "ingresar segundo numero");

        int num1 = Integer.parseInt(numero1);
        int num2 = Integer.parseInt(numero2);
        int total = 0;
//
//        if (op.equals("+")) {
//            total = num1 + num2;
//        } else {
//            if (op.equals("-")) {
//                total = num1 - num2;
//            } else {
//                if (op.equals("*")) {
//                    total = num1 * num2;
//                } else {
//                    if (op.equals("/")) {
//                        total = num1 / num2;
//                    }
//                }
//            }
//        }
//            
//        JOptionPane.showMessageDialog(null,"El resultado de su op "+total);

        switch (op) {
            case "+":
                total = num1 + num2;
                break;

            case "-":

                total = num1 - num2;

                break;

            case "*":
                total = num1 * num2;
                break;

            case "/":

                total = num1 / num2;
                break;
        }
        
        JOptionPane.showMessageDialog(null,"El resultado de su op "+total);

        
        
        
        
    }

}
