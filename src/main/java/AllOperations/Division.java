package AllOperations;

import java.util.Stack;

public class Division extends Operation {

    public Division() {
        super('/');
    }

    @Override
    public <T extends Number> double doOperation(T first, T second) throws ArithmeticException {
        if (second.doubleValue() == 0 || (first.doubleValue() == 0 && second.doubleValue() == 0)) {
            throw new ArithmeticException(ANSI_RED + "Деление на ноль невозможно!" + ANSI_RESET);
        } else if ((first.doubleValue() / second.doubleValue()) > 1.7e+308 ||
                (first.doubleValue() / second.doubleValue()) < -1.7e+308) {
            throw new ArithmeticException(ANSI_RED + "Превышена граница допустимых значений" + ANSI_RESET);
        } else if ((first.doubleValue() / second.doubleValue()) == 1.7e+308 ||
                (first.doubleValue() / second.doubleValue()) == -1.7e+308) {
            throw new ArithmeticException(ANSI_RED + "Вы находитесь на границе допустимых значений" + ANSI_RESET);
        }
        return first.doubleValue() / second.doubleValue();
    }

}
