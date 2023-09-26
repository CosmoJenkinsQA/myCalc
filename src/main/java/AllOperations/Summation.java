package AllOperations;

public class Summation extends Operation {

    public Summation() {
        super('+');
    }

    @Override
    public <T extends Number> double doOperation(T first, T second) throws ArithmeticException {
        if ((first.doubleValue() + second.doubleValue()) > Double.MAX_VALUE ||
                (first.doubleValue() + second.doubleValue()) < Integer.MIN_VALUE) {
            throw new ArithmeticException(ANSI_RED + "Превышена граница допустимых значений" + ANSI_RESET);
        } else if ((first.doubleValue() + second.doubleValue()) == Double.MAX_VALUE ||
                (first.doubleValue() + second.doubleValue()) == Integer.MIN_VALUE){
            throw new ArithmeticException(ANSI_RED + "Вы находитесь на границе допустимых значений" + ANSI_RESET);
        }
        return first.doubleValue() + second.doubleValue();
    }
}