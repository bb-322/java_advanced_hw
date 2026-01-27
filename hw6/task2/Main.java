package hw6.task2;

public class Main {
    static void main() {
        CalcNum nums = Operation.class.getAnnotation(CalcNum.class);
        double a = nums.a();
        double b = nums.b();

        Calculator calc = new Calculator();
        System.out.println("add: " + calc.add(a, b));
        System.out.println("subtract: " + calc.sub(a, b));
        System.out.println("multiply: " + calc.mult(a, b));
        System.out.println("divide: " + calc.div(a, b));

    }
}
