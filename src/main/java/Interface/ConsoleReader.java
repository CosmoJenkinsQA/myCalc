package Interface;

import AllOperations.Operation;
import Enum.NameOperations;
import java.util.Scanner;

public class ConsoleReader implements InterfaceReader, Const {
    Scanner scanner = new Scanner(System.in);

    public Number firstNumber() {
        Number num = getNumber();
        if (num != null) return num;
        else {
            System.out.print(ANSI_RED + "Это не число: \"" + scanner.next() + "\"" + ANSI_RESET + " Повторите попытку: ");
            Number num2 = getNumber();
            while (num2 == null) {
                System.out.print(ANSI_BLUE + "Введен некорректный символ, повторите попытку: " + ANSI_RESET);
                scanner.next();
                num2 = getNumber();
                if (num2 != null) return num2;
            }
            return num2;
        }
    }

    @Override
    public Number secondNumber() {
        Number num = getNumber();
        if (num != null) return num;
        else {
            System.out.print(ANSI_RED + "Это не число: \"" + scanner.next() + "\"" + ANSI_RESET + " Повторите попытку: ");
            Number num2 = getNumber();
            while (num2 == null) {
                System.out.print(ANSI_BLUE + "Введен некорректный символ, повторите попытку: " + ANSI_RESET);
                scanner.next();
                num2 = getNumber();
                if (num2 != null) return num2;
            }
            return num2;
        }
    }

    private Number getNumber() {
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else if (scanner.hasNextDouble()) {
            return scanner.nextDouble();
        } else return null;
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