package AllOperations;

public class Multiplication extends Operation {
    int res;

    public Multiplication() {
        super( '*');
    }

    @Override
    public int doOperation(int first, int second){
        res = (int) Math.multiplyFull(first, second);
        return res;
    }
}