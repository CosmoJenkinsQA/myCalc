package AllOperations;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


@DisplayName("Позитивные тест-кейсы")
class PositiveTests {

    @ParameterizedTest(name = "#{index} - сложение {0}, {1} и ожидаем {2}")
    @DisplayName("Суммирование")
    @CsvSource({"2, 3, 5", "-100, 110, 10"})
    public void summ(double a, double b, double expectedResult) {
        Operation sum = new Summation();
        double result = sum.doOperation(a, b);
        assertEquals(expectedResult, result, "Метод суммирования работает неправильно ");
    }

    @ParameterizedTest(name = "#{index} - из {0} вычитаем {1} и ожидаем {2}")
    @DisplayName("Вычитание")
    @CsvSource({"5, 3, 2", "-15, -9, -6", "-210, 110, -320"})
    public void subtrac(double a, double b, double expectedResult) {
        Operation sub = new Subtraction();
        double result = sub.doOperation(a, b);
        assertEquals(expectedResult, result, "Метод вычитания работает неправильно ");
    }

    @ParameterizedTest(name = "#{index} - умножение {0}, {1} и ожидаем {2}")
    @CsvSource({"2, 3, 6", "6, 0, 0", "0, 0, 0", "-2, -2, 4", "-2, 2, -4"})
    @DisplayName("Умножение")
    public void multi(double a, double b, double expectedResult) {
        Operation multi = new Multiplication();
        double result = multi.doOperation(a, b);
        assertEquals(expectedResult, result, "Метод умножения работает неправильно ");
    }

    @ParameterizedTest(name = "#{index} - деление {0}, {1} и ожидаем {2}")
    @DisplayName("Деление")
    @CsvSource({"10, 2, 5", "-60, 6, -10", "0, 10, 0"})
    public void div(double a, double b, double expectedResult) {
        Operation div = new Division();
        double result = div.doOperation(a, b);
        assertEquals(expectedResult, result, "Метод деления работает неправильно ");
    }

    @DisplayName("Проверка деления на 0")
    @Test
    @Tag("BoundaryValues")
    public void divLimit(){
        Operation divl = new Division();
        Throwable throwable =
                assertThrows(ArithmeticException.class, () -> {
                    divl.doOperation(1, 0);
                },"Тест не обрабатывает исключение");
        assertEquals("\u001B[31mДеление на ноль невозможно!\u001B[0m", throwable.getMessage());
    }

}
