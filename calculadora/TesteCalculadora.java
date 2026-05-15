package calculadora;

public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("=== INICIANDO TESTES FUNCIONAIS ===\n");

        // Teste Adição
        executarTeste(calc, 10, 5, "+", 15, "Soma");
        
        // Teste Subtração
        executarTeste(calc, 10, 5, "-", 5, "Subtração");
        
        // Teste Multiplicação
        executarTeste(calc, 10, 5, "*", 50, "Multiplicação");
        
        // Teste Divisão
        executarTeste(calc, 10, 2, "/", 5, "Divisão");
        
        // Teste Divisão por Zero
        executarTeste(calc, 10, 0, "/", 0, "Divisão por Zero");
        
        // Teste Operação Inválida
        executarTeste(calc, 10, 5, "X", 0, "Operação Inválida");

        System.out.println("\n=== TESTES FINALIZADOS ===");
    }

    private static void executarTeste(Calculadora calc, int a, int b, String op, int esperado, String descricao) {
        int obtido = calc.calc(a, b, op);
        System.out.println("Cenário: " + descricao);
        System.out.println("Entrada: " + a + " " + op + " " + b);
        System.out.println("Esperado: " + esperado);
        System.out.println("Obtido: " + obtido);
        System.out.println(obtido == esperado ? "Status: PASSOU" : "Status: FALHOU");
        System.out.println("-----------------------------------");
    }
}
