
package class_project;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Second_layout extends JFrame implements ActionListener{
    private Container con;
    private Font f,bo,ns;
    private JComboBox type;
    private String item [] = {"Medicine","Arthopedic"};
    private ButtonGroup grp;
    private JRadioButton male,fe,sm;
    private DefaultTableModel model;
    private static int  i =1;
    
    JPanel panel [] = new JPanel[3];
    JLabel label [] = new JLabel[16];
    JTextField jtf[] = new JTextField[30];
    JTextArea jta[] = new JTextArea[30];
    JButton btn[] = new JButton[20];
    JScrollPane pane;
    JButton button[] = new JButton[10];
    String colms[] = {"Serial No.", "Name", "Age","Sex","Description"};
    String rows[][] = new String[100][100];
    JTable table [] = new JTable[100];
    
    Second_layout()
    {
        setcom();
        label();
        field();
        area();
        button(); 
        table();
    }
    
    public void setcom()
    {
        con = this.getContentPane();
        con.setBackground(new Color(146,156,175));
        con.setLayout(null);
        
        f = new Font("Arial",Font.PLAIN,20);
        bo = new Font("Arial",Font.BOLD,20);
        ns = new Font("Arial",Font.BOLD,40);
        
        //panel for new services panel 1//
        panel[1] = new JPanel();
        panel[1].setBounds(20,120,400,400);
        panel[1].setBackground(new Color(213,215,252));
        panel[1].setLayout(null);
        con.add(panel[1]);
        
        // panel for list of servics//
        panel[2] = new JPanel();
        panel[2].setBounds(460,50,800,500);
        panel[2].setBackground(new Color(155,193,233));
        panel[2].setLayout(null);
        con.add(panel[2]);
        
        // Combobox panel 1//
        type = new JComboBox(item);
        //type.setBounds(170,50,200,30);
        type.setFont(bo);
        panel[1].add(type);  
    }
    
    public void button()
    {
         //add Button panel 1//
        button[1] = new JButton("Add Queue");
        button[1].setFont(bo);
        button[1].setBounds(130,340,150,50);
        panel[1].add(button[1]);
        button[1].addActionListener(this);
        
         //label for Menu panel 1//
        button[2] = new JButton("Menu");
        button[2].setFont(ns);
        button[2].setBounds(20,40,140,50);
        con.add(button[2]);
    }
    
    public void label()
    {
        //name,age,sex,description,type,new services,list of services//
        
        //label for name panel 1//
        label[1] = new JLabel("Name : ");
        label[1].setBounds(5,80,100,30);
        label[1].setFont(f);
        panel[1].add(label[1]);
        
        //label for age panel 1//
        label[2] = new JLabel("Age    : ");
        label[2].setBounds(5,120,110,30);
        label[2].setFont(f);
        panel[1].add(label[2]);
        
        //label for sex panel 1//
        label[3] = new JLabel("Sex    : ");
        label[3].setBounds(5,160,150,30);
        label[3].setFont(f);
        panel[1].add(label[3]);
        
        //label for Description panel 1//
        label[4] = new JLabel("Description: ");
        label[4].setFont(f);
        label[4].setBounds(5,200,150,30);
        panel[1].add(label[4]);
        
        //label for new services//
        label[3] = new JLabel("New Services");
        label[3].setFont(ns);
        label[3].setBounds(5,5,300,50);
        panel[1].add(label[3]);
        
    }
    
    public void area()
    {
        //TextArea for Age panel 1//
        jta[1] = new JTextArea();
        jta[1].setBounds(120,120,260,30);
        jta[1].setFont(f);
        panel[1].add(jta[1]);
        
        //TextArea for Description panel 1//
        jta[2] = new JTextArea();
        jta[2].setBounds(120,200,260,110);
        jta[2].setFont(f);
        jta[2].setLineWrap(true);
        jta[2].setWrapStyleWord(true);
        panel[1].add(jta[2]);
    }
    
    public void field()
    {
        //field for name panel 1//
        jtf[1] = new JTextField();
        jtf[1].setBounds(120,80,260,30);
        jtf[1].setFont(f);
        panel[1].add(jtf[1]);
        
        grp = new ButtonGroup();
        //button for male,female,ot, panel 1//
        male = new JRadioButton("Male");
        male.setBounds(120,160,70,30);
        male.setFont(bo);
        panel[1].add(male);
        
        fe = new JRadioButton("Female");
        fe.setBounds(200,160,95,30);
        fe.setFont(bo);
        panel[1].add(fe);
        
        sm = new JRadioButton("Other");
        sm.setBounds(300,160,80,30);
        sm.setFont(bo);
        panel[1].add(sm);
        
        grp.add(male);
        grp.add(fe);
        grp.add(sm);
        
        
    }
   
    
    private void table()
    {
        model = new DefaultTableModel();
        model.setColumnIdentifiers(colms);
        
        table[1] = new JTable(rows,colms);
        table[1].setFont(f);
        table[1].setModel(model);
        pane = new JScrollPane(table[1]);
        pane.setBounds(5,5,790,490);
        panel[2].add(pane);
        model=(DefaultTableModel)table[1].getModel();
        
        
    }
     public void populate(String sn,String n,String a, String d)
     {
         String row[]={sn,n,a,d};
          model.addRow(row);
     }
    public void actionPerformed(ActionEvent e )
    {
        if(e.getSource()==button[1])
        {
            String g = " "+i;
             populate(g,jtf[1].getText().toString(),jta[1].getText().toString(),jta[2].getText().toString());
             i++;
      
        }
        
    }
    public static void main(String[] args) {
        
        Second_layout demo = new Second_layout();
        demo.setVisible(true);
        demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        demo.setBounds(50,20,1300,600);
        demo.setResizable(false);
       
    }
    
}
