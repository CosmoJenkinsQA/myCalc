package Interface;

import AllOperations.Operation;
import Enum.NameOperations;

import java.util.Scanner;

public class ConsoleReader implements InterfaceReader {
    Scanner scanner = new Scanner(System.in);
    @Override
    public int firstNumber() {
        return scanner.nextInt();
    }

    @Override
    public int secondNumber() {
        return scanner.nextInt();
    }

    @Override
    public Operation readOperation() {
        return NameOperations.logic(scanner.next().charAt(0)).valueInsideEnum();
    }
}