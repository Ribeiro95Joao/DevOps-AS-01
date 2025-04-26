public class Calculadora {
    public int soma(int a, int b) {
        return a + b;
    }

    public int subtrai(int a, int b) {
        return a - b;
    }

    public int multiplica(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Divisão por zero!");
        return a / b;
    }

    public boolean ehPar(int num) {
        return num % 2 == 0;
    }
}

