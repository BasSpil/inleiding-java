package h04;

import java.applet.Applet;
import java.awt.*;

public class ellips extends Applet{


    public void init(){

    }

    public void paint(Graphics g){

        setBackground(Color.blue);

        g.setColor(Color.yellow);
        g.drawArc(20,20,300,150,0,360);
        g.fillArc(20,20,300,150,0,360);
    }











}
