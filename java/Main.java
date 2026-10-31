class Carro {
    String marca;
    String modelo;
    int ano;

    // Construtor: equivale ao __init__ do Python
    Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // TODO 1: mostra marca, modelo e ano
    void exibirInfo() {
        System.out.println("Marca: " + marca + " | Modelo: " + modelo + " | Ano: " + ano);
    }
}

public class Main {
    public static void main(String[] args) {
        // TODO 2: dois objetos da classe Carro, com marcas, modelos e anos diferentes
        Carro carro1 = new Carro("Toyota", "Corolla", 2020);
        Carro carro2 = new Carro("Volkswagen", "Gol", 2024);

        // TODO 3: chamando exibirInfo() nos dois objetos
        carro1.exibirInfo();
        carro2.exibirInfo();
    }
}
