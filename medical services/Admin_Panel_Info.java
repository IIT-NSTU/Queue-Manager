
package Project;

import java.awt.*;
import javax.swing.*;


public class Admin_Panel_Info extends JFrame{
    
    Container c = new Container();
    JPanel jp[] = new JPanel[10];
    JLabel jl[] = new JLabel[10];
    JTextField jtf[] = new JTextField[30];
    JTextArea jta[] = new JTextArea[30];
    JButton btn[] = new JButton[20];
    JFrame frame;
    Font f[] = new Font[30];
    
    Admin_Panel_Info(){
       components();
       panel();
       label();
       textfield();
       button();
       
       
    }
     public void components(){
        this.setVisible(true);
        this.setBounds(630, 80, 600,350);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = this.getContentPane();
        c.setLayout(null);
        f[1] = new Font("Arial", Font.BOLD, 25);
        
    }
     
    public void panel(){
        jp[1] = new JPanel();
        c.add(jp[1]);
        jp[1].setBounds(40, 10, 500, 300);
        jp[1].setBackground(new Color(48, 52, 91));
        
    }
    public void label(){
        jl[1] = new JLabel("Name");
        jp[1].setLayout(null);
        jl[1].setForeground(Color.WHITE);
        jp[1].add(jl[1]);
        jl[1].setBounds(20, 30, 100, 50);
        
        jl[2] = new JLabel("Token No.");
        jl[2].setForeground(Color.WHITE);
        jp[1].add(jl[2]);
        jl[2].setBounds(20, 90, 100, 50);
        
        jl[3] = new JLabel("Description");
        jl[3].setForeground(Color.WHITE);
        jp[1].add(jl[3]);
        jl[3].setBounds(20, 150, 100, 50);

    }
    public void textfield(){
        jtf[1] = new JTextField();
        jtf[1] = new JTextField();
        jta[1] = new JTextArea();
        
        jp[1].add(jtf[1]);
        jtf[1].setBounds(200, 37, 210, 40);

        jtf[2] = new JTextField();
        jta[2] = new JTextArea();

        jp[1].add(jtf[2]);
        jtf[2].setBounds(200, 100, 210, 40);
        
        jta[3] = new JTextArea();
        jp[1].add(jta[3]);
        jta[3].setBounds(200, 160, 210, 40);

    }
    public void button(){
        btn[1] = new JButton();
        jp[1].add(btn[1]);
        btn[1].setText("Add");
        btn[1].setBounds(200, 210, 90, 60);
        
    }
    public static void main(String[] args) {
        new Admin_Panel_Info();
        
    }
}
