package AllOperations;

public class Division extends Operation {
    long res;

    public Division() {
        super("DELENIE", '/');
    }


    @Override
    public int doOperation(int first, int second) throws Exception {
        res = Math.floorDiv(first, second);
        if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE || second == 0) {
            throw new Exception("Bad result or " + Double.POSITIVE_INFINITY + " Please try again with another numbers");
        }
        return (int) res;
    }
}