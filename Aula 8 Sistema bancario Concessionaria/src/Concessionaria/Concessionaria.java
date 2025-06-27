import java.util.Scanner;

protected class Concessionaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tipo = "";
        String marca = "";
        String modelo = "";
        int ano = 0;

        //Carro
        String combustivel = "";
        int portas = 0;

        //Moto
        int cilindradas = 0;
        String partida = "";

        System.out.println("=== Concessionária Veículos Rápidos ===");
        System.out.println("Você quer cadastrar um carro ou uma moto?");
        System.out.print("Digite 'carro' ou 'moto': ");
        tipo = scanner.nextLine();

        System.out.print("Marca: ");
        marca = scanner.nextLine();
        System.out.print("Modelo: ");
        modelo = scanner.nextLine();
        System.out.print("Ano: ");
        ano = scanner.nextInt();
        scanner.nextLine(); // limpar

        if (tipo.equalsIgnoreCase("carro")) {
            System.out.print("Tipo de combustível (Gasolina, Etanol, etc): ");
            combustivel = scanner.nextLine();
            System.out.print("Número de portas: ");
            portas = scanner.nextInt();

            // Mostrar informações do carro
            System.out.println("\n=== Carro Cadastrado ===");
            System.out.println("Marca: " + marca);
            System.out.println("Modelo: " + modelo);
            System.out.println("Ano: " + ano);
            System.out.println("Combustível: " + combustivel);
            System.out.println("Portas: " + portas);

        } else if (tipo.equalsIgnoreCase("moto")) {
            System.out.print("Cilindradas: ");
            cilindradas = scanner.nextInt();
            scanner.nextLine(); // limpar
            System.out.print("Tipo de partida (elétrica ou pedal): ");
            partida = scanner.nextLine();

            // Mostrar informações da moto
            System.out.println("\n=== Motocicleta Cadastrada ===");
            System.out.println("Marca: " + marca);
            System.out.println("Modelo: " + modelo);
            System.out.println("Ano: " + ano);
            System.out.println("Cilindradas: " + cilindradas);
            System.out.println("Partida: " + partida);

        } else {
            System.out.println("Errado zé, Carro ou Moto.");
        }

        scanner.close();
    }
}
