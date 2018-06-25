package Balloon;

public class BalloonDemo {
    public static void main(String args[]){
        Balloon b1 = new Balloon();

        b1.up();

        Color color = new Color(0, 0, 1);
        //color.define(0, 0, 1);

        b1.color = color;

        System.out.println(b1.color.getColorName());
        b1.repaint(0, 1, 0);

        System.out.println(b1.color.getColorName());


        System.out.println(b1.getAltitude());

    }
}
