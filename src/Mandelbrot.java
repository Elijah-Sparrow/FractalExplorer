public class Mandelbrot {

    public static int iterationLimit = 100;

    public static void setIterationLimit(int number){
        iterationLimit = number;
    }

    public static int testPoint(Complex c) {
        int attempts = 0;
        Complex z = new Complex();
        while(z.abs()<=2 && attempts <= iterationLimit) {
            z = (z.square()).add(c);
            attempts++;
        }
        if(attempts > iterationLimit){
            return -1;
        }
        return attempts;
    }

    
}
