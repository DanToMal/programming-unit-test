package org.example.model;

public class Result<T extends Number> {
    private final T multiplicationResult;
    private final T divisionResult;
    private final T modulo;

    public Result(T multiplicationResult, T divisionResult, T remainder) {
        this.multiplicationResult = multiplicationResult;
        this.divisionResult = divisionResult;
        this.modulo = remainder;
    }

    public Number getMultiplicationResult() {
        return multiplicationResult;
    }

    public Number getDivisionResult() {
        return divisionResult;
    }

    public Number getModulo() {
        return modulo;
    }
}
