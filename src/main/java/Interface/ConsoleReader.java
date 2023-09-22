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
    public double firstNumber() {
        try {
            return scanner.nextDouble();
        } catch (Exception e) {
            System.out.println(ANSI_RED + "Это не число: " + ANSI_RESET + e.getMessage());
            e.printStackTrace(System.out);
            while (true) {
                String input = scanner.next();
                try {
                    return Double.parseDouble(input);
                } catch (NumberFormatException ne) {
                    System.out.print(ANSI_BLUE + "Введен некорректный символ, повторите попытку: " + ANSI_RESET);
                }
            }
        }
    }

    @Override
    public double secondNumber() {
        try {
            return scanner.nextDouble();
        } catch (Exception e) {
            System.out.println(ANSI_RED + "Это не число: " + ANSI_RESET + e.getMessage());
            e.printStackTrace(System.out);
            while (!scanner.hasNextDouble()) {
                System.out.print(ANSI_BLUE + "Введен некорректный символ, повторите попытку: " + ANSI_RESET);
                scanner.next();
            }
        }
        return scanner.nextDouble();
    }

    // !!!! НЕРЕАЛИЗОВАННАЯ ФИЧА !!!!
//    public void answerOf() {
//        char c = scanner.next().charAt(0);
//        for (Answer value : Answer.values()) {
//            if (value.getValue() == c) {
//                switch (value) {
//                    case YES -> System.out.println("Введите следующее ариф. действие: ");
//                    case NO  -> System.out.print("Результат:");
//                }
//            }
//        }
//    }

    @Override
    public Operation readOperation() {
        return NameOperations.logic(scanner.next().charAt(0)).valueInsideEnum();
    }
}