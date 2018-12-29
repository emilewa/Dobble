/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
//import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static test.Test.ilepartii;


public class infoTime extends JFrame implements ActionListener 
{

    public static ObrazFrame F;
    public JButton exit;
    JPanel obrazPanel;
    public static long totaltime;
    public static long endtime;
    public static long Starttime;
    private JPanel tlo = new JPanel();
    public static String t;
    
        infoTime(long t)
        {
                  this.Starttime = t;
                  this.endtime = System.currentTimeMillis();
                  this.totaltime = this.endtime-this.Starttime;
                  add(tlo);                                              
                  tlo.setPreferredSize(new Dimension(264,77));
                  setResizable(false);
                  PanelGlowny();
                  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                  pack();
                  setLocation(20,100);
                  setVisible(true);
        }

        public void PanelGlowny()
        {
             ObrazPanel bg = new ObrazPanel("tlotime.png");
                      
             exit = new JButton("EXIT");
             exit.addActionListener(this);
             
             long x = this.totaltime;
             
             JLabel time = new JLabel(Long.toString(x));
             bg.add(time);
                bg.setOpaque(true);
                bg.add(exit);  
                tlo.add(bg);
                     
        }


 @Override
    public void actionPerformed(ActionEvent e)
    {
        
           String nazwa = e.getActionCommand();
           if(nazwa.equals("EXIT")) dispose();
                             
                       
    }
}
