
package Project;

import java.awt.*;
import javax.swing.*;


public class Doctor_Interface extends JFrame{

    private Container c;
    Font f[] = new Font[12];
    JPanel jp[] = new JPanel[12];
    JButton jb[] = new JButton[12];
    
    
    
    Doctor_Interface(){
        components();
        panel();
        button();
        
    }
    
    public void components(){
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(500, 100, 1300, 800);
        c = this.getContentPane();
        c.setLayout(null);
        f[1] = new Font("Arial", Font.BOLD, 25);

    }
    
    public void panel(){
        jp[1] = new JPanel();
        c.add(jp[1]);
        jp[1].setLayout(null);
        jp[1].setBounds(0, 0, 1300, 400);
        jp[1].setBackground(new Color(32, 37, 89));
        
    }
    
    public void button(){
        jb[1] = new JButton();
        jp[1].add(jb[1]);
        jb[1].setBounds(60, 200, 100, 50);
        jb[1].setText("NEXT");
        
        jb[2] = new JButton();
        jp[1].add(jb[2]);
        jb[2].setBounds(200, 200, 100, 50);
        jb[2].setText("Recall");
        
    }
    
    public static void main(String[] args) {
        new Doctor_Interface();
    }

 
}
