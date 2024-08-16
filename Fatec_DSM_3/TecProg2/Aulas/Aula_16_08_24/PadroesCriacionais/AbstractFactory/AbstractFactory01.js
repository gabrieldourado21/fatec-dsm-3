// Interface da Fábrica Abstrata
class FabricaAbstrata{
    criarProdutoA(){}
    criarProdutoB(){}
    criarProdutoC(){}
}

// Fábrica Concreta 1 - Cria Produtos dos Tipos A, B e C
class FabricaConcreta1 extends FabricaAbstrata{
    criarProdutoA(){
        return new ProdutoConcretoA1();
    }

    criarProdutoB(){
        return new ProdutoConcretoB1();
    }

    criarProdutoC(){
        return new ProdutoConcretoC1();
    } 
}

// Fábrica Concreta 2 - Cria Produtos dos Tipos A, B e C
class FabricaConcreta2 extends FabricaAbstrata{
    criarProdutoA(){
        return new ProdutoConcretoA2();
    }

    criarProdutoB(){
        return new ProdutoConcretoB2();
    }

    criarProdutoC(){
        return new ProdutoConcretoC2();
    } 
}

// Interface dos Produtos do Tipo A
class ProdutoAbstratoA{
    metodoA(){}
}

// Implementação Concreta do Produto do Tipo A - Fábrica 1
class ProdutoConcretoA1 extends ProdutoAbstratoA{
    metodoA(){
        return "Produto do Tipo A da Fábrica 1";
    }
}
 
// Implementação Concreta do Produto do Tipo A - Fábrica 2
class ProdutoConcretoA2 extends ProdutoAbstratoA{
    metodoA(){
        return "Produto do Tipo A da Fábrica 2";
    }
}
 
// Interface dos Produtos do Tipo B
class ProdutoAbstratoB{
    metodoB(){}
}

// Implementação Concreta do Produto do Tipo B - Fábrica 1
class ProdutoConcretoB1 extends ProdutoAbstratoB{
    metodoB(){
        return "Produto do Tipo B da Fábrica 1";
    }
}
 
// Implementação Concreta do Produto do Tipo B - Fábrica 2
class ProdutoConcretoB2 extends ProdutoAbstratoB{
    metodoB(){
        return "Produto do Tipo B da Fábrica 2";
    }
}

// Interface dos Produtos do Tipo C
class ProdutoAbstratoC{
    metodoC(){}
}
 
// Implementação Concreta do Produto do Tipo C - Fábrica 1
class ProdutoConcretoC1 extends ProdutoAbstratoC{
    metodoC(){
        return "Produto do Tipo C da Fábrica 1";
    }
}
 
// Implementacao Concreta do Produto do Tipo C - Fábrica 2
class ProdutoConcretoC2 extends ProdutoAbstratoC{
    metodoC(){
        return "Produto do Tipo C da Fábrica 2";
    }
}

// Função para demonstrar o padrão Abstract Factory
function codigoCliente(fabrica){
    const produtoA = fabrica.criarProdutoA();
    const produtoB = fabrica.criarProdutoB();
    const produtoC = fabrica.criarProdutoC();

    console.log(produtoA.metodoA());
    console.log(produtoB.metodoB());
    console.log(produtoC.metodoC());
}

// Exemplo de Uso da 1ª Fábrica
const fabrica1 = new FabricaConcreta1();
codigoCliente(fabrica1);

// Exemplo de Uso da 2ª Fábrica
const fabrica2 = new FabricaConcreta2();
codigoCliente(fabrica2);
