package AllOperations;

public class Division extends Operation {

    public Division() {
        super('/');
    }

    @Override
    public <T extends Number> double doOperation(T first, T second) throws ArithmeticException {
        if (second.doubleValue() == 0) {
            throw new ArithmeticException(ANSI_RED + "Деление на ноль невозможно!" + ANSI_RESET);
        }
        return first.doubleValue() / second.doubleValue();
    }
}