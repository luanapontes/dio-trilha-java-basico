import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Solicita o número da conta
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();

        // Consome a quebra de linha deixada pelo nextInt
        scanner.nextLine();

        // Solicita o número da agência
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        // Solicita o nome do cliente
        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        // Solicita o saldo da conta
        System.out.println("Por favor, digite o saldo da Conta:");
        String saldoInput = scanner.nextLine();
        double saldo = Double.parseDouble(saldoInput.replace(',', '.'));

        // Exibe a mensagem final
        String mensagem = String.format(
            "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
            nomeCliente, agencia, numero, saldo
        );

        System.out.println(mensagem);

        // Fecha o scanner
        scanner.close();
    }
}
