package h04;

import java.applet.Applet;
import java.awt.*;

public class vlag extends Applet {

    public void init(){

    }

    public void paint(Graphics g){

        g.drawLine(29,60,29,309);

        g.setColor(Color.red);
        g.drawRect(30,60, 200,50);
        g.fillRect(30,60,200,50);

        g.setColor(Color.WHITE);
        g.drawRect(30,110,200,50);
        g.fillRect(30,110,200,50);

        g.setColor(Color.blue);
        g.drawRect(30,160,200,50);
        g.fillRect(30,160,200,50);


    }
}
