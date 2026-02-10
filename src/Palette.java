import java.awt.Color;

public class Palette {    
    private int colorScheme;
    
    public void setColor(int color) {
        this.colorScheme = color;
    }

    public Color getColor(double n) {
        if (colorScheme == 1){
            return color1(n);
        }
        if (colorScheme == 2){
            return color2(n);
        }
        return Color.BLACK;
    }

    public Color color1(double n) {
        int red = (int) (160 * Math.sin(n));
        int green = (int) (255 * Math.cos(n));
        int blue = 255 - (int)(150 * Math.tan(n));
        return new Color(red,green,blue);
    }

    public Color color2(double n) {
        int red = (int) (160 * Math.tan(n));
        int green = 255 - (int) (255 * Math.sin(n));
        int blue = 255 - (int)(150 * Math.tan(n));
        return new Color(red, green, blue);
    }

}