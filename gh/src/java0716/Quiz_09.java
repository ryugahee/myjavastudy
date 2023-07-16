package java0716;

class Calc {
    int a, b;

    int plus(int a, int b) {
        int result = a + b;
        return result;
    }

    int minus(int a, int b) {
        int result = a - b;
        return result;
    }

    int multiply(int a, int b) {
        int result = a * b;
        return result;
    }

    int divide(int a, int b) {
        int result = a / b;
        return result;
    }
}

public class Quiz_09 {
    public static void main(String[] args) {
        Calc calc = new Calc();
        System.out.printf("더하기 연산: %d%n", calc.plus(3, 5));
        System.out.printf("빼기 연산: %d%n", calc.minus(5, 2));
        System.out.printf("곱하기 연산: %d%n", calc.multiply(5, 3));
        System.out.printf("나누기 연산: %d%n", calc.divide(6, 3));
    }
}

