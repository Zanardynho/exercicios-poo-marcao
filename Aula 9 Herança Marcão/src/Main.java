import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Perguntar ao usuário
        System.out.print("Digite o título do livro: ");
        String titulo = scanner.nextLine();

        System.out.print("Digite o autor do livro: ");
        String autor = scanner.nextLine();

        System.out.print("Digite o ano de publicação: ");
        int ano = scanner.nextInt();

        System.out.print("O livro está emprestado? (true/false): ");
        boolean emprestado = scanner.nextBoolean();
        scanner.nextLine(); // Consumir o enter pendente

        // Criar o livro com os dados do usuário
        Livro livro = new Livro(titulo, autor, ano, emprestado);

        int opcao = 0;

        do {
            System.out.println("\n#### MENU ####");
            System.out.println("1 - Emprestar");
            System.out.println("2 - Devolver");
            System.out.println("3 - Informações");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir enter pendente

            switch (opcao) {
                case 1:
                    if (livro.isEmprestado()) {
                        System.out.println("O livro já está emprestado!");
                    } else {
                        livro.emprestar();
                        System.out.println("Livro emprestado com sucesso!");
                    }
                    break;

                case 2:
                    if (!livro.isEmprestado()) {
                        System.out.println("O livro já está disponível!");
                    } else {
                        livro.devolver();
                        System.out.println("Livro devolvido com sucesso!");
                    }
                    break;

                case 3:
                    livro.cadastrar();
                    break;

                case 4:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 4);

        scanner.close();
    }
}

class Livro {
    private String titulo;
    private String autor;
    private int ano_publicado;
    private boolean emprestado;

    public Livro(String titulo, String autor, int ano_publicado, boolean emprestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano_publicado = ano_publicado;
        this.emprestado = emprestado;
    }

    public void cadastrar() {
        System.out.println("\n--- Dados do Livro ---");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano Publicado: " + ano_publicado);
        System.out.println("Emprestado: " + emprestado);
    }

    public void emprestar() {
        this.emprestado = true;
    }

    public void devolver() {
        this.emprestado = false;
    }

    public boolean isEmprestado() {
        return emprestado;
    }
}
