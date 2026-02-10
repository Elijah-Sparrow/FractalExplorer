public class View {

    private int screenWidth;
    private int screenHeight;
    private double xSlope;
    private double ySlope;
    private double xOffset;
    private double yOffset;

    public View(int w, int h) {
        screenWidth = w;
        screenHeight = h;
        setComplexCorners(new Complex(-2,1), new Complex(1,-1));
    }

    public Complex translate(int x, int y) {
        double real = xSlope * x + xOffset;
        double imaginary = ySlope * y + yOffset;
        return new Complex(real, imaginary);
    }

    public void setComplexCorners(Complex complex, Complex complex2) {
        xSlope = (complex2.real - complex.real) / (screenWidth);
        ySlope = (complex2.imaginary - complex.imaginary) / (screenHeight);
        yOffset = complex.imaginary;
        xOffset = complex.real;
    }
    
}
