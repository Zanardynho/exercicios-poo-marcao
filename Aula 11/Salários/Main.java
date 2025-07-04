import java.util.Scanner;

abstract class Funcionario {
    String nome;

    Funcionario(String nome) {
        this.nome = nome;
    }
    //Salário
    abstract double calcularSalario();
}

class FuncionarioHorista extends Funcionario {
    double valorHora;
    int horas;

    FuncionarioHorista(String nome, double valorHora, int horas) {
        super(nome);
        this.valorHora = valorHora;
        this.horas = horas;
    }
    @Override
    double calcularSalario() {
        return valorHora * horas;
    }
}
class FuncionarioAssalariado extends Funcionario {
    double salarioMensal;

    FuncionarioAssalariado(String nome, double salarioMensal) {
        super(nome);
        this.salarioMensal = salarioMensal;
    }
    @Override
    double calcularSalario() {
        return salarioMensal;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//array
        Funcionario[] funcionarios = new Funcionario[2];

// funcionários
        for (int i = 0; i < funcionarios.length; i++) {
            System.out.println("Digite o tipo do funcionário (1 - Horista / 2 - Assalariado):");
            int tipo = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Nome: ");
            String nome = scanner.nextLine();
//horista
            if (tipo == 1) {
                System.out.print("Valor da hora: ");
                double valorHora = scanner.nextDouble();

                System.out.print("Horas trabalhadas: ");
                int horas = scanner.nextInt();
//assalariado
                funcionarios[i] = new FuncionarioHorista(nome, valorHora, horas);
            } else if (tipo == 2) {
                System.out.print("Digite o salário mensal: ");
                double salarioMensal = scanner.nextDouble();

                funcionarios[i] = new FuncionarioAssalariado(nome, salarioMensal);
            }
        }
// Exibir salários
        for (Funcionario f : funcionarios) {
            System.out.println("Funcionário: " + f.nome);
            System.out.println("Salário: R$ " + f.calcularSalario());
            System.out.println();
        }
        scanner.close();
    }
}