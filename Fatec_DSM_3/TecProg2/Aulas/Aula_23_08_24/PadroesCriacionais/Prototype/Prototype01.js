// Classe Pessoa - Referência que será clonada
class Pessoa{
    constructor(id, nome, idade){
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    // Método Clone - Que criará uma cópia do objeto
    clonarPessoa(){
        return new Pessoa(this.id, this.nome, this.idade);
    }
}

// Classe para gerenciar as instâncias da classe Pessoa
class GerenciamentoPessoa{
    constructor(){
        this.pessoas = {};
    }

    // Adiciona um objeto "pessoa" ao dicionário "pessoas"
    adicionarPessoa(id, nome, idade){
        const pessoa = new Pessoa(id, nome, idade);
        this.pessoas[id] = pessoa;
    }

    // Solicita uma pessoa pelo id e retorna uma cópia dela
    getPessoaById(id){
        const pessoaOriginal = this.pessoas[id];
        if(pessoaOriginal){
            return pessoaOriginal.clonarPessoa();
        }
        else{
            return null;
        }
    }
}

// Criando uma instância da classe GerenciamentoPessoa
const gerenciamento = new GerenciamentoPessoa();

// Adicionando pessoas
gerenciamento.adicionarPessoa(1, "João da Silva", 20);
gerenciamento.adicionarPessoa(2, "Maria da Conceição", 35);
gerenciamento.adicionarPessoa(3, "Paulo da Silveira", 50);

// Clonando pessoas e modificando as informações
const pessoaClone1 = gerenciamento.getPessoaById(1);

if(pessoaClone1){
    pessoaClone1.nome = "Ricardo de Oliveira";
}

// Exibindo as pessoas
console.log("----- Pessoa Original -----")
console.log(gerenciamento.getPessoaById(1));
console.log(gerenciamento.getPessoaById(2));
console.log(gerenciamento.getPessoaById(3));

console.log("----- Clone da Pessoa -----");
console.log(pessoaClone1);
