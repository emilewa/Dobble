
package test;


import java.util.ArrayList;

public class Parametry {
    
    ArrayList<String> czasy = new ArrayList<String>();
    public String best;
    
    public Parametry()
    { //int x,long l
//         if(x==0) MIN();
//         if(x==1) dodaj(l);
    }
    

  public void dodaj(long l)
  {
      String z = Long.toString(l);
     czasy.add(z);
  }
   
   public void MIN()
   {
       String min=czasy.get(0);
      int a,b;
      b=Integer.parseInt(min);
       //Integer.parseInt(myString);
       for(int i=1;i<czasy.size();++i)
       {
           a=Integer.parseInt(czasy.get(i));
           if(a<b) b=a;
       }
       
       min = String.valueOf(b);
       best=min;
   }
}
