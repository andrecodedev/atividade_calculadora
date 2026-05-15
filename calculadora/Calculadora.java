package calculadora;

public class Calculadora {

    public int calc(int a, int b, String operador) {
        switch (operador) {
            case "+": return somar(a, b);
            case "-": return subtrair(a, b);
            case "*": return multiplicar(a, b);
            case "/": return dividir(a, b);
            default:
                System.out.println("Operação inválida!");
                return 0;
        }
    }

    private int somar(int a, int b) {
        return a + b;
    }

    private int subtrair(int a, int b) {
        return a - b;
    }

    private int multiplicar(int a, int b) {
        return a * b;
    }

    private int dividir(int a, int b) {
        if (b == 0) {
            System.out.println("Erro: Divisão por zero não permitida!");
            return 0;
        }
        return a / b;
    }
}
