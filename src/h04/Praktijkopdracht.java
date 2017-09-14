package h04;

import java.applet.Applet;
import java.awt.*;

public class Praktijkopdracht extends Applet {

    public void init(){

    }

    public void paint(Graphics g){

        g.drawLine(20,20,200,20);
        g.drawString("Lijn",100,35);

        g.drawRect(20,60,180,80);
        g.drawString("Rechthoek",80,155);

        g.drawRoundRect(20,160,180,80,30,30);
        g.drawString("Afgeronde rechthoek", 50,255);

        g.setColor(Color.magenta);
        g.fillRect(220,50,200,100);
        g.setColor(Color.black);
        g.drawArc(230,60,180,80,0,360);
        g.drawString("Gevulde rechthoek met ovaal",250,165);

        g.setColor(Color.magenta);
        g.drawArc(230,180,180,80,0,360);
        g.fillArc(230,180,180,80,0,360);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal",280,275);

        g.drawArc(430,60,180,80,0,360);
        g.setColor(Color.magenta);
        g.fillArc(430,60,180,80,0,45);
        g.setColor(Color.black);
        g.drawString("Taartpunt met ovaal eromheen", 430, 155);

        g.setColor(Color.black);
        g.drawOval(470,180,100,100);
        g.drawString("Cirkel",500,300);
    }




}
