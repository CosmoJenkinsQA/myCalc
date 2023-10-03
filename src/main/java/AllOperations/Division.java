package AllOperations;

import java.util.Stack;

public class Division extends Operation {

    public Division() {
        super('/');
    }

    @Override
    public <T extends Number> double doOperation(T first, T second) throws ArithmeticException {
        if (second.doubleValue() == 0 || (first.doubleValue() == 0 && second.doubleValue() == 0)) {
            throw new ArithmeticException(ANSI_RED + "Деление на ноль невозможно!" + ANSI_RESET);
        } else if ((first.doubleValue() / second.doubleValue()) > 1.7e+308 ||
                (first.doubleValue() / second.doubleValue()) < -1.7e+308) {
            throw new ArithmeticException(ANSI_RED + "Превышена граница допустимых значений" + ANSI_RESET);
        } else if ((first.doubleValue() / second.doubleValue()) == 1.7e+308 ||
                (first.doubleValue() / second.doubleValue()) == -1.7e+308) {
            throw new ArithmeticException(ANSI_RED + "Вы находитесь на границе допустимых значений" + ANSI_RESET);
        }
        return first.doubleValue() / second.doubleValue();
    }

    public static String expr2RPN(String expr){ // expr - строка, которую вы вводим с консоли, т.е. само выражение
        String current = ""; //то, куда мы кладем числа, а в последствии все из stack
        Stack<Character> stack = new Stack<>();
        int priority;

        for (int i = 0; i < expr.length(); i++) {
            priority = getPriority(expr.charAt(i)); //кидаем в getPriority по символьно со строки
            if (priority == 0) current += expr.charAt(i); // посылаем в getPriority символ и если метод вернет 0 (число т.е. ), то пихаем его в current и дальше аналогично
            if (priority == 1) stack.push(expr.charAt(i)); // expr.charAt(i) - конкретный символ со строки
            if (priority > 1){
                current += ' '; // ??? почему имеено сюда. Это действие разделение между числами, чтобы не было слитной строки

                while (!stack.empty()){
                    if (getPriority(stack.peek()) >= priority) // peek - берет верхний символ из стека, т.е. тут пихаем в метод getPriority верхний элемент и смотрим, равен ли он нашему текущему приоритету
                        current += stack.pop(); // pop - удаляет элемент из стека и добавляет элемент в current
                    else break;
                }
                stack.push(expr.charAt(i));
            }
        }
        return current;
    }

    public static int getPriority(char token) {
        if (token == '*' || token == '/') return 3;
        else if (token == '+' || token == '-') return 2;
        else if (token == '(') return 1;
        else if (token == ')') return -1;
        else return 0;
    }
}
