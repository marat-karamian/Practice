public class Color {
    private int red;
    private int green;
    private int blue;

    public Color() {

    }

    public Color(int r, int g, int b) {
        red = r;
        green = g;
        blue = b;
    }

    public void define(int r, int g, int b) {
        red = r;
        green = g;
        blue = b;
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    public String getColorName() {
        if (blue == 1 && red == 0 && green == 0) {
            return "Blue";
        }
        return "Unknown";
    }
}