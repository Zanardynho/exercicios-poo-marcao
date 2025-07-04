import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//abstrata
abstract class Veiculo {
    String modelo;
    double consumoMedio;

    Veiculo(String modelo, double consumoMedio) {
        this.modelo = modelo;
        this.consumoMedio = consumoMedio;
    }
    abstract double calcularConsumo(double distancia);
}

class Carro extends Veiculo {
    Carro(String modelo, double consumoMedio) {
        super(modelo, consumoMedio);
    }

    double calcularConsumo(double distancia) {
        return distancia / consumoMedio;
    }
}

class Moto extends Veiculo {
    Moto(String modelo, double consumoMedio) {
        super(modelo, consumoMedio);
    }

    double calcularConsumo(double distancia) {
        return distancia / consumoMedio;
    }
}

class Caminhao extends Veiculo {
    Caminhao(String modelo, double consumoMedio) {
        super(modelo, consumoMedio);
    }

    double calcularConsumo(double distancia) {
        return distancia / consumoMedio;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Veiculo> veiculos = new ArrayList<>();

        System.out.println("Quantos veículos?");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Carro, Moto ou Caminhao?");
            String tipo = sc.nextLine();

            System.out.println("Modelo:");
            String modelo = sc.nextLine();

            System.out.println("Consumo médio km/l:");
            double consumo = sc.nextDouble();
            sc.nextLine();

            if (tipo.equalsIgnoreCase("Carro")) {
                veiculos.add(new Carro(modelo, consumo));
            } else if (tipo.equalsIgnoreCase("Moto")) {
                veiculos.add(new Moto(modelo, consumo));
            } else if (tipo.equalsIgnoreCase("Caminhao")) {
                veiculos.add(new Caminhao(modelo, consumo));
            }
        }

        System.out.println("Quantos km?");
        double distancia = sc.nextDouble();

        for (Veiculo v : veiculos) {
            double consumo = v.calcularConsumo(distancia);
            System.out.println(v.modelo + " vai consumir " + consumo + " litros para " + distancia + " km.");
        }
        sc.close();
    }
}
