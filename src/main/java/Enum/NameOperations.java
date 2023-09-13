package Enum;

import AllOperations.*;

public enum NameOperations {
    SUMMATION(new Summation()),
    SUBTRACTION(new Subtraction()),
    MULTIPLICATION(new Multiplication()),
    DIVISION(new Division());

    private final Operation operation;

    NameOperations(Operation operation) {
        this.operation = operation;
    }

    public Operation valueInsideEnum() {
        return operation;
    }


    public static NameOperations logic(char symbol) {
        for (NameOperations value : values()) {
            if (value.valueInsideEnum().getOperatorSymbol() == symbol)
                return value;
        }
        throw new IllegalArgumentException("Uncorrect symbol " + symbol);
    }
}