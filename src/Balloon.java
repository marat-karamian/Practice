public class Balloon {
    public Color color;
    private double velocity;
    private double altitude;

    public long id;

    public Balloon() {
        color = new Color();
        color.define(0 ,0, 1);
    }

   public void up() {
       if (color.getBlue() == 1)
           altitude++;
   }

   public void repaint(int r, int g, int b) {
       color = new Color();
       color.define(r, g, b);
   }

   public void down() {
       if (altitude > 0) {
           altitude--;
       }
   }

   public double getAltitude() {
       return altitude;
   }

   public double calculate() {
       return velocity*altitude;
   }

   public double calculate1(double vel, double alt) {
       return vel*alt;
   }
}