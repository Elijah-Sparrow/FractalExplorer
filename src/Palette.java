import java.awt.Color;

public class Palette {    
    private int colorScheme;
    
    public void setColor(int color) {
        colorScheme = color;
    }

    public Color getColor(double n) {
        if (colorScheme == 1){
            return color1(n);
        }
        return Color.BLACK;
    }

    public Color color1(double n) {
        int red = (int) (160 * Math.sin(n));
        int green = (int) (255 * Math.cos(n/1000));
        int blue = 255 - (int)(150 * Math.tan(n/1000));
        return new Color(red,green,blue);
    }

}