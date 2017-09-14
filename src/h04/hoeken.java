package h04;

import java.applet.Applet;
import java.awt.*;

public class hoeken extends Applet {

    public void init(){

    }

    public void paint(Graphics g) {
       g.drawLine(50 , 120 , 270 , 120);
       g.drawLine(160 , 280 , 270 , 120);
       g.drawLine(50 , 120 , 160 ,280);
    }
}
