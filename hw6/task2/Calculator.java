package hw6.task2;


/**
 * simple calculator class that can perform basic operations
 */
public class Calculator {

    /**
     * default constructor
     */
    public Calculator() {
    }


    /**
     * adds two numbers from annotation
     * @param a first number
     * @param b second number
     * @return sum of a and b
     */
    public double add(double a, double b) {
        return a + b;
    }

    /**
     * subtracts two numbers from annotation
     * @param a first number
     * @param b second number
     * @return difference of a and b
     */
    public double sub(double a, double b) {
        return a - b;
    }

    /**
     * multiplies two numbers from annotation
     * @param a first number
     * @param b second number
     * @return product of a and b
     */
    public double mult(double a, double b) {
        return a * b;
    }

    /**
     * divides two numbers from annotation
     * @param a first number
     * @param b second number
     * @return quotient of a and b
     */
    public double div(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("division by 0");
        }
    }
}
