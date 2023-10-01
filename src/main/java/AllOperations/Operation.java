package AllOperations;

import Interface.Const;

public abstract class Operation implements Const {

    private final char operatorSymbol;

    public Operation(char operatorSymbol) {
        this.operatorSymbol = operatorSymbol;
    }

    public char getOperatorSymbol() {
        return operatorSymbol;
    }

    public abstract <T extends Number> double doOperation(T first, T second) throws ArithmeticException;
}