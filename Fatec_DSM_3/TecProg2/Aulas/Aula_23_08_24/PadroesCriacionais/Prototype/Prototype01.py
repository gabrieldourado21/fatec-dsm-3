from copy import copy

# Classe Pessoa - Referência que será clonada
class Pessoa:
    def __init__(self, id, nome, idade):
        self.id = id
        self.nome = nome
        self.idade = idade

    # Método Clone - Que criará uma cópia do objeto
    def clonarPessoa(self):
        return copy(self)
    
# Classe para gerenciar as instâncias da classe Pessoa
class GerenciamentoPessoa:
    def __init__(self):
        self.pessoas = {}

    # Adiciona uma nova pessoa no dicionário "pessoas"
    def adicionarPessoa(self, id, nome, idade):
        pessoa = Pessoa(id, nome, idade)
        self.pessoas[id] = pessoa 
    
    # Solicita uma pessoa pelo id e retorna uma cópia dela
    def getPessoaById(self, id):
        pessoaOriginal = self.pessoas.get(id)

        if(pessoaOriginal):
            return pessoaOriginal.clonarPessoa()
        else:
            return None

# Criando uma instãncia da classe GerenciamentoPessoa
gerenciamento = GerenciamentoPessoa()

# Adicionando pessoas
gerenciamento.adicionarPessoa(1, "João da Silva", 20)
gerenciamento.adicionarPessoa(2, "Maria da Conceição", 35)
gerenciamento.adicionarPessoa(3, "Paulo da Oliveira", 50)

# Clonando pessoas e modificando as informações
pessoaClone1 = gerenciamento.getPessoaById(1)

if(pessoaClone1):
    pessoaClone1.nome = "Ricardo de Oliveira"

# Exibindo as pessoas
print("----- Pessoa Original -----")
print(gerenciamento.getPessoaById(1).__dict__)
print(gerenciamento.getPessoaById(2).__dict__)
print(gerenciamento.getPessoaById(3).__dict__)

print("----- Clone da Pessoa -----")
print(pessoaClone1.__dict__)
