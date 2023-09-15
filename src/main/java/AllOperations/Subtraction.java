package AllOperations;

public class Subtraction extends Operation {
    int res;

    public Subtraction() {
        super('-');
    }

    @Override
    public int doOperation(int first, int second){
        res = Math.subtractExact(first, second);
        return res;
    }
}