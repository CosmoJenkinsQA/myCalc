package AllOperations;

public class Division extends Operation {
    int res;

    public Division() {
        super('/');
    }


    @Override
    public int doOperation(int first, int second){
        res = Math.floorDiv(first, second);
        return res;
    }
}