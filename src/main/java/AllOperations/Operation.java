package AllOperations;

import Interface.Const;

import java.util.Stack;

public abstract class Operation implements Const {

    private final char operatorSymbol;

    public Operation(char operatorSymbol) {
        this.operatorSymbol = operatorSymbol;
    }

    public char getOperatorSymbol() {
        return operatorSymbol;
    }

    public abstract <T extends Number> double doOperation(T first, T second) throws ArithmeticException;







    /********************RPN****************************/
    /***будущий dooperation метод***/
    /********************Добавить доп алгоритм****************************/
    public static String expr2RPN(String expr) { /* expr - строка, которую вы вводим с консоли, т.е. само выражение */
        String current = ""; //то, куда мы кладем числа, а в последствии все из stack
        Stack<Character> stack = new Stack<>();
        int priority;

        for (int i = 0; i < expr.length(); i++) {

            priority = getPriority(expr.charAt(i)); //кидаем в getPriority по символьно со строки

            if (priority == 0) current += expr.charAt(i); // посылаем в getPriority символ и если метод вернет 0 (число т.е. ), то пихаем его в current и дальше аналогично
            if (priority == 1) stack.push(expr.charAt(i)); // expr.charAt(i) - конкретный символ со строки
            if (priority >= 1) {
                current += ' '; // ??? почему имеено сюда. Это действие разделение между числами, чтобы не было слитной строки

                while (!stack.empty()) {
                    if (getPriority(stack.peek()) >= priority) // peek - берет верхний символ из стека, т.е. тут пихаем в метод getPriority верхний элемент и смотрим, равен ли он нашему текущему приоритету
                        current += stack.pop(); // pop - удаляет элемент из стека и добавляет элемент в current
                    else break;
                }
                stack.push(expr.charAt(i));
            }
            if (priority == -1) {
                current += ' ';
                while (getPriority(stack.peek()) != 1) current += stack.pop();
                stack.pop();
            }
        }
        while (!stack.empty()) current += stack.pop();
        return current;
    }






    public static double rpn2Answer(String rpn) {
        String operand = new String();
        Stack<Double> stack2 = new Stack<>();
        for (int i = 0; i < rpn.length(); i++) {
            if (rpn.charAt(i) == ' ') continue;
            if (getPriority(rpn.charAt(i)) == 0) {
                while (rpn.charAt(i) != ' ' && getPriority(rpn.charAt(i)) == 0) {
                    operand += rpn.charAt(i++);
                    if (i == rpn.length()) break;
                }
                stack2.push(Double.parseDouble(operand));
                operand = new String();
            }

            if (getPriority(rpn.charAt(i)) > 1) {
                double a = stack2.pop();
                double b = stack2.pop();
                if ((rpn.charAt(i) == '+')) stack2.push( b + a );
                if ((rpn.charAt(i) == '-')) stack2.push( b - a );
                if ((rpn.charAt(i) == '*')) stack2.push( b * a );
                if ((rpn.charAt(i) == '/')) stack2.push( b / a );
            }
        }


        return stack2.pop();
    }




    public static int getPriority(char token) {
        if (token == '*' || token == '/') return 3;
        else if (token == '+' || token == '-') return 2;
        else if (token == '(') return 1;
        else if (token == ')') return -1;
        else return 0;
    }
}