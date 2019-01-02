/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Random;

public class Dane {
    //Karta 1
    int idKarta1;
    public String[] daneKarta1;
    //Karta 2 
    int idKarta2;
    public String[] daneKarta2;
    // nr elementu powtarzającego się dla obu kart
    int idelementuduplikat; //id elementu duplikat w tablicy karta2

    
    
    //przypisuje dane kart
    public Dane()
    {
        int[] losy = Los();
     this.idKarta1=losy[0];
     this.idKarta2=losy[1];
     
     this.daneKarta1 = Karta(losy[0]);
     this.daneKarta2 = Karta(losy[1]);
     
     this.idelementuduplikat = Duplikat(this.daneKarta1,this.daneKarta2);
     
        
    }
    
    
    //wczytuje karty
    public static String[] Karta(int id) 
    {
        String[] Karta = new String[8];
        
        switch(id){
            case 1:
                 String[] karta1={"bow","clown","ice","car","plate","fan","medal","bike"};
                 Karta = karta1;
                 break;
            case 2:
                 String[] karta2={"burger","phone","frame","ice_cream","bowling","whistle","plate","bulb"};
                 Karta = karta2;
                 break;
            case 3:
                 String[] karta3={"21","31","bowl","ice","ball","cup","bulb","duck"};
                 Karta = karta3;
                 break;
            case 4:
                String[] karta4={"bear","pipe","!","robot","camera","bulb","medal","mustache"};
                Karta = karta4;
                break;
            case 5:
                String[] karta5={"bear","loupe","crown","glasses","fire","plate","ball","golf"};
                Karta = karta5;
                break;
            case 6:
                String[] karta6={"bike","loupe","chips","bat","duck","thread","frame","camera"};
                Karta = karta6;
                break;
            case 7:
                String[] karta7={"hat","21","plaster","camera","cake","cat","plate","popcorn"};
                Karta = karta7;    
                break;
            case 8:
                String[] karta8={"milk","golf","apple","medal","flashlight","whistle","ghost","duck"};
                Karta = karta8;
                break;
            case 9:
                String[] karta9={"31","aquarium","bomb","!","chips","plate","ghost","pumpkin"};
                Karta = karta9;
                break;
            case 10:
                String[] karta10={"fire","ice","!","phone","cake","books","apple","bat"};
                Karta = karta10;
                break;
           
        }
       
        return(Karta);
    }
    
    //szukaj duplikatu
    public int Duplikat(String[] k1,String[] k2)
    {
        String duplikat="";
        int intduplikat=0;     
        for(int i=0;i<k1.length;++i)
        {
            for(int j=1;j<k2.length;++j)
            {
                if(k2[j]==k1[i])
                { 
                    intduplikat=j;
                    duplikat=k1[j];
                    break;
                }
            }
        }
      return(intduplikat);
    }
  
   //losuje numery 2 kart
    public static int[] Los()
    {
        int a,b;
        Random rand = new Random();
        a = rand.nextInt(10) + 1;
        
        do
        {
        Random rand2 = new Random();
        b = rand.nextInt(10) + 1;
        }while(a==b);
        
        int[] los = {a,b};
        return(los);
    }
    
}
