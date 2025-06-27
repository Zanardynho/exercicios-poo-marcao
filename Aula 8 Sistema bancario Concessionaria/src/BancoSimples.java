import java.util.Scanner;

public class BancoSimples {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        double saldo = 0.0;
        float opcao = 0;

        System.out.println("Bem-vindo ao seu Banco!");

        while (opcao != 4) {
            System.out.println("\nO que você quer fazer?");
            System.out.println("1 - Ver saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");

            System.out.print("Escolha: ");
            opcao = num.nextInt();

            if (opcao == 1) {
                System.out.println("Seu saldo é: R$" + saldo);
            } else if (opcao == 2) {
                System.out.print("Quanto quer depositar? ");
                double valor = num.nextDouble();
                saldo = saldo + valor;
                System.out.println("Dinheiro guardado!");
            } else if (opcao == 3) {
                System.out.print("Quanto quer sacar? ");
                double valor = num.nextDouble();
                if (valor <= saldo) {
                    saldo = saldo - valor;
                    System.out.println("Dinheiro retirado!");
                } else {
                    System.out.println("Você não tem dinheiro suficiente.");
                }
            } else if (opcao == 4) {
                System.out.println("Tchau! Até a próxima!");
            } else {
                System.out.println("Número inválido. Tente de novo.");
            }
        }

        num.close();
    }
}
