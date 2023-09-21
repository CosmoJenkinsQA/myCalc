import AllOperations.Operation;
import Interface.ConsoleReader;
import Interface.InterfaceReader;
import Enum.Answer;

public class Calculator {

    private InterfaceReader qwe = new ConsoleReader();

    public String run(){
        System.out.print("Enter first number: ");
        double first = qwe.firstNumber();
        System.out.print("Enter second number: ");
        double second = qwe.secondNumber();
        System.out.println("Хотите ли Вы добавить еще число? Выберите: Y или N");
        
        System.out.print("Choose operation: ");
        Operation operation = qwe.readOperation();
        return "Result is: " + operation.doOperation(first, second);
    }
}