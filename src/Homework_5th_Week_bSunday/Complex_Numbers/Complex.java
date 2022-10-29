package Homework_5th_Week_bSunday.Complex_Numbers;

public class Complex implements RealImag {
    private double a;
    private double b;

    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public Complex add(Complex t) {
        double real = getReal() + t.getReal();
        double imag = getImag() + t.getImag();
        return new ComplexAdd(real, imag);
    }

    public Complex subtract(Complex t) {
        double real = getReal() - t.getReal();
        double imag = getImag() - t.getImag();
        return new ComplexSubtract(real, imag);
    }

    public Complex multiply(Complex t) {
        double real = (getReal() * t.getReal()) - (getImag() * t.getImag());
        double imag = (getReal() * t.getImag()) + (getImag() * t.getReal());
        return new ComplexMultiply(real, imag);
    }

    public Complex divide(Complex t) {
        double real = ((getReal() * t.getReal()) + (getImag() * t.getImag()))
                / ((Math.pow(t.getReal(), 2)) + (Math.pow(t.getImag(), 2)));
        double imag = ((getImag() * t.getReal()) - (getReal() * t.getImag()))
                / ((Math.pow(t.getReal(), 2)) + (Math.pow(t.getImag(), 2)));
        return new ComplexDivision(real, imag);
    }

    @Override
    public double getReal() {
        return a;
    } //c

    @Override
    public double getImag() {
        return b;
    }  //d

    @Override
    public String toString() {
        if (a == 0) {
            return b + "i";
        } else if (b == 0) {
            return a + "";
        } else if (b < 0) {
            return a + " - " + Math.abs(b) + "i";
        } else {
            return a + " + " + b + "i";
        }
    }
}
