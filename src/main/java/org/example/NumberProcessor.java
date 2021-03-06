package org.example;

import org.example.model.Result;

public class NumberProcessor {

    @SuppressWarnings("unchecked")
    public static <T extends Number> Result<T> process(T first, T second) {
        Class<? extends Number> numberClazz = first.getClass();

        Result<T> result = null;
        if (numberClazz == Integer.class) {
            Integer firstNumber = (Integer) first;
            Integer secondNumber = (Integer) second;
            if (secondNumber == 0) {
                throw new IllegalArgumentException("Cannot divide by 0!");
            }
            Integer multiplication = firstNumber * secondNumber;
            Integer division = firstNumber / secondNumber;
            Integer modulo = firstNumber % secondNumber;

            result = new Result(multiplication, division, modulo);
        } else if (numberClazz == Double.class) {
            Double firstNumber = (Double) first;
            Double secondNumber = (Double) second;

            Double multiplication = firstNumber * secondNumber;
            Double division = firstNumber / secondNumber;
            Double modulo = firstNumber % secondNumber;

            result = new Result(multiplication, division, modulo);
        }

        return result;
    }
}
