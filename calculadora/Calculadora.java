package calculadora;

public class Calculadora {
    public int r;

    public int calc(int a, int b, String op) {
        if (op.equals("+")) {
            r = a + b;
        } else if (op.equals("-")) {
            r = a - b;
        } else if (op.equals("*")) {
            r = a * b;
        } else if (op.equals("/")) {
            if (b == 0) {
                System.out.println("Erro: Divisão por zero não permitida!");
                return 0;
            }
            r = a / b;
        } else {
            System.out.println("Operação inválida!");
            return 0;
        }
        return r;
    }
}
