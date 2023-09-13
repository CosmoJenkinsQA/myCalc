package AllOperations;

public class Subtraction extends Operation {
    long res;

    public Subtraction() {
        super("VICHITANIE", '-');
    }

    @Override
    public int doOperation(int first, int second) throws Exception {
        res = Math.subtractExact(first, second);
        if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {
            throw new Exception("Too long result for int!");
        }
        return (int) res;
    }
}