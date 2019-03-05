package Serverdemo;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.SwingUtilities;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.TableView.TableRow;

public class Home extends JFrame implements ActionListener ,MouseListener,KeyListener {
    public static int a= 0, q = 0, r=1;
    public static int i = 0, j = 0, t;
    public static int flag = 0;
    public static int k = 1;
    private Container c;
    JTable table[] = new JTable[10];
    DefaultTableModel model=new DefaultTableModel();
    JPanel p[] = new JPanel[10];
    JLabel jl[] = new JLabel[16];
    JTextField jtf[] = new JTextField[30];
    JTextArea jta[] = new JTextArea[30];
    JButton btn[] = new JButton[20];
    JScrollPane pane;
    TitledBorder border[] = new TitledBorder[10];
    JFrame frame;
    JComboBox jcb[] = new JComboBox[10];
    JScrollPane srp[] = new JScrollPane[10];
    Font f[] = new Font[30];
    String colms[] = {"Serial No.", "Customer Name", "Type", "Description"};
    String rows[][] = new String[100][4];
    String item[] = {"Software", "Hardware"};
    JMenuBar mb;
     JMenu menu;
    JMenuItem mitem[]=new  JMenuItem[20];
    LogTable lt=new LogTable();
     Sendthread st;
     Popupclass pop;
     //Home h1;
    // Thread t1=new Thread(st);
   // LogTable lt = new LogTable();
    Home() throws IOException {
    
        initcomponents();
        panel();
        label();
        textfield();
        combobox();
        menu();
        Button();
        table();
        popupmenu();
        font();
  
       st=new Sendthread(this);
      // Sendthread st=new Sendthread();
       st.Connect();
       st.start();
    }

    public void initcomponents() {
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          this.setBounds(500, 100, 1300, 900);
        c = this.getContentPane();
        c.setLayout(null);
        f[3] = new Font("Arial", Font.BOLD, 25);

        border[1] = new TitledBorder("Server SERVICE");
        border[1].setTitleJustification(TitledBorder.LEFT);
        border[1].setTitlePosition(TitledBorder.TOP);
        border[1].setTitleColor(Color.RED);
        border[1].setTitleFont(f[3]);
    
        border[2] = new TitledBorder("RUNNING SERVICE");
        border[2].setTitleJustification(TitledBorder.LEFT);
        border[2].setTitlePosition(TitledBorder.TOP);
        border[2].setTitleFont(f[3]);
        border[2].setTitleColor(Color.RED);
        border[3] = new TitledBorder("LIST OF SERVICES");
        border[3].setTitleJustification(TitledBorder.LEFT);
        border[3].setTitlePosition(TitledBorder.TOP);
        border[3].setTitleColor(Color.RED);
        border[3].setTitleFont(f[3]);
    }

    public void panel() {
        // p[4] = new JPanel();
        // c.add(p[4]);
        //  p[4].setBounds(0, 00, 900, 700);
        // p[4].setBorder(border[3]);
        //panel(1)
        p[1] = new JPanel();
        c.add(p[1]);
        p[1].setBounds(250, 20, 450, 300);
        p[1].setBackground(new Color(204, 204, 255));

        p[1].setBorder(border[1]);
      
        p[3] = new JPanel();
        c.add(p[3]);
        p[3].setBounds(20, 350, 930, 450);
        p[3].setBackground(Color.lightGray);
        p[3].setBorder(border[3]);
        p[3].setLayout(null);
    }

    public void label() {
        // panel(1)
        jl[1] = new JLabel("Name");
        p[1].setLayout(null);
        p[1].add(jl[1]);
        jl[1].setBounds(20, 30, 100, 50);
        jl[2] = new JLabel("Type");
        p[1].add(jl[2]);
        jl[2].setBounds(20, 90, 100, 50);
        jl[3] = new JLabel("Description");
        p[1].add(jl[3]);
        jl[3].setBounds(20, 150, 100, 50);
        //panel3
        jl[8]=new JLabel("Client Search");
        p[3].add(jl[8]);
        jl[8].setBounds(570,30,150,35);
        jl[8].setFont(f[3]);   
      
    }

    public void textfield() {
        //panel(1)
        jtf[1] = new JTextField();
        jta[1] = new JTextArea();
        jta[1].setLineWrap(true);
        jta[1].setWrapStyleWord(true);
        p[1].add(jtf[1]);
        jtf[1].setBounds(105, 37, 210, 40);
        srp[1] = new JScrollPane(jta[1]);
        p[1].add(srp[1]);
        srp[1].setBounds(105, 157, 210, 60);
        //panel3
        jtf[6] = new JTextField();
        p[3].add(jtf[6]);
        jtf[6].setBounds(700 ,30, 150,35);
        jtf[6].setFont(f[2]);
        jtf[6].addKeyListener(this);
   

    }

    public void combobox() {
        jcb[1] = new JComboBox(item);
        p[1].add(jcb[1]);
        jcb[1].setBounds(105, 94, 210, 40);
    }

