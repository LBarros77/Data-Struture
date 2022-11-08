package com.mycompany.arraysclass;

import javax.swing.JOptionPane;

public class Arraysclass {

    public static void main(String[] args) {
        char old[][] = new char[4][4];
    
        for(int lin = 0; lin < old.length; lin++) {
            for(int col = 0; col < old.length; col++) {
                old[lin][col] = JOptionPane.showInputDialog("Input a x or 0").charAt(0);
            }
        }
    
        String msg = "";
        for(int lin = 0; lin < old.length; lin++) {
            for(int col = old.length; col > 0; col--) {
                if(col == lin) {
                    msg += old[lin][col] + " ";
                }
//                msg += '[] ';
            }
            msg += "\n";
        }
        JOptionPane.showMessageDialog(null, msg);
    }
}
