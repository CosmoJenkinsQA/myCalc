import AllOperations.Operation;
import Interface.ConsoleReader;
import Interface.InterfaceReader;

public class Calculator {

    private InterfaceReader qwe = new ConsoleReader();

    public String run() throws Exception {
        System.out.print("Enter first number: ");
        double first = qwe.firstNumber();
        System.out.print("Enter second number: ");
        double second = qwe.secondNumber();
        System.out.print("Choose operation: ");
        Operation operation = qwe.readOperation();
        return "Result is: " + operation.doOperation(first, second);
    }
}