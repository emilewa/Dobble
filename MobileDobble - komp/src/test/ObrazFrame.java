
package test;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ObrazFrame extends JFrame {
public static int idkliknietegoprzycisku;
public JPanel obrazPanel;
JLabel time;
JButton b1,b2,b3,b4,b5,b6,b7,b8;
public static boolean czyodgadniety;
public static int zmiennapomocnicza;
public static  Dane danepomocnicze ;
public static int ktorapartia,ile;
public static long starttime;
public static JFrame i;

	public ObrazFrame(int ile,long ti) {
                super("Program");
                this.starttime = ti ;
                this.ile = ile;
                Dane[] T= new Dane[ile];

                
                
                
                Dane D =new Dane();
                this.danepomocnicze = D;
                this.zmiennapomocnicza = D.idelementuduplikat+1;
                
                System.out.println(D.idKarta1);
                System.out.println(D.idKarta2);
                System.out.println(D.idelementuduplikat);
                String nazwagrafiki = "karta"+ Integer.toString(D.idKarta1)+".png";
                
                setLayout(new BorderLayout());
		obrazPanel = new ObrazPanel(nazwagrafiki);
                JPanel p = new JPanel();
                JPanel p2 = new JPanel();
                JLabel time = new JLabel();
		add(obrazPanel,BorderLayout.NORTH);
                add(p,BorderLayout.CENTER);
                add(p2,BorderLayout.SOUTH);
                String[] a = new String[8];
                a=D.daneKarta2;
                
                b1=new JButton(a[0]);
                b2=new JButton(a[1]);
                b3=new JButton(a[2]);
                b4=new JButton(a[3]); 
                b5=new JButton(a[4]);
                b6=new JButton(a[5]);
                b7=new JButton(a[6]);
                b8=new JButton(a[7]);
                
                
                
                
                p.add(b1);
                p.add(b2);
                p.add(b3);
                p.add(b4);
                p2.add(b5);
                p2.add(b6);
                p2.add(b7);
                p2.add(b8);
        
          
       B1 b = new B1();
        b1.addActionListener(b);
        System.out.println(b.id);
        b2.addActionListener(b);
        b3.addActionListener(b);
        b4.addActionListener(b);
        b5.addActionListener(b);
        b6.addActionListener(b);
        b7.addActionListener(b);
	b8.addActionListener(b);
        
      System.out.println(this.idkliknietegoprzycisku);
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
                
                setLocation(325,0);
                setAlwaysOnTop(true);
		setVisible(true);
                
         if(czyodgadniety) {
             System.out.println("true");
             
         }
         else System.out.println("False");
         if(ktorapartia == ile)
         {
             System.out.println("Koniec gry!");
             
             ktorapartia=0;
            // this.starttime=0;
             
         }
         

}
        

class B1 implements ActionListener{
        
        public int id=0;
        
        
        
        public void actionPerformed(ActionEvent e)
        {
            Object source = e.getSource();
        
             if(source == b1)
            {  
                this.id = 1; 
                System.out.println("Przycisk 1");
                b1.setBackground(Color.darkGray);
                System.out.println(id);
                ObrazFrame.idkliknietegoprzycisku=id;
                System.out.println(ObrazFrame.idkliknietegoprzycisku);
            }else
            if(source == b2)   
            {  
                this.id = 2; 
                System.out.println("Przycisk 2");
                b2.setBackground(Color.darkGray);
                System.out.println(id);
                ObrazFrame.idkliknietegoprzycisku=id;
                System.out.println(ObrazFrame.idkliknietegoprzycisku);
            }else
            if(source == b3) 
            {  
                this.id = 3; 
                System.out.println("Przycisk 3");
                b3.setBackground(Color.darkGray);
                System.out.println(id);
                ObrazFrame.idkliknietegoprzycisku=id;
                System.out.println(ObrazFrame.idkliknietegoprzycisku);
            }else
            if(source == b4)
            {  
                this.id = 4; 
                System.out.println("Przycisk 4");
                b4.setBackground(Color.darkGray);
                System.out.println(id);
                ObrazFrame.idkliknietegoprzycisku=id;
                System.out.println(ObrazFrame.idkliknietegoprzycisku);
            }else
            if(source == b5)  
            {  
                this.id = 5; 
                System.out.println("Przycisk 5");
                b5.setBackground(Color.darkGray);
                 System.out.println(id);
                 ObrazFrame.idkliknietegoprzycisku=id;
                 System.out.println(ObrazFrame.idkliknietegoprzycisku);
            }else
            if(source == b6)
            {  
                this.id = 6; 
                System.out.println("Przycisk 6");
                b6.setBackground(Color.darkGray);
                 System.out.println(id);
                 ObrazFrame.idkliknietegoprzycisku=id;
                 System.out.println(ObrazFrame.idkliknietegoprzycisku);
            }else
            if(source == b7)  
            {  
                this.id = 7; 
                System.out.println("Przycisk 7");
                b7.setBackground(Color.darkGray);
                 System.out.println(id);
                 ObrazFrame.idkliknietegoprzycisku=id;
                 System.out.println(ObrazFrame.idkliknietegoprzycisku);
            }else
            if(source == b8)
            {  
                this.id = 8; 
                System.out.println("Przycisk 8");
                b8.setBackground(Color.darkGray);
                 System.out.println(id);
                 ObrazFrame.idkliknietegoprzycisku=id;
                 System.out.println(ObrazFrame.idkliknietegoprzycisku);
            }
             
        if(ObrazFrame.idkliknietegoprzycisku == ObrazFrame.zmiennapomocnicza) 
         {
             System.out.println("Dobrze");
             ObrazFrame.czyodgadniety=true;
             ++ObrazFrame.ktorapartia;
             if(ObrazFrame.czyodgadniety==true)
             setVisible(false);
             
             if(ObrazFrame.ktorapartia == ObrazFrame.ile)
             {
                 System.out.println("Koniec gry!");
                 ObrazFrame.i = new infoTime(ObrazFrame.starttime);
                 dispose();
                 
             }
             else {
                 ObrazFrame F = new ObrazFrame(ObrazFrame.ile,ObrazFrame.starttime);
                  }
            } 
        }
    }

}
