# Factory Method em Python

# Classe Veículo
class Veiculo:

# Construtor __init__

    # O "def" cria uma função
    def __init__(self, modelo):
        self.modelo = modelo # O "self" é o mesmo que "this"

    def mostrarDetalhes(self):
        print(f'Modelo: {self.modelo}')    

# Subclasses de Veículo

# A classe "Carro" está herdando o que está em "Veiculo"
class Carro(Veiculo):
    def __init__(self, modelo):
        # O "super" está chamando a classe "Veiculo"
        super().__init__(modelo)

class Moto(Veiculo):
    def __init__(self, modelo):
        super().__init__(modelo)

class Barco(Veiculo):
    def __init__(self, modelo):
        super().__init__(modelo)

# Fábrica Abstrata de Veículos
class FabricaDeVeiculos:
    def criarVeiculo(self, modelo):
        # O "raise" é uma exceção de erro
        raise NotImplementedError('O método criarVeiculo() deve ser implementado pelas subclasses')
    
# Fábrica Concreta de Carros
class FabricaDeCarros(FabricaDeVeiculos):
    def criarVeiculo(self, modelo):
        return Carro(modelo)

# Fábrica Concreta de Motos
class FabricaDeMotos(FabricaDeVeiculos):
    def criarVeiculo(self, modelo):
        return Moto(modelo)

# Fábrica Concreta de Barcos
class FabricaDeBarcos(FabricaDeVeiculos):
    def criarVeiculo(self, modelo):
        return Barco(modelo)    
    
# Uso do Factory Method

fabricaCarros = FabricaDeCarros()
carro1 = fabricaCarros.criarVeiculo('Sedan')
carro2 = fabricaCarros.criarVeiculo('Fusca 68')
carro1.mostrarDetalhes() # Saída: "Modelo: Sedan"
carro2.mostrarDetalhes() # Saída: "Modelo: Fusca 68"

fabricaMotos = FabricaDeMotos()
moto1 = fabricaMotos.criarVeiculo('Esportiva')
moto1.mostrarDetalhes() # Saída: "Modelo: Esportiva"

fabricaBarcos = FabricaDeBarcos()
barco1 = fabricaBarcos.criarVeiculo('Lancha')
barco1.mostrarDetalhes() # Saída: "Modelo: Lancha"
