// Definindo as Partes de um Carro

class Motor{
    constructor(tipo){
      this.tipo = tipo;
    }
}

class Carroceria{
    constructor(estilo){
      this.estilo = estilo;
    }
}

class Rodas{
    constructor(tamanho){
      this.tamanho = tamanho;
    }
}

class Aparencia{
    constructor(cor){
      this.cor = cor;
    }
}

// Builder

class CarroBuilder{
    constructor(){
      this.motor = null;
      this.carroceria = null;
      this.rodas = null;
      this.aparencia = null;
    }
  
    adicionarMotor(tipo){
      this.motor = new Motor(tipo);
      return this;
    }
    
    adicionarCarroceria(estilo){
      this.carroceria = new Carroceria(estilo);
      return this;
    }
    
    adicionarRodas(tamanho){
      this.rodas = new Rodas(tamanho);
      return this;
    }
    
    adicionarAparencia(cor){
      this.aparencia = new Aparencia(cor);
      return this;
    }
    
    construir(){
      return new Carro(
        this.motor, 
        this.carroceria, 
        this.rodas, 
        this.aparencia);
    }
}

// Construindo um Carro

class Carro{
    constructor(motor, carroceria, rodas, aparencia){
      this.motor = motor;
      this.carroceria = carroceria;
      this.rodas = rodas;
      this.aparencia = aparencia;
    }
  
    mostrarDetalhes(){
      console.log(`Detalhes do Carro
      Motor: ${this.motor.tipo}
      Carroceria: ${this.carroceria.estilo}
      Rodas: ${this.rodas.tamanho}
      Aparência: ${this.aparencia.cor}\n`);
    }
}

// Interface de Utilização
// Builder Para Construir um Carro

const builder = new CarroBuilder();

const carro1 = builder
    .adicionarMotor('1.4')
    .adicionarCarroceria('Sedan')
    .adicionarRodas('14')
    .adicionarAparencia('Preto')
    .construir();

const carro2 = builder
    .adicionarMotor('Eletrico')
    .adicionarCarroceria('Pick-up')
    .adicionarRodas('15')
    .adicionarAparencia('Vermelho')
    .construir();

carro1.mostrarDetalhes();
carro2.mostrarDetalhes();
