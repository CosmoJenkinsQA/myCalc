package AllOperations;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Негативные тест-кейсы")
class NegativeTests {

    @DisplayName("Проверка суммирования на лимит max.double")
    @Test
    @Tag("Limits")
    public void summLimitPlus(){
        Operation sum = new Summation();
        Throwable throwable =
                assertThrows(ArithmeticException.class, () -> {
                    sum.doOperation(Double.MAX_VALUE, 1);
                }, "Тест не выбрасывает исключение");
        assertEquals("\u001B[31mПревышена граница допустимых значений\u001B[0m", throwable.getMessage());
    }

    @DisplayName("Проверка суммирования на лимит min.double")
    @Test
    @Tag("Limits")
    public void summLimitMinus(){
        Operation suml = new Summation();
        Throwable throwable =
                assertThrows(ArithmeticException.class, () -> {
                    suml.doOperation(-2147483648, -1);
                }, "Тест не выбрасывает исключение");
        assertEquals("\u001B[31mПревышена граница допустимых значений\u001B[0m", throwable.getMessage());
    }

    @DisplayName("Проверка вычитания на лимит max.double")
    @Test
    @Tag("Limits")
    public void subLimitPlus(){
        Operation subl = new Subtraction();
        Throwable throwable =
                assertThrows(ArithmeticException.class, () -> {
                    subl.doOperation(1.7e+308, -10);
                }, "Тест не выбрасывает исключение");
        assertEquals("\u001B[31mПревышена граница допустимых значений\u001B[0m", throwable.getMessage());
    }

    @DisplayName("Проверка вычитания на лимит min.double ")
    @Test
    @Tag("Limits")
    public void subLimitMinus(){
        Operation subl = new Subtraction();
        Throwable throwable =
                assertThrows(ArithmeticException.class, () -> {
                    subl.doOperation(-1.7e+308, -100000);
                }, "Тест не выбрасывает исключение");
        assertEquals("\u001B[31mПревышена граница допустимых значений\u001B[0m", throwable.getMessage());
    }

    @DisplayName("Проверка умножения на лимит max.double " )
    @Test
    @Tag("Limits")
    public void multLimitPlus(){
        Operation multl = new Multiplication();
        Throwable throwable =
                assertThrows(ArithmeticException.class, () -> {
                    multl.doOperation(1.7e+308, 10);
                }, "Тест не выбрасывает исключение");
        assertEquals("\u001B[31mПревышена граница допустимых значений\u001B[0m", throwable.getMessage());
    }
    @DisplayName("Проверка умножения на лимит min.double ")
    @Test
    @Tag("Limits")
    public void multLimitMinus(){
        Operation multl = new Multiplication();
        Throwable thrown =
                assertThrows(ArithmeticException.class, () -> {
                    multl.doOperation(-1.7e+308, 10);
                }, "Тест не выбрасывает исключение");
        assertEquals("\u001B[31mПревышена граница допустимых значений\u001B[0m", thrown.getMessage());

    }

    @DisplayName("Проверка деления на лимит min.double ")
    @Test
    @Tag("Limits")
    public void divLimitMinus(){
        Operation divl = new Division();
        Throwable throwable =
                assertThrows(ArithmeticException.class, () -> {
                    divl.doOperation(-1.7e+308, 0.1);
                },"Тест не обрабатывает исключение");
        assertEquals("\u001B[31mПревышена граница допустимых значений\u001B[0m", throwable.getMessage());
    }

    @DisplayName("Проверка деления на лимит max.double ")
    @Test
    @Tag("Limits")
    public void divLimitPlus(){
        Operation divl = new Division();
        Throwable throwable =
                assertThrows(ArithmeticException.class, () -> {
                    divl.doOperation(1.7e+308, 0.1);
                },"Тест не обрабатывает исключение");
        assertEquals("\u001B[31mПревышена граница допустимых значений\u001B[0m", throwable.getMessage());
    }
}