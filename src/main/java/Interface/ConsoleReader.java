package Interface;

import AllOperations.Operation;
import Enum.NameOperations;

import java.util.Scanner;

public class ConsoleReader implements InterfaceReader {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RED = "\u001B[31m";

    Scanner scanner = new Scanner(System.in);
    @Override
    public int firstNumber() {
//        try{
//            scanner.nextInt();
//        }catch(Exception e){
//            System.out.println(ANSI_RED + "That not a number: " + ANSI_RESET + e.getMessage());
//            e.printStackTrace(System.out);
//            System.out.print(ANSI_BLUE + "Make another number: " + ANSI_RESET);
//        }
        return scanner.nextInt();
    }

    @Override
    public int secondNumber() {
//        try {
//            System.out.println("Вы ввели " + scanner.nextInt());
//        } catch (Exception e) {
//            System.out.println(ANSI_RED + "That not a number: " + ANSI_RESET + e.getMessage());
//            e.printStackTrace(System.out);
//            System.out.print(ANSI_BLUE + "Make another number: " + ANSI_RESET);
//            scanner.next();
//        }
        return scanner.nextInt();
    }

    @Override
    public Operation readOperation() {
        return NameOperations.logic(scanner.next().charAt(0)).valueInsideEnum();
    }
}