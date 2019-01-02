
package test;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static test.Test.ilepartii;
import javafx.scene.control.ComboBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.text.StyledEditorKit;

public class menu extends JFrame implements ActionListener {  
public static ObrazFrame F;
    public JButton exit,newgame;
    JPanel obrazPanel;
    public static long starttime;
    public static int ile;
    private JPanel tlo = new JPanel();
    JComboBox ILE;
    public static Parametry P ;
    
   public menu()
    {
                  super("Menu");
                  add(tlo);
                  tlo.setPreferredSize(new Dimension(315,500)); //zamiast w i h wpisz rozmiar obrazka, który jest tłem         tlo.setLayout(null);
                  setResizable(false);
            
                  P = new Parametry();
                  PanelGlowny();

                 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 pack();
                 setVisible(true);
    }
   
   public void PanelGlowny()
        {
             ObrazPanel bg = new ObrazPanel("tlo1.png");
             
            JLabel l = new JLabel("Number of cards:");
            l.setForeground(Color.orange);
            
            bg.add(l);
             
             ILE = new JComboBox();
             ILE.addItem("3");
             ILE.addItem("5");
             ILE.addItem("10");
             ILE.addItem("15");
             
             bg.add(ILE);
             
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
                                        
                                         cowcombobox();
                                         int i=ilepartii=this.ile;
                                         System.out.println("tworzy F");
                                         starttime = System.currentTimeMillis();
                                          new ObrazFrame(i,starttime);
                                         System.out.println("koniec F");
                                         
                                }
                                if(nazwa.equals("EXIT")) System.exit(0);
                             
                       
    }
    
    public void cowcombobox()
    {
        if(ILE.getSelectedItem()== "3")
        {
            this.ile = 3;
        }
        else 
        if(ILE.getSelectedItem()== "5")
        {
            this.ile = 5;
        }
        else 
        if(ILE.getSelectedItem()== "10")
        {
            this.ile = 10;
        }
        else 
        if(ILE.getSelectedItem()== "15")
        {
            this.ile = 15;
        }
    }
    
    
    
}
