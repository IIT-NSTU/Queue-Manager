/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serverdemo;

import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JTable;

/**
 *
 * @author KOCHI
 */
public class Popupclass extends JPopupMenu implements ActionListener{
    JMenuItem itm[]=new JMenuItem[10];
    Home h1;
    public Popupclass(JTable tb,Home h1)
    {
        itm[1]=new JMenuItem("Delete");
        itm[2]=new JMenuItem("Edit");
        this.h1=h1;
        
       this.add(itm[1]);
       this.add(new Separator());
       this.add(itm[2]);
       itm[1].addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==itm[1])
        {
                h1.st.Senddata("0","Remove",""+h1.table[1].getSelectedRow());
                h1.model.removeRow(h1.table[1].getSelectedRow());
             
               JOptionPane.showMessageDialog(null,"ADDED");
        }
    }
}
