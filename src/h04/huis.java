package h04;

import java.applet.Applet;
import java.awt.*;

public class huis extends Applet {

    public void init(){

    }

    public void paint(Graphics g){

       g.drawRect(100, 100, 150,150);
       g.drawRect(120, 120, 50, 50);
       g.drawRect(180, 150, 60, 100);
       g.drawLine(100, 100, 175, 30);
       g.drawLine(250, 100, 175, 30);
    }


}
