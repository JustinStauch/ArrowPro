package arrowpro.equations.exponential;

import arrowpro.equations.StatSolver;

/**
 * Represents a StatSolver that uses exponential equations to solve for it.
 * 
 * An exponential equation is an equation with a constant that is put to the power of the x value then multiplied by another constant and added by one more constant. It requires logarithms to solve for the root.
 * b is sent to the power of x minus d times c then multiplied by a and then has f added on.
 * 
 * @author Justin Stauch
 * @since May 25, 2012
 * 
 * copyright 2012© Justin Stauch, All Rights Reserved
 */
public class Exponential implements StatSolver {
    private double a, b, c, d, f, max, min;
    
    public Exponential(double a, double b, double c, double d, double f, double max, double min) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.f = f;
        this.max = max;
        this.min = min;
    }

    @Override
    public double solve(double x, double def) {
        double powered = Math.pow(b, c * (x - d));
        double result = (a * powered) + f;
        return result < min ? min : result > max ? max : result;
    }
}
