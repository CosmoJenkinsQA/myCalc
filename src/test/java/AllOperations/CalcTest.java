package AllOperations;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


@DisplayName("Тестирование калькулятор")
class CalcTest {

    @ParameterizedTest(name = "#{index} - сложение {0}, {1} и ожидаем {2}")
    @DisplayName("Суммирование")
    @CsvSource({"2, 3, 5", "-100, 110, 10", "0, -1, -1"})
    public void summ(int a, int b, int expectedResult) throws Exception {
        Operation sum = new Summation();
        int result = (int) sum.doOperation(a, b);
        assertEquals(expectedResult, result, "Метод суммирования работает неправильно ");
    }

    @ParameterizedTest(name = "#{index} - вычитание {0}, {1} и ожидаем {2}")
    @DisplayName("Вычитание")
    @CsvSource({"5, 3, 2", "15, 9, 6", "210, 110, 100"})
    public void subtrac(int a, int b, int expectedResult) {
        Operation sub = new Subtraction();
        int result;
        try {
            result = (int) sub.doOperation(a, b);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        assertEquals(expectedResult, result, "Метод вычитания работает неправильно ");
    }

    @ParameterizedTest(name = "#{index} - умножение {0}, {1} и ожидаем {2}")
    @CsvSource({"2, 3, 6", "6, 9, 54", "100, 11, 1100"})
    @DisplayName("Умножение")
    public void multi(int a, int b, int expectedResult) throws Exception {
        Operation multi = new Multiplication();
        int result = (int) multi.doOperation(a, b);
        assertEquals(expectedResult, result, "Метод умножения работает неправильно ");
    }

    @ParameterizedTest(name = "#{index} - деление {0}, {1} и ожидаем {2}")
    @DisplayName("Деление")
    @CsvSource({"10, 2, 5", "60, 6, 10", "1000, 10, 100"})
    public void div(long a, long b, long expectedResult) throws Exception {
        Operation div = new Division();
        int result = (int) div.doOperation(a, b);
        assertEquals(expectedResult, result, "Метод деления работает неправильно ");
    }




    @DisplayName("Проверка суммирования на лимит инта")
    @Test
    @Tag("limits")
    public void summLimit(){
        Operation suml = new Summation();
        assertThrows(Exception.class, () -> suml.doOperation(2147483647,1), "Тест не выбрасывает исключение");
    }

    @DisplayName("Проверка суммирования на лимит инта")
    @Test
    @Tag("limits")
    public void subLimit(){
        Operation subl = new Subtraction();
        assertThrows(Exception.class, () -> subl.doOperation(2147483647,1), "Тест не выбрасывает исключение");
    }

    @DisplayName("Проверка суммирования на лимит инта")
    @Test
    @Tag("limits")
    public void multLimit(){
        Operation multl = new Multiplication();
        assertThrows(Exception.class, () -> multl.doOperation(2147483647,1), "Тест не выбрасывает исключение");
    }

    @DisplayName("Проверка суммирования на лимит инта")
    @Test
    @Tag("limits")
    public void divLimit(){
        Operation divl = new Division();
        assertThrows(Exception.class, () -> divl.doOperation(-2147483647,-1), "Тест не выбрасывает исключение");
    }
}