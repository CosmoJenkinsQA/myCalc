package AllOperations;

public class Summation extends Operation {
    long res;

    public Summation() {
        super("SLOJENIE", '+');
    }

    @Override
    public int doOperation(int first, int second) throws Exception {
        res = Math.addExact(first, second);
        if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {
            throw new Exception("Too long result for int!");
        }
        return (int) res;
    }
}