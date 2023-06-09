package pro.sky.java.course2.calculator.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pro.sky.java.course2.calculator.exception.DivisionByZeroException;

import static pro.sky.java.course2.calculator.service.CalculatorServiceImplTestConstants.*;

class CalculatorServiceImplTest {
    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    @Test
    @DisplayName("Проверка сложения")
    void shouldReturnCorrectAnswerPlusWhenNumsAreCorrect() {
        int result = out.plus(CORRECT_NUM1, CORRECT_NUM2);
        Assertions.assertEquals(CORRECT_ANSWER_PLUS1, result);
        result = out.plus(CORRECT_NUM3, CORRECT_NUM4);
        Assertions.assertEquals(CORRECT_ANSWER_PLUS2,result);
    }

    @Test
    @DisplayName("Проверка вычитания")
    void shouldReturnCorrectAnswerMinusWhenNumsAreCorrect() {
        int result = out.minus(CORRECT_NUM1, CORRECT_NUM2);
        Assertions.assertEquals(CORRECT_ANSWER_MINUS1, result);
        result = out.minus(CORRECT_NUM3, CORRECT_NUM4);
        Assertions.assertEquals(CORRECT_ANSWER_MINUS2,result);
    }

    @Test
    @DisplayName("Проверка умножения")
    void shouldReturnCorrectAnswerMultiplyWhenNumsAreCorrect() {
        int result = out.multiply(CORRECT_NUM1, CORRECT_NUM2);
        Assertions.assertEquals(CORRECT_ANSWER_MULTIPLY1, result);
        result = out.multiply(CORRECT_NUM3, CORRECT_NUM4);
        Assertions.assertEquals(CORRECT_ANSWER_MULTIPLY2,result);
    }

    @Test
    @DisplayName("Проверка деления")
    void shouldReturnCorrectAnswerDivideWhenNumsAreCorrect() {
        int result = out.divide(CORRECT_NUM1, CORRECT_NUM2);
        Assertions.assertEquals(CORRECT_ANSWER_DIVIDE1, result);
        result = out.divide(CORRECT_NUM3, CORRECT_NUM4);
        Assertions.assertEquals(CORRECT_ANSWER_DIVIDE2,result);
    }

    @Test
    @DisplayName("Проверка деления на 0")
    void shouldThrowDivisionByZeroExceptionWhenDivideByIncorrectNum2() {
        Assertions.assertThrows(DivisionByZeroException.class,
                () -> out.divide(CORRECT_NUM1, INCORRECT_NUM2));
    }

}