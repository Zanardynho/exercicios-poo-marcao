import java.util.Scanner;

class Veiculo {
    String marca;
    String modelo;
    int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}

class Carro extends Veiculo {
    String combustivel;
    int portas;

    public Carro(String marca, String modelo, int ano, String combustivel, int portas) {
        super(marca, modelo, ano);
        this.combustivel = combustivel;
        this.portas = portas;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("\n=== Carro Cadastrado ===");
        super.mostrarInfo();
        System.out.println("Combustível: " + combustivel);
        System.out.println("Portas: " + portas);
    }
}

class Moto extends Veiculo {
    int cilindradas;
    String partida;

    public Moto(String marca, String modelo, int ano, int cilindradas, String partida) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
        this.partida = partida;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("\n=== Motocicleta Cadastrada ===");
        super.mostrarInfo();
        System.out.println("Cilindradas: " + cilindradas);
        System.out.println("Partida: " + partida);
    }
}

class Concessionaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Concessionária Veículos Rápidos ===");
        System.out.print("Você quer cadastrar um carro ou uma moto? ");
        String tipo = scanner.nextLine().toLowerCase();

        System.out.print("Marca: ");
        String marca = scanner.nextLine();

        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();

        System.out.print("Ano: ");
        int ano = scanner.nextInt();
        scanner.nextLine();

        if (tipo.equals("carro")) {
            System.out.print("Tipo de combustível: ");
            String combustivel = scanner.nextLine();

            System.out.print("Número de portas: ");
            int portas = scanner.nextInt();

            Carro carro = new Carro(marca, modelo, ano, combustivel, portas);
            carro.mostrarInfo();

        } else if (tipo.equals("moto")) {
            System.out.print("Cilindradas: ");
            int cilindradas = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Tipo de partida: ");
            String partida = scanner.nextLine();

            Moto moto = new Moto(marca, modelo, ano, cilindradas, partida);
            moto.mostrarInfo();

        } else {
            System.out.println("Tipo inválido! Digite 'carro' ou 'moto'.");
        }

        scanner.close();
    }
}
