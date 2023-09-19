package AllOperations;

public class Summation extends Operation {

    public Summation() {
        super('+');
    }

    @Override
    public <T extends Number>  double doOperation(T first, T second) throws ArithmeticException{
        return first.doubleValue()/ second.doubleValue();
    }
}