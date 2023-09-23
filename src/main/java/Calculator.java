import AllOperations.Operation;
import Interface.ConsoleReader;
import Interface.InterfaceReader;

public class Calculator {

    private InterfaceReader qwe = new ConsoleReader();

    public String run(){

        System.out.print("Enter first number: ");
        Number first = qwe.firstNumber();

        System.out.print("Enter second number: ");
        Number second = qwe.secondNumber();

        System.out.print("Choose operation: ");
        Operation operation = qwe.readOperation();

        return "Result is " + operation.doOperation(first, second);
    }
}