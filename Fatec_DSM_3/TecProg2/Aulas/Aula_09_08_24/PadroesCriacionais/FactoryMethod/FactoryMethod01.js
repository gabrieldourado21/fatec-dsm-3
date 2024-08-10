// Factory Method em Javascript

// Classe Veículo
class Veiculo{

    constructor(modelo){
        this.modelo = modelo;
    }

    mostrarDetalhes(){
        // Precisei usar as áspas invertidas
        console.log(`Modelo: ${this.modelo}`);
    }
}

// Subclasses de Veículo

class Carro extends Veiculo{

    constructor(modelo){
        super(modelo);
    }
}

class Moto extends Veiculo{

    constructor(modelo){
        super(modelo);
    }
}

class Barco extends Veiculo{

    constructor(modelo){
        super(modelo);
    }
}

// Fábrica Abstrata de Veículos
class FabricaDeVeiculos{

    criarVeiculo(modelo){
        throw new Error('O método criarVeiculo() deve ser implementado pelas subclasses');
    }
}

// Fábrica Concreta de Carros
class FabricaDeCarros extends FabricaDeVeiculos{

    criarVeiculo(modelo){
        return new Carro(modelo);
    }
}

// Fábrica Concreta de Motos
class FabricaDeMotos extends FabricaDeVeiculos{

    criarVeiculo(modelo){
        return new Moto(modelo);
    }
}

// Fábrica Concreta de Barcos
class FabricaDeBarcos extends FabricaDeVeiculos{

    criarVeiculo(modelo){
        return new Moto(modelo);
    }
}

// Utilização do Factory Method

const fabricaCarros = new FabricaDeCarros();
const carro1 = fabricaCarros.criarVeiculo('Sedan');
const carro2 = fabricaCarros.criarVeiculo('Fusca 68');
carro1.mostrarDetalhes(); // Saída: "Modelo: Sedan"
carro2.mostrarDetalhes(); // Saída: "Modelo: Fusca 68"

const fabricaMotos = new FabricaDeMotos();
const moto1 = fabricaMotos.criarVeiculo('Esportiva');
moto1.mostrarDetalhes(); // Saída: "Modelo: Esportiva"

const fabricaBarcos = new FabricaDeBarcos();
const barco1 = fabricaBarcos.criarVeiculo('Lancha');
barco1.mostrarDetalhes(); // Saída: "Modelo: Lancha"
