import java.util.Scanner; // 1. Importar

public class teste {
    public static void main(String[] args) {
        // 2. Criar o objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Pedir Texto (String)
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine(); // 4. Ler linha

        // Pedir Inteiro (int)
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt(); // 4. Ler inteiro

        System.out.println("Olá " + nome + ", você tem " + idade + " anos.");

        // 5. Fechar o scanner
        scanner.close();
    }
}
