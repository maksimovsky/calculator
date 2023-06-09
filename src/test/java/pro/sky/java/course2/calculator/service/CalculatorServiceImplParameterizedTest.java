package pro.sky.java.course2.calculator.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static pro.sky.java.course2.calculator.service.CalculatorServiceImplTestConstants.*;

class CalculatorServiceImplParameterizedTest {

    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    @ParameterizedTest
    @DisplayName("Проверка сложения")
    @MethodSource("provideParamsForTestPlus")
    public void shouldGenerateCorrectAnswersPlus(Integer num1, Integer num2, Integer answer) {
        Integer result = out.plus(num1, num2);
        Assertions.assertEquals(answer, result);
    }

    @ParameterizedTest
    @DisplayName("Проверка вычитания")
    @MethodSource("provideParamsForTestMinus")
    public void shouldGenerateCorrectAnswersMinus(int num1, int num2, int answer) {
        int result = out.minus(num1, num2);
        Assertions.assertEquals(answer, result);
    }

    @ParameterizedTest
    @DisplayName("Проверка умножения")
    @MethodSource("provideParamsForTestMultiply")
    public void shouldGenerateCorrectAnswersMultiply(int num1, int num2, int answer) {
        int result = out.multiply(num1, num2);
        Assertions.assertEquals(answer, result);
    }

    @ParameterizedTest
    @DisplayName("Проверка деления")
    @MethodSource("provideParamsForTestDivide")
    public void shouldGenerateCorrectAnswersDivide(int num1, int num2, int answer) {
        int result = out.divide(num1, num2);
        Assertions.assertEquals(answer, result);
    }

    private static Stream<Arguments> provideParamsForTestPlus() {
        return Stream.of(
                Arguments.of(CORRECT_NUM1, CORRECT_NUM2, CORRECT_ANSWER_PLUS1),
                Arguments.of(CORRECT_NUM3, CORRECT_NUM4, CORRECT_ANSWER_PLUS2)
        );
    }

    private static Stream<Arguments> provideParamsForTestMinus() {
        return Stream.of(
                Arguments.of(CORRECT_NUM1, CORRECT_NUM2, CORRECT_ANSWER_MINUS1),
                Arguments.of(CORRECT_NUM3, CORRECT_NUM4, CORRECT_ANSWER_MINUS2)
        );
    }

    private static Stream<Arguments> provideParamsForTestMultiply() {
        return Stream.of(
                Arguments.of(CORRECT_NUM1, CORRECT_NUM2, CORRECT_ANSWER_MULTIPLY1),
                Arguments.of(CORRECT_NUM3, CORRECT_NUM4, CORRECT_ANSWER_MULTIPLY2)
        );
    }

    private static Stream<Arguments> provideParamsForTestDivide() {
        return Stream.of(
                Arguments.of(CORRECT_NUM1, CORRECT_NUM2, CORRECT_ANSWER_DIVIDE1),
                Arguments.of(CORRECT_NUM3, CORRECT_NUM4, CORRECT_ANSWER_DIVIDE2)
        );
    }
}