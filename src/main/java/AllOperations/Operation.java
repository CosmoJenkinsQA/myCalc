package AllOperations;

public abstract class Operation {

    private final char operatorSymbol;

    public Operation(char operatorSymbol) {
        this.operatorSymbol = operatorSymbol;
    }

    public char getOperatorSymbol() {
        return operatorSymbol;
    }

    public abstract double doOperation(double first, double second) throws Exception;
}