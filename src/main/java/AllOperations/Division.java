package AllOperations;

public class Division extends Operation {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    double res;

    public Division() {
        super('/');
    }

    @Override
    public double doOperation(double first, double second) throws Exception {
        res = first / second;
        if (second == 0) {
            throw new Exception(ANSI_RED + "Деление на ноль невозможно!" + ANSI_RESET);
        } else if (res > 2147483647 || res < -2147483647) {
            throw new Exception(ANSI_RED +"Число выходит за границу диапазона (-2147483647; 2147483647)!" + ANSI_RESET);
        }
        return res;
    }
}