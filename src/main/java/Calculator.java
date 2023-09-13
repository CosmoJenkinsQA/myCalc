import AllOperations.Operation;
import Interface.ConsoleReader;
import Interface.InterfaceReader;

public class Calculator {

    private InterfaceReader qwe = new ConsoleReader();

    public String run() throws Exception {
        System.out.print("Enter first number: ");
        int first = qwe.firstNumber();
        System.out.print("Enter second number: ");
        int second = qwe.secondNumber();
        System.out.print("Choose operation: ");
        Operation operationn = qwe.readOperation();
        return "Result is: " + operationn.doOperation(first, second);
    }
}