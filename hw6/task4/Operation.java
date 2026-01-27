package hw6.task4;

import java.lang.reflect.Method;

public class Operation {
    public static void main(String[] args) throws Exception {
        Method method = Operation.class.getMethod("mathSum", int.class, int.class);

        Math annotation = method.getAnnotation(Math.class);

        int a = annotation.num1();
        int b = annotation.num2();
        mathSum(a, b);

    }

    @Math(num1 = 100, num2 = 200)
    public static void mathSum(int num1, int num2) {
        System.out.println(num1 + num2);
    }
}