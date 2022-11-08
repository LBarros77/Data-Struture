package calc;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Calc {
    private String names[] = new String[100];
    protected int count = 0;
    
    void calc() { }
    
    public void setNames() {
        this.names[count] = JOptionPane.showInputDialog("Input a name: ");
        
        while(names[count].equals("")) {
            this.names[count++] = JOptionPane.showInputDialog("Input a name: ");
        }
    }
    
    public String getAleatoryName() {
        return this.names[1 + (int) (Math.random() * this.count)];
    }
}
