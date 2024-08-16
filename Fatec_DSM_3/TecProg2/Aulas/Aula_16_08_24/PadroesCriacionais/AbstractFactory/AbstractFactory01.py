# Interface da Fábrica Abstrata
class FabricaAbstrata:
    def criarProdutoA(self):
        pass

    def criarProdutoB(self):
        pass

    def criarProdutoC(self):
        pass

# Fábrica Concreta 1 - Cria Produtos dos Tipos A, B e C
class FabricaConcreta1(FabricaAbstrata):
    def criarProdutoA(self):
        return ProdutoConcretoA1()
    
    def criarProdutoB(self):
        return ProdutoConcretoB1()
    
    def criarProdutoC(self):
        return ProdutoConcretoC1()

# Fábrica Concreta 2 - Cria Produtos dos Tipos A, B e C
class FabricaConcreta2(FabricaAbstrata):
    def criarProdutoA(self):
        return ProdutoConcretoA2()
    
    def criarProdutoB(self):
        return ProdutoConcretoB2()
    
    def criarProdutoC(self):
        return ProdutoConcretoC2()

# Interface dos Produtos do Tipo A
class ProdutoAbstratoA:
    def metodoA(self):
        pass
    
# Implementação Concreta do Produto do Tipo A - Fábrica 1
class ProdutoConcretoA1(ProdutoAbstratoA):
    def metodoA(self):
        return "Produto do Tipo A da Fábrica 1"

# Implementação Concreta do Produto do Tipo A - Fábrica 2
class ProdutoConcretoA2(ProdutoAbstratoA):
    def metodoA(self):
        return "Produto do Tipo A da Fábrica 2"
 
# Interface dos Produtos do Tipo B
class ProdutoAbstratoB:
    def metodoB(self):
        pass

# Implementação Concreta do Produto do Tipo B - Fábrica 1
class ProdutoConcretoB1(ProdutoAbstratoB):
    def metodoB(self):
        return "Produto do Tipo B da Fábrica 1"

# Implementação Concreta do Produto do Tipo B - Fábrica 2
class ProdutoConcretoB2(ProdutoAbstratoB):
    def metodoB(self):
        return "Produto do Tipo B da Fábrica 2"
 
# Interface dos Produtos do Tipo C
class ProdutoAbstratoC:
    def metodoC(self):
        pass
 
# Implementação Concreta do Produto do Tipo C - Fábrica 1
class ProdutoConcretoC1(ProdutoAbstratoC):
    def metodoC(self):
        return "Produto do Tipo C da Fábrica 1"
 
# Implementação Concreta do Produto do Tipo C - Fábrica 2
class ProdutoConcretoC2(ProdutoAbstratoC):
    def metodoC(self):
        return "Produto do Tipo C da Fábrica 2"

# Função para demonstrar o padrão Abstract Factory
def codigoCliente(fabrica):
    produtoA = fabrica.criarProdutoA()
    produtoB = fabrica.criarProdutoB()
    produtoC = fabrica.criarProdutoC()

    print(produtoA.metodoA())
    print(produtoB.metodoB())
    print(produtoC.metodoC())

# Exemplo de Uso da 1ª Fábrica
fabrica1 = FabricaConcreta1()
codigoCliente(fabrica1)

# Exemplo de Uso da 2ª Fábrica
fabrica2 =  FabricaConcreta2()
codigoCliente(fabrica2)
