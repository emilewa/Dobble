
package test;
//import java.awt.BorderLayout;
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


public class menu extends JFrame implements ActionListener {  
public static ObrazFrame F;
    public JButton exit,newgame;
    JPanel obrazPanel;
    public static long starttime;
    private JPanel tlo = new JPanel();
   public menu()
    {
                  super("Menu");
                  add(tlo);                                              
                  tlo.setPreferredSize(new Dimension(315,500)); //zamiast w i h wpisz rozmiar obrazka, który jest tłem         tlo.setLayout(null);
                  setResizable(false);
            
            
                  PanelGlowny();

                 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 pack();
                 setVisible(true);
    }
   
   public void PanelGlowny()
        {
             ObrazPanel bg = new ObrazPanel("tlo1.png");
                
             newgame = new JButton("START");
             newgame.setBounds(10,10,20,80);
             newgame.addActionListener(this);
             bg.add(newgame); 
             
                      
             exit = new JButton("EXIT");
             exit.addActionListener(this);
             bg.add(exit);  
           
                bg.setOpaque(true);
                
                tlo.add(bg);
                
                
                
        }
   
    @Override
    public void actionPerformed(ActionEvent e) {
        
    
                                String nazwa = e.getActionCommand();
                                if(nazwa.equals("START")) 
                                {
                                        int i=ilepartii=5;
                                        //   long t0= System.currentTimeMillis();
                                         //boolean czy=false;           
                                         System.out.println("tworzy F");
                                         starttime = System.currentTimeMillis();
                                          new ObrazFrame(i,starttime);
                                         System.out.println("koniec F");
                                         
                                }
                                if(nazwa.equals("EXIT")) System.exit(0);
                             
                       
    }
    
}
