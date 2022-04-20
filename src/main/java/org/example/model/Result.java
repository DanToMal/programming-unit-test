package org.example.model;

public class Result<T extends Number> {
    private final T multiplicationResult;
    private final T divisionResult;
    private final T remainder;

    public Result(T multiplicationResult, T divisionResult, T remainder) {
        this.multiplicationResult = multiplicationResult;
        this.divisionResult = divisionResult;
        this.remainder = remainder;
    }

    public Number getMultiplicationResult() {
        return multiplicationResult;
    }

    public Number getDivisionResult() {
        return divisionResult;
    }

    public Number getRemainder() {
        return remainder;
    }
}
