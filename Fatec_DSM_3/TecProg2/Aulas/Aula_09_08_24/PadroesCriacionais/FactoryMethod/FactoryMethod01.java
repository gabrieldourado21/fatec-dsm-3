// Factory Method em Java

// Classe Veículo
class Veiculo{

    private String modelo;

    public Veiculo(String modelo){
        this.modelo = modelo;
    }

    public void mostrarDetalhes(){
        System.out.println("Modelo: " + this.modelo);
    }
}

// Subclasses de Veículo

class Carro extends Veiculo{

    public Carro(String modelo){
        super(modelo);
    }
}

class Moto extends Veiculo{

    public Moto(String modelo){
        super(modelo);
    }
}

class Barco extends Veiculo{

    public Barco(String modelo){
        super(modelo);
    }
}

// Fábrica Abstrata de Veículos
abstract class FabricaDeVeiculos{

    public abstract Veiculo criarVeiculo(String modelo);
}

// Fábrica Concreta de Carros
class FabricaDeCarros extends FabricaDeVeiculos{

    public Veiculo criarVeiculo(String modelo){
        return new Carro(modelo);
    }
}

// Fábrica Concreta de Motos
class FabricaDeMotos extends FabricaDeVeiculos{

    public Veiculo criarVeiculo(String modelo){
        return new Moto(modelo);
    }
}

// Fábrica Concreta de Barcos
class FabricaDeBarcos extends FabricaDeVeiculos{

    public Veiculo criarVeiculo(String modelo){
        return new Barco(modelo);
    }
}

// Utilização do Factory Method

public class FactoryMethod01{

    public static void main(String[] args) {
        
        FabricaDeVeiculos fabricaCarros = new FabricaDeCarros();
        Veiculo carro1 = fabricaCarros.criarVeiculo("Sedan");
        Veiculo carro2 = fabricaCarros.criarVeiculo("Fusca 68");
        carro1.mostrarDetalhes(); // Saída: "Modelo: Sedan"
        carro2.mostrarDetalhes(); // Saída: "Modelo: Fusca 68"

        FabricaDeVeiculos fabricaMotos = new FabricaDeMotos();
        Veiculo moto1 = fabricaMotos.criarVeiculo("Esportiva");
        moto1.mostrarDetalhes(); // Saída: "Modelo: Esportiva"

        FabricaDeBarcos fabricaBarcos = new FabricaDeBarcos();
        Veiculo barco1 = fabricaBarcos.criarVeiculo("Lancha");
        barco1.mostrarDetalhes(); // Saída: "Modelo: Lancha"
    }
}
