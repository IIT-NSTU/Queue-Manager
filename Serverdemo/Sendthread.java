/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serverdemo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * 
 */
public class Sendthread extends Thread{

    public String temp[] = new String[100];
     Home h1;
    int i = 1;
   
    int p=0;
    ServerSocket s;
    Socket s2;
    DataOutputStream dos;
    DataInputStream dis;
    Sendthread(Home h1) throws IOException {
   
      this.h1=h1;
    }
    
    public void Connect() throws IOException
    {
       System.out.println("Waiting..."); 
       s= new ServerSocket(124);
       s2 = s.accept();
        dos = new DataOutputStream(s2.getOutputStream());
        dis = new DataInputStream(s2.getInputStream());
       System.out.println("connected");
      
      
    }
 
    public void Senddata(String n,String ty,String des) {  
        try{
            this.temp[0] = "" + i;
           this.temp[1] = ""+n;
           this.temp[2] = ""+ty;
            this.temp[3] =""+des;
    
            i++;

         
           dos.writeUTF(temp[0]);
             dos.writeUTF(temp[1]);
           dos.writeUTF(temp[2]);
             dos.writeUTF(temp[3]);
        } catch (IOException ex) {
            Logger.getLogger(Sendthread.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
    @Override
    public void run()
    {
        try {
            while(true)
            {
            System.out.println("Server run");
              temp[5]=dis.readUTF();
              int t=Integer.parseInt(temp[5]);
             if(i!=0)
             {
                  h1.model.removeRow(t);
             }
             else
             {
                 h1.model.removeRow(0);
             }
               
            
            }

        } catch (IOException ex) {
            Logger.getLogger(Sendthread.class.getName()).log(Level.SEVERE, null, ex);
        }
           }
    public static void main(String[] args) throws IOException {
        Home h=new Home();
        
     
     
       
        
    }

 
}
