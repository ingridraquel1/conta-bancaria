import java.util.Scanner;

public class conta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 1000.0;

        System.out.println("Digite o nome do titular da conta:");
        scanner.nextLine();

        System.out.println("Digite a senha para acessar sua conta:");
        String senha = scanner.nextLine();

        if (senha.equals("1a2b3c")) {
            System.out.println("Conta acessada com sucesso.");
            boolean sair = false;
            while (!sair) {
                System.out.println("Escolha uma opção: (1 para consultar saldo, 2 para realizar PIX, 0 para sair)");
                int escolha = scanner.nextInt();

                if (escolha == 1) {
                    System.out.println("Seu saldo atual é de R$ " + saldo);
                } else if (escolha == 2) {
                    System.out.println("Digite o valor que deseja enviar via Pix:");
                    double valorPix = scanner.nextDouble();
                    scanner.nextLine();
                    if (valorPix <= saldo) {
                        System.out.println("Digite o nome do destinatário:");
                        String destinatario = scanner.nextLine();
                        saldo -= valorPix;
                        System.out.println("Pix de R$" + valorPix + " enviado com sucesso para " + destinatario);
                        System.out.println("Seu saldo atual é de R$ " + saldo);
                    } else {
                        System.out.println("Saldo insuficiente para realizar o Pix.");
                    }
                } else if (escolha == 0) {
                    sair = true;
                    System.out.println("Saindo do sistema.");
                } else {
                    System.out.println("Opção inválida. Tente novamente.");
                }
            }
        } else {
            System.out.println("Senha errada! Tente novamente mais tarde.");
        }

        scanner.close();
    }
}
