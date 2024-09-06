// Implementação das Cores

// Interface das Cores
class Cor{
    constructor(cor){
        this.cor = cor;
    }
    getCor(){
        return this.cor;
    }
}

// Classes Concretas das Cores

class CorVermelho extends Cor{
    constructor(){
        super("Vermelho");
    }
}

class CorAzul extends Cor{
    constructor(){
        super("Azul");
    }
}

class CorVerde extends Cor{
    constructor(){
        super("Verde");
    }
}

// Implementação das Formas

class Forma{
    constructor(cor){
        this.cor = cor;
    }
    setCor(cor){
        this.cor = cor;
    }
    desenhar(){
        throw new Error("Este método precisa ser implementado pela subclasse")
    }
}

// Abstrações Refinadas

class Circulo extends Forma{
    desenhar(){
        console.log(`Desenhando um círculo: ${this.cor.getCor()}`);
    }
}

class Quadrado extends Forma{
    desenhar(){
        console.log(`Desenhando um quadrado: ${this.cor.getCor()}`);
    }
}

class Triangulo extends Forma{
    desenhar(){
        console.log(`Desenhando um triângulo: ${this.cor.getCor()}`);
    }
}

// Cliente

const vermelho = new CorVermelho();
const azul = new CorAzul();
const verde = new CorVerde();

const estrutura1 = new Circulo(vermelho);
const estrutura2 = new Circulo(verde);
const estrutura3 = new Circulo(azul);
const estrutura4 = new Circulo(vermelho);
const estrutura5 = new Quadrado(verde);
const estrutura6 = new Triangulo(azul);

estrutura1.desenhar();
estrutura2.desenhar();
estrutura3.desenhar();
estrutura4.desenhar();
estrutura5.desenhar();
estrutura6.desenhar();
