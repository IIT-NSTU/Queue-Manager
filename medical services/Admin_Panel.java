
package Project;

import java.awt.*;
import javax.swing.*;

public class Admin_Panel extends JFrame {

    private Container c;
    JPanel jp[] = new JPanel[10];
    JLabel jl[] = new JLabel[16];
    JTextField jtf[] = new JTextField[30];
    JTextArea jta[] = new JTextArea[30];
    JButton bt[] = new JButton[20];
    JFrame frame;
    Font ft[] = new Font[30];
   
    Admin_Panel() {
        components();
        panel();
        label();  
    }

    public void components() {
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(200, 100, 1350, 800);
        c = this.getContentPane();
        c.setLayout(null);
        ft[3] = new Font("Arial", Font.BOLD, 35);

    }

    public void panel() {
        jp[1] = new JPanel();
        c.add(jp[1]);
        jp[1].setBounds(20, 20, 400, 300);
        jp[1].setBackground(new Color(57, 44, 99));
        jp[1].setLayout(null);

        jp[2] = new JPanel();
        c.add(jp[2]);
        jp[2].setBounds(450, 20, 400, 300);
        jp[2].setBackground(new Color(57, 44, 99));
        jp[2].setLayout(null);
        
        jp[3] = new JPanel();
        c.add(jp[3]);
        jp[3].setBounds(900, 20, 400, 300);
        jp[3].setBackground(new Color(57, 44, 99));
        jp[3].setLayout(null);
        
        jp[4] = new JPanel();
        c.add(jp[4]);
        jp[4].setBounds(20,350, 400, 300);
        jp[4].setBackground(new Color(57, 44, 99));
        jp[4].setLayout(null);
        
        jp[5] = new JPanel();
        c.add(jp[5]);
        jp[5].setBounds(450,350, 400, 300);
        jp[5].setBackground(new Color(57, 44, 99));
        jp[5].setLayout(null);
        
        jp[6] = new JPanel();
        c.add(jp[6]);
        jp[6].setBounds(900,350, 400, 300);
        jp[6].setBackground(new Color(57, 44, 99));
        jp[6].setLayout(null);
        
        
    }

    public void label() {
        Font f1 = new Font("Arial", Font.BOLD, 30);

        jl[1] = new JLabel("Heart Disease");
        jl[1].setBounds(100, 120, 300, 50);
        jp[1].add(jl[1]);
        jl[1].setFont(f1);
        jl[1].setForeground(new Color(237, 180, 226));
        
        jl[2] = new JLabel("Diabetes");
        jl[2].setBounds(100, 120, 200, 50);
        jp[2].add(jl[2]);
        jl[2].setFont(f1);
        jl[2].setForeground(new Color(237, 180, 226));

        jl[3] = new JLabel("Eyesight");
        jl[3].setBounds(100, 120, 200, 50);
        jp[3].add(jl[3]);
        jl[3].setFont(f1);
        jl[3].setForeground(new Color(237, 180, 226));
        
        jl[4] = new JLabel("Liver");
        jl[4].setBounds(100, 120, 100, 50);
        jp[4].add(jl[4]);
        jl[4].setFont(f1);
        jl[4].setForeground(new Color(237, 180, 226));
        
        jl[5] = new JLabel("Lungs");
        jl[5].setBounds(100, 120, 100, 50);
        jp[5].add(jl[5]);
        jl[5].setFont(f1);
        jl[5].setForeground(new Color(237, 180, 226));
        
        jl[6] = new JLabel("Urology");
        jl[6].setBounds(100, 120, 150, 50);
        jp[6].add(jl[6]);
        jl[6].setFont(f1);
        jl[6].setForeground(new Color(237, 180, 226));
        
    }
    
    public void font(){
        
    }

    public static void main(String args[]) {
        new Admin_Panel();
    }

}
