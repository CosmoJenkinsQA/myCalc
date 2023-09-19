package AllOperations;

public class Multiplication extends Operation {

    public Multiplication() {
        super( '*');
    }

    @Override
    public <T extends Number>  double doOperation(T first, T second) throws ArithmeticException{
        return first.doubleValue()/ second.doubleValue();
    }
}