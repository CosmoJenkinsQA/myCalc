package AllOperations;

public abstract class Operation {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    private final char operatorSymbol;

    public Operation(char operatorSymbol) {
        this.operatorSymbol = operatorSymbol;
    }

    public char getOperatorSymbol() {
        return operatorSymbol;
    }

    public abstract <T extends Number> double doOperation(T first, T second) throws ArithmeticException;
}