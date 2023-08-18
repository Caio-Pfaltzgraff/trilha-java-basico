import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Inicializando o scanner
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        // Lendo dados do usuário
        System.out.println("Por favor, digite o número da conta !");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.next();

        System.out.println("Por favor, digite seu nome !");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite seu saldo !");
        double saldo = scanner.nextDouble();

        String resultado = "Olá " + nomeCliente 
            + ", obrigado por criar uma conta em nosso banco, sua agência é " 
            + agencia + ", conta " + numero + " e seu saldo R$" 
            + saldo + " já está disponivel para saque.";

        // Exibindo os dados
        System.out.println(resultado);
        scanner.close();
    }
}