    public void Button() {
        //panel(1);
        btn[1] = new JButton();
        p[1].add(btn[1]);
        btn[1].setText("Add Queue");
        btn[1].setBounds(110, 235, 200, 35);


        btn[1].addActionListener(this);
     

    }
     public void menu() {
      //   System.out.println("1111");
         mb=new JMenuBar();
        //  c.setJMenuBar(mb);
         p[4]=new JPanel();
         p[4].setBounds(50,30,200,70);
       //  mb.setSize(170,70);
         p[4].add(mb);
         c.add(p[4]);

         menu=new JMenu("MENU");
         mitem[1]=new JMenuItem("History Log Table");
         mitem[2]=new JMenuItem("Priority Search");
         mitem[3]=new JMenuItem("Delete Queue Member");
         mitem[4]=new JMenuItem("Reset");
         mb.add(menu);
       //  menu.setSize(170,70);
        
         for (int l = 1; l <=4; l++) {
             menu.add(mitem[l]);
         }
        mitem[1].addActionListener(this);
        mitem[2].addActionListener(this);
       
    }
   public void populate(String sn,String cn,String ty,String des )
   {
       String rows[]={sn,cn,ty,des};
       model.addRow(rows);
       
          }
    public void table() {
        
        table[1] = new JTable();
        srp[3] = new JScrollPane(table[1]);
        p[3].setLayout(null);
        p[3].add(srp[3]);
        srp[3].setBounds(50, 90, 800, 300);
        table[1].setBackground(Color.decode("#058dc7"));
        table[1].setForeground(Color.WHITE);
        f[4] = new Font("Arial", Font.BOLD, 14);
        table[1].setFont(f[4]);
        
        table[1].setRowHeight(table[1].getRowHeight()+15);
        model=(DefaultTableModel)table[1].getModel();
        for (int l = 0; l <4; l++) {
            model.addColumn(colms[l]);     
        }
            TableColumn column = null;
      
        // column = table[1].getColumnModel().getColumn(0);

        for (int t = 0; t < 4; t++) {
            column = table[1].getColumnModel().getColumn(t);
            if (t == 0) {
                column.setPreferredWidth(80);
            }
            if (t == 1) {
                column.setPreferredWidth(220);
            }
            if (t == 2) {
                column.setPreferredWidth(200);
            }
            if (t == 3) {
                column.setPreferredWidth(300);
            }

        }
        cellallignment();
      
    }
    public void popupmenu()
    {
        pop=new Popupclass(table[1],this);
        table[1].addMouseListener(this);
    }
public void cellallignment()
{
  DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
  centerRenderer.setHorizontalAlignment( JLabel.CENTER );
  table[1].getColumnModel().getColumn(0).setCellRenderer( centerRenderer );   
  table[1].getColumnModel().getColumn(2).setCellRenderer( centerRenderer );   
   
   
}
  public void filter(String query)
     {
         TableRowSorter<DefaultTableModel> tr=new TableRowSorter<DefaultTableModel>(model);
         table[1].setRowSorter(tr);
         tr.setRowFilter(RowFilter.regexFilter(query));
     }
    public void font() {
        //panel(1)
        f[1] = new Font("Arial", Font.BOLD, 16);
        f[2] = new Font("Arial", Font.BOLD, 14);

        jtf[1].setFont(f[1]);
        jta[1].setFont(f[2]);
        jcb[1].setFont(f[2]);
        menu.setFont(f[1]);
          for (int l = 1; l <=4; l++) {
             mitem[l].setFont(f[1]);
         }
        //panel2
        jl[8].setFont(f[1]);

       
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btn[1]) {

            if (jtf[1].getText().isEmpty()) {

                JOptionPane.showMessageDialog(null, "ENTER CUSTOMER NAME");

            } else if (jta[1].getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "ENTER SHORT DESCRIPTION");
            } else { 
                
                String s=""+k;
               populate(s,jtf[1].getText().toString(),jcb[1].getSelectedItem().toString(),jta[1].getText().toString());
               
              lt.populate(s,jtf[1].getText().toString(),jcb[1].getSelectedItem().toString(),jta[1].getText().toString());
              lt.filewriter(s,jtf[1].getText().toString(),jcb[1].getSelectedItem().toString(),jta[1].getText().toString());
              st.Senddata(jtf[1].getText().toString(),jcb[1].getSelectedItem().toString(),jta[1].getText().toString());
             
            ///   jtf[1].setText("");
             //  jta[1].setText("");
                k++;
          
            }

        } 
        else if(e.getSource()==mitem[1])
        {
             lt.setVisible(true);
        }
        else if(e.getSource()==mitem[2])
        {
            String name=JOptionPane.showInputDialog("Enter Client Name");
            filter(name);
        }
    }

    public static void main(String[] args) throws IOException {
        Home frame = new Home();
            frame.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
         if(SwingUtilities.isRightMouseButton(e))
               {
                   pop.show(e.getComponent(),e.getX(),e.getY());
               }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }
    

    @Override
    public void keyReleased(KeyEvent e) {
         if(e.getSource()==jtf[6])      
        {
            filter(jtf[6].getText().toString());
            
        }
    }

  
}
