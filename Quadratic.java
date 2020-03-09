import java.util.Scanner;

public class Quadratic {
    //Fields
    private double a;
    private double b;
    private double c;
    private double discriminant;

    //Constructor setting default a, b, c to y = x^2
    public Quadratic() {
        this.a = 1.0;
        this.b = 0.0;
        this.c = 0.0;
    }

    //Constructor setting a, b, c arg
    public Quadratic(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /** getA method for returning coefficient a
     *
     * @return
     */
    //Method for returning a
    public double getA() {
        return a;
    }

    /**
     * getB method for returning coefficient b
     * @return
     */
    //Method for returning b
    public double getB() {
        return b;
    }

    /**
     * getC method for returning coefficient c
     * @return
     */
    public double getC() {
        return c;
    }

    /**
     * setA method for setting coefficient a
     * @param a
     * @return a
     */
    public double setA(double a) {
        this.a = a;
        return a;
    }

    /**
     * setB method for setting coefficient b
     * @param b
     * @return
     */
    //Method for setting b
    public double setB(double b) {
        this.b = b;
        return b;
    }

    /**
     * setC method for setting coefficient c
     * @param c
     * @return
     */
    //Method for setting c
    public double setC(double c) {
        this.c = c;
        return c;
    }

    /** hasRealRoots - method to determine whether roots are real
     * @return
     */
    public boolean hasRealRoots() {
        if (discriminant >= 0) {
            return true;
        } else {
            return false;
        }

    }

    /**
     * negDiscriminant - method to determine whether the discriminant is negative
     * @return
     */
    public boolean negDiscriminant() {
        if (discriminant < 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * firstDerivative - method to compute the value of the first derivative of the quadratic at any specific point
     * @param x
     * @return
     */
    public double firstDerivative(double x) {
        return (2 * a * x) + (b);
    }

    /**
     * toString - Method to return string object
     * @return
     */
    public String toString() {
        return "y = " + a + " x^2 " + b + "x + " + c;
    }

    /**
     * discriminant - method for getting discriminant
     * @return
     */
    public double discriminant() {
        discriminant = (Math.pow(b, 2) - (4 * a * c));
        return discriminant;
    }

    /**
     * computeRoot1 - method to compute first real root
     * @return
     */
    public double computeRoot1() {
        return (-b + Math.sqrt(discriminant) / 2 * a);
    }

    /**
     * computeRoot2 - method to compute second real root
     * @return
     */
    public double computeRoot2() {
        return (-b - Math.sqrt(discriminant) / 2 * a);
    }
}
