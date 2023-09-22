package AllOperations;

public class Multiplication extends Operation {

    public Multiplication() {
        super( '*');
    }

    @Override
    public <T extends Number>  double doOperation(T first, T second) throws ArithmeticException{
        if ((first.doubleValue() * second.doubleValue()) > 1.7e+308 ||
                (first.doubleValue() * second.doubleValue()) < -1.7e+308) {
            throw new ArithmeticException(ANSI_RED + "Превышена граница допустимых значений" + ANSI_RESET);
        }else if ((first.doubleValue() * second.doubleValue()) == 1.7e+308 ||
                (first.doubleValue() * second.doubleValue()) == -1.7e+308) {
            throw new ArithmeticException(ANSI_RED + "Вы находитесь на границе допустимых значений" + ANSI_RESET);
        }
        return first.doubleValue() * second.doubleValue();
    }
}