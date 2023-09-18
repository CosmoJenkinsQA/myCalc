package AllOperations;

public class Multiplication extends Operation {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    double res;

    public Multiplication() {
        super( '*');
    }

    @Override
    public double doOperation(double first, double second) throws Exception{
        res = first * second;
        if (res > 2147483647 || res < -2147483647) {
            throw new Exception(ANSI_RED + "Число выходит за границу диапазона (-2147483647; 2147483647)!" + ANSI_RESET);
        }
        return res;
    }
}