import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();
        System.out.print("Agora digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        System.out.print("Agora digite o saldo disponível: ");
        Double saldo = scanner.nextDouble();
        scanner.nextLine(); //Consome a quebra de linha deixada pelo input anterior, evitando problema de leitura no próximo nextLine!
        System.out.print("Agora digite o seu nome completo: ");
        String nome = scanner.nextLine();

        System.out.println("\nCarregando dados...");
        System.out.println("Olá, "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numeroConta+", e seu saldo de R$"+saldo+" já está disponível para saque.\n");
    }
}
