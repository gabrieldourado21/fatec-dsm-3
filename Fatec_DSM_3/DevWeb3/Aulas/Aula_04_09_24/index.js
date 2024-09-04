// Importação:
const express = require('express');
const fs = require('fs');
const path = require('path');

// Importação da configuração (variables.env):
require('dotenv').config({path:'variables.env'})

// Cria a rota:
const router = express();

// Cria a rota "/": 
router.get('/', (req, res) => {
    fs.readFile(path.join(__dirname, 'index.html'), (err, data) => {
        if(err){
            res.status(500).send("500 - Erro Interno do Servidor");
        }else{
            res.status(200).type('text/html').send(data);
        }
    });
});

// Cria a rota '/rota1':
router.get('/rota1',(req, res) => {         // Recebe sempre em String (padrão)
    let nome1 = req.query.nome;             // Recebe direto como String
    let nome2 = process.env.AUTOR;          // Recebe o nome pelo Autor (env)
    let num1 = parseFloat(req.query.num1);  // Converte String para Floar
    let num2 = parseFloat(req.query.num2);  // Converte String para Float
    let soma = num1 + num2;                 // Conteudo Numerico  
    let resultado = soma.toString();        // Converte para String (soma)

    res.send(nome1 + " - " + nome2 + " SOMA: " + num1 + " + " + num2 + " = " + resultado);

    // TESTE: http://localhost:PORTA/rota1?num1=10&num2=8
});

// Cria a rota '/rota2':
router.get('/rota2',(req, res) => {
    res.send("Rota 2 ... ");
});

// Exportação
module.exports = router;