/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.text.DecimalFormat;

/**
 *
 * @author Thomas
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float prix = 0.33F;
        float solde = 0.98F;
        float total = 0.00F;
        
        DecimalFormat df = new DecimalFormat("0.00");
        
        for (float i = 1F ; i < 20; i++) {            
            total = i * prix;
            if (total > solde) {
                System.out.println("total : " + df.format(total) + " nombre de café : " + i + " il faut rajouter : " + df.format(total - solde));
            } else {
                System.out.println("total : " + df.format(total) + " nombre de café : " + i);
            }
        }        
    }    
}
