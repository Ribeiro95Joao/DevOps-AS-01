import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    Calculadora calculadora = new Calculadora();

    @Test
    void testSoma() {
        assertEquals(5, calculadora.soma(2, 3));
    }

    @Test
    void testSubtrai() {
        assertEquals(1, calculadora.subtrai(5, 4));
    }

    @Test
    void testMultiplica() {
        assertEquals(20, calculadora.multiplica(4, 5));
    }

    @Test
    void testDivide() {
        assertEquals(5, calculadora.divide(10, 2));
    }

    @Test
    void testDividePorZero() {
        assertThrows(ArithmeticException.class, () -> calculadora.divide(10, 0));
    }

    @Test
    void testEhPar() {
        assertTrue(calculadora.ehPar(4));
        assertFalse(calculadora.ehPar(5));
    }
}

