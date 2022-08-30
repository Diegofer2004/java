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
public class PrimeroAdsi209 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena;
        boolean toma;
        int numero;
        float de;
        
        String numero1= JOptionPane.showInputDialog(null,"Ingrese el primer numero");
        String numero2=JOptionPane.showInputDialog(null,"Ingrese el segundo numero");
        
        int num1=Integer.parseInt(numero1);
        int num2=Integer.parseInt(numero2);
        
        int total=num1+num2;
        
        JOptionPane.showMessageDialog(null, total);
        
       
        
                
                
                
    }
    
    
    
    
}
