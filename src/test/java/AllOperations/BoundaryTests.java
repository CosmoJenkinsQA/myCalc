package AllOperations;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BoundaryTests {

    @DisplayName("Проверка деления на 0")
    @Test
    @Tag("BoundaryValues")
    public void divLimit() {
        Operation divl = new Division();
        Throwable throwable =
                assertThrows(ArithmeticException.class, () -> {
                    divl.doOperation(1, 0);
                }, "Тест не обрабатывает исключение");
        assertEquals("\u001B[31mДеление на ноль невозможно!\u001B[0m", throwable.getMessage());
    }

    @DisplayName("Проверка суммирования на граничном значении  double")
    @Test
    @Tag("BoundaryValues")
    public void summBoundary() throws ArithmeticException {
        Operation suml = new Summation();
        Throwable throwable =
                assertThrows(ArithmeticException.class, () -> {
                    suml.doOperation(1.7e+308, 0);
                });
        assertEquals("\u001B[31mВы находитесь на границе допустимых значений\u001B[0m", throwable.getMessage());

        Throwable thrown =
                assertThrows(ArithmeticException.class, () -> {
                    suml.doOperation(-1.7e+308, 0);
                });
        assertEquals("\u001B[31mВы находитесь на границе допустимых значений\u001B[0m", thrown.getMessage());
    }

    @DisplayName("Проверка вычитания на граничном значении double")
    @Test
    @Tag("BoundaryValues")
    public void subBoundary() throws ArithmeticException {
        Operation subl = new Subtraction();
        Throwable throwable =
                assertThrows(ArithmeticException.class, () -> {
                    subl.doOperation(1.7e+308, 0);
                }, "Тест не выбрасывает исключение");
        assertEquals("\u001B[31mВы находитесь на границе допустимых значений\u001B[0m", throwable.getMessage());

        Throwable thrown =
                assertThrows(ArithmeticException.class, () -> {
                    subl.doOperation(-1.7e+308, 0);
                }, "Тест не выбрасывает исключение");
        assertEquals("\u001B[31mВы находитесь на границе допустимых значений\u001B[0m", thrown.getMessage());
    }

    @DisplayName("Проверка умножения на граничном значении double " )
    @Test
    @Tag("BoundaryValues")
    public void multBoundary(){
        Operation multl = new Multiplication();
        Throwable throwable =
                assertThrows(ArithmeticException.class, () -> {
                    multl.doOperation(1.7e+308, 1);
                }, "Тест не выбрасывает исключение");
        assertEquals("\u001B[31mВы находитесь на границе допустимых значений\u001B[0m", throwable.getMessage());

        Throwable thrown =
                assertThrows(ArithmeticException.class, () -> {
                    multl.doOperation(-1.7e+308, 1);
                }, "Тест не выбрасывает исключение");
        assertEquals("\u001B[31mВы находитесь на границе допустимых значений\u001B[0m", thrown.getMessage());
    }

    @DisplayName("Проверка деления на граничном значении double")
    @Test
    @Tag("BoundaryValues")
    public void divBoundary() {
        Operation divl = new Division();
        Throwable throwable =
                assertThrows(ArithmeticException.class, () -> {
                    divl.doOperation(1.7e+308, 1);
                }, "Тест не обрабатывает исключение");
        assertEquals("\u001B[31mВы находитесь на границе допустимых значений\u001B[0m", throwable.getMessage());

        Throwable thrown =
                assertThrows(ArithmeticException.class, () -> {
                    divl.doOperation(1.7e+308, 1);
                }, "Тест не обрабатывает исключение");
        assertEquals("\u001B[31mВы находитесь на границе допустимых значений\u001B[0m", thrown.getMessage());
    }
}
