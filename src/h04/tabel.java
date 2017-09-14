package h04;

import java.applet.Applet;
import java.awt.*;

public class tabel extends Applet {

    public void init(){

    }

    public void paint(Graphics g){

      g.drawRect(30,30,200,100);

      g.setColor(Color.red);
      g.drawRect(40,90,30,40);
      g.fillRect(40,90,30,40);
      g.setColor(Color.black);
      g.drawString("Valerie",40,150);

      g.setColor(Color.orange);
      g.drawRect(100,30,30,100);
      g.fillRect(100,30,30,100);
      g.setColor(Color.black);
      g.drawString("Jeroen",100,150);

      g.setColor(Color.green);
      g.drawRect(160,50,30,80);
      g.fillRect(160,50,30,80);
      g.setColor(Color.black);
      g.drawString("Hans",160,150);

      g.drawString("0",15,140);
      g.drawString("20",10,120);
      g.drawString("40",10,100);
      g.drawString("60",10,80);
      g.drawString("80",10,60);
      g.drawString("100",5,40);

    }

}
