package AllOperations;

public class Summation extends Operation {
    int res;

    public Summation() {
        super('+');
    }

    @Override
    public int doOperation(int first, int second){
        res = first + second;
        return res;
    }
}