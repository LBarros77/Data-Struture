package calc;

import javax.swing.JOptionPane;

public class Dado {
    private int numbers[];
    
    public Dado() {
        this.numbers = new int[6];
        this.dataNumbers();
    }
    
    public void dataNumbers() {
        for(int i = 0; i < numbers.length; i++) {
            this.numbers[i] = i++;
        }
    }
    
    public void choiceNumber() {
        int requestedNumber = 0;
        try {
            requestedNumber = Integer.parseInt(JOptionPane.showInputDialog("Input a number: "));
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e);
        }
        int sortedNumber = 1 + (int) (Math.random() * this.numbers.length);
        
        if(sortedNumber == requestedNumber) {
            JOptionPane.showMessageDialog(null, "Ye, It's a correct number");
        }
        
        JOptionPane.showMessageDialog(null, "Oooopis! This not correct nmuber");
    }
}
