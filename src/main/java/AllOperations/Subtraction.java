package AllOperations;

public class Subtraction extends Operation {

    public Subtraction() {
        super('-');
    }

    @Override
    public <T extends Number> double doOperation(T first, T second) throws ArithmeticException{
        return first.doubleValue() - second.doubleValue();
    }
}