public class Complex {

    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex() {
        this.real = 0;
        this.imaginary = 0;
    }

    public Complex add(Complex c2) {
        return new Complex(this.real + c2.real, this.imaginary + c2.imaginary);
    }

    public Complex add(int i) {
        return new Complex(this.real + i, this.imaginary);
    }

    public Complex subtract(Complex c2) {
        return new Complex(this.real - c2.real, this.imaginary - c2.imaginary);
    }

    public Complex subtract(int i) {
        return new Complex(this.real - i, this.imaginary);
    }

    public Complex multiply(Complex c6) {
        return new Complex(this.real * c6.real - (this.imaginary* c6.imaginary), (this.imaginary * c6.real) + (this.real*c6.imaginary));
    }

    public Complex multiply(int i) {
        return new Complex(this.real * i, this.imaginary * i);
    }

    public Complex divide(Complex c6) {
        double c = c6.real * c6.real + c6.imaginary * c6.imaginary;
        double r = ((this.real * c6.real) + (this.imaginary * c6.imaginary))/c;
        double i = ((this.imaginary * c6.real) - (this.real * c6.imaginary))/c;
        return new Complex(r,i);
    }

    public Complex divide(int i) {
        return new Complex(this.real/i, this.imaginary/i);
    }

    public Complex square() {
        return this.multiply(this);
    }

    public double abs() {
        return Math.hypot(this.real,this.imaginary);
    }

    public boolean equals(Complex com2) {
        if (this.real == com2.real && this.imaginary == com2.imaginary) { 
            return true;
        } else {
            return false;
            }
        
    }

    public String toString(){
        return String.format(this.real + "+" + this.imaginary + "i");
    }

}
