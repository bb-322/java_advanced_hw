package hw6.task2;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * annotation to hold two numbers for calculator operations
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface CalcNum {

    /**
     * first number
     */
    double a();

    /**
     * second number
     */
    double b();
}
