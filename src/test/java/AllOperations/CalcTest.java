package AllOperations;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;


@DisplayName("Тестирование калькулятор")
class CalcTest {

    @ParameterizedTest(name = "#{index} - сложение {0}, {1} и ожидаем {2}")
    @DisplayName("Суммирование")
    @CsvSource({"2, 3, 5", "6, 9, 15", "100, 110, 210"})
    public void summ(int a, int b, int expectedResult) {
        Summation sum = new Summation();
        int result = sum.doOperation(a, b);
        assertEquals(expectedResult, result, "Метод суммирования работает неправильно ");
    }

    @ParameterizedTest(name = "#{index} - вычитание {0}, {1} и ожидаем {2}")
    @DisplayName("Вычитание")
    @CsvSource({"5, 3, 2", "15, 9, 6", "210, 110, 100"})
    public void subtrac(int a, int b, int expectedResult) {
        Subtraction sub = new Subtraction();
        int result = sub.doOperation(a, b);
        assertEquals(expectedResult, result, "Метод вычитания работает неправильно ");
    }

    @ParameterizedTest(name = "#{index} - умножение {0}, {1} и ожидаем {2}")
    @CsvSource({"2, 3, 6", "6, 9, 54", "100, 11, 1100"})
    @DisplayName("Умножение")
    public void multi(int a, int b, int expectedResult) {
        Multiplication multi = new Multiplication();
        int result = multi.doOperation(a, b);
        assertEquals(expectedResult, result, "Метод умножения работает неправильно ");
    }

    @ParameterizedTest(name = "#{index} - деление {0}, {1} и ожидаем {2}")
    @DisplayName("Деление")
    @CsvSource({"10, 2, 5", "60, 6, 10", "1000, 10, 100"})
    public void div(int a, int b, int expectedResult) {
        Division div = new Division();
        int result = div.doOperation(a, b);
        assertEquals(expectedResult, result, "Метод деления работает неправильно ");
    }
}