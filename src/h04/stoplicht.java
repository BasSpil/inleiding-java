package h04;

import java.applet.Applet;
import java.awt.*;

public class stoplicht extends Applet {

    public void init(){

    }

    public void paint(Graphics g){

        g.drawRect(80,220,30,80);
        g.fillRect(80,220,30,80);

        g.drawRoundRect(60,20,70,200,20,20);

        g.setColor(Color.red);
        g.drawOval(75,40,40,40);
        g.fillOval(75,40,40,40);

        g.setColor(Color.orange);
        g.drawOval(75,100,40,40);
        g.fillOval(75,100,40,40);

        g.setColor(Color.green);
        g.drawOval(75,160,40,40);
        g.fillOval(75,160,40,40);


    }





}
