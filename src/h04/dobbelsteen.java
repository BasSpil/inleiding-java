package h04;

import java.applet.Applet;
import java.awt.*;

public class dobbelsteen extends Applet{

    public void init(){

    }

    public void paint(Graphics g){

        g.drawRoundRect(20,40,250,250,20,20);

        g.drawOval(50,70,60,60);
        g.fillOval(50,70,60,60);

        g.drawOval(180,70,60,60);
        g.fillOval(180,70,60,60);

        g.drawOval(50,200,60,60);
        g.fillOval(50,200,60,60);

        g.drawOval(180,200,60,60);
        g.fillOval(180,200,60,60);


    }






}
