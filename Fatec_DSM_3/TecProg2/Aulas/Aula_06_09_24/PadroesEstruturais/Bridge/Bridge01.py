# Importação
from abc import ABC, abstractmethod
 
# Implementação das Cores

# Interface das Cores
class Cor(ABC):
    @abstractmethod
    def getCor(self):
        pass

# Implementação das Cores
class CorVermelho(Cor):
    def getCor(self):
        return "Vermelho"

class CorAzul(Cor):
    def getCor(self):
        return "Azul"

class CorVerde(Cor):
    def getCor(self):
        return "Verde"

# Implementação das Formas
class Forma(ABC):
    def __init__(self, cor):
        self.cor = cor

    @abstractmethod
    def desenhar(self):
        pass

# Abstrações Refinadas
class Circulo(Forma):
    def desenhar(self):
        print(f'Desenhando um círculo: {self.cor.getCor()}')

class Quadrado(Forma):
    def desenhar(self):
        print(f'Desenhando um quadrado: {self.cor.getCor()}')
    
class Triangulo(Forma):
    def desenhar(self):
        print(f'Desenhando um triângulo: {self.cor.getCor()}')

# Cliente
vermelho = CorVermelho()
azul = CorAzul()
verde = CorVerde()

estrutura1 = Circulo(vermelho)
estrutura2 = Circulo(verde)
estrutura3 = Circulo(azul)
estrutura4 = Circulo(vermelho)
estrutura5 = Quadrado(verde)
estrutura6 = Triangulo(azul)

estrutura1.desenhar()
estrutura2.desenhar()
estrutura3.desenhar()
estrutura4.desenhar()
estrutura5.desenhar()
estrutura6.desenhar()
