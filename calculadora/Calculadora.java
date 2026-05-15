package calculadora;

/**
 * Classe Calculadora responsável por realizar operações matemáticas básicas.
 * Implementada como parte da atividade de Testes, Refatoração e Documentação.
 * 
 * @author André Vitor
 * @version 2.0
 */
public class Calculadora {

    /**
     * Realiza o cálculo entre dois números inteiros com base em um operador.
     * 
     * @param a        O primeiro operando (inteiro).
     * @param b        O segundo operando (inteiro).
     * @param operador O símbolo da operação (+, -, *, /).
     * @return O resultado da operação ou 0 em caso de erro.
     */
    public int calc(int a, int b, String operador) {
        switch (operador) {
            case "+":
                return somar(a, b);
            case "-":
                return subtrair(a, b);
            case "*":
                return multiplicar(a, b);
            case "/":
                return dividir(a, b);
            default:
                System.out.println("Operação inválida!");
                return 0;
        }
    }

    /**
     * Realiza a soma de dois inteiros.
     * @param a Primeiro número
     * @param b Segundo número
     * @return Soma de a e b
     */
    private int somar(int a, int b) {
        return a + b;
    }

    /**
     * Realiza a subtração de dois inteiros.
     * @param a Primeiro número
     * @param b Segundo número
     * @return Diferença entre a e b
     */
    private int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Realiza a multiplicação de dois inteiros.
     * @param a Primeiro número
     * @param b Segundo número
     * @return Produto de a e b
     */
    private int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Realiza a divisão de dois inteiros com proteção contra divisão por zero.
     * @param a Dividendo
     * @param b Divisor
     * @return Quociente da divisão ou 0 se o divisor for zero
     */
    private int dividir(int a, int b) {
        if (b == 0) {
            System.out.println("Erro: Divisão por zero não permitida!");
            return 0;
        }
        return a / b;
    }
}
