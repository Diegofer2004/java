/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeroadsi209;

/**
 *
 * @author SENA
 */
public class arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int numeros[]={1,2,3,4,100,6,7,8,9};
//        for (int i = 0; i < numeros.length; i++) {
//            int nums9=numeros[i];
//            System.out.println(String.valueOf(nums9));
//            
//        }
        
        int numeros[]=new int[10];        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("guardando numero--> "+i*5);
            numeros[i]=i*5;
            
        }
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("imprimiendo");
            System.out.println(numeros[i]);
        }
        
        
        
        
        
        
        
        
        
        
    }
    
}
