package de.ait.unittests;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    private  Calculator calculator;

    @BeforeEach
    void setUp(){
        //Arrange
        calculator = new Calculator();
        System.out.println("setUp");
    }

    @Test
    @DisplayName("Должен сложить два положительных числа")
    void testAddShouldAddTwoNumbers(){

        //Act
        int result = calculator.add(5,10);

        //Assert
        assertEquals(15, result);

    }

    @Test
    @DisplayName("Должен сложить два нуля")
    void testAddShouldAddTwo0Numbers(){
        int result = calculator.add(0,0);

        //Assert
        assertEquals(0, result);
    }


}