"""Aula 11 - Lógica de Programação | Desafio Garagem Inteligente"""

class Carro:
    def __init__(self, marca, modelo, ano):
        # Os atributos guardam as características de cada carro.
        self.marca = marca
        self.modelo = modelo
        self.ano = ano

    def exibirInfo(self):
        # TODO 1: mostra marca, modelo e ano
        print(f"Marca: {self.marca} | Modelo: {self.modelo} | Ano: {self.ano}")


# TODO 2: dois objetos da classe Carro, com marcas, modelos e anos diferentes
carro1 = Carro("Toyota", "Corolla", 2020)
carro2 = Carro("Volkswagen", "Gol", 2024)


# TODO 3: chamando exibirInfo() nos dois objetos
carro1.exibirInfo()
carro2.exibirInfo()
