package AllOperations;

public abstract class Operation {

    private final String name;
    private final char operatorSymbol;

    public Operation(String name, char operatorSymbol) {
        this.name = name;
        this.operatorSymbol = operatorSymbol;
    }


    public char getOperatorSymbol() {
        return operatorSymbol;
    }


    public abstract int doOperation(int first, int second) throws Exception;


}