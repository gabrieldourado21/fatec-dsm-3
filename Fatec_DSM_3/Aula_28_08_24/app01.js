// Importação dos modulos necessarios:
const http = require('http');
const url  = require('url');
const fs   = require('fs');

// Criar o Server:
const server = http.createServer((req, res) =>{

    // Implementação de libs necessarias para trabalhar com URL/URI:
    const reqUrl = url.parse(req.url, true);
    const path   = reqUrl.pathname;

    // Criação dos EndPoints (Rotas):
    if(path == "/"){
        // Caso o endpoint for "/" - executa esse bloco:
        fs.readFile('index.html', 'utf-8', (err, data) => {
            if(err){
                res.writeHead(500, {'Content-Type':'text/plain; charset=utf-8'});
                res.end("500 - Erro interno do servidor ... ");
            }else{
                res.writeHead(200, {'Content-Type':'text/html; charset=utf-8'});
                res.end(data);
            }
        });
    }else if(path == "/pdf"){
        // Caso o endpoint for "/rota1" - executa esse bloco: 
        fs.readFile('./arquivos/arquivo.pdf', (err, data) => {
            if(err){
                res.writeHead(500, {'Content-Type':'text/plain; charset=utf-8'});
                res.end("500 - Erro interno do servidor ... ");
            }else{
                res.writeHead(200, {'Content-Type':'application/pdf'});
                res.end(data);
            }
        });

    } else if (path == "/rota2"){
        // Caso o endpoint for "/rota2" - executa esse bloco:
        res.writeHead(200, {'Content-Type':'text/plain; charset=utf-8'});
        res.end("Rota 2 acessada com sucesso ... ");
    } else {
        // "Status Code 404"
        res.writeHead(200, {'Content-Type':'text/plain; charset=utf-8'});
        res.end("404 - Rota não encontrada ... ");
    }
});

// Configuração do Server:
// Atribui a porta como 3000 do servidor:
const PORT = 3000;

// Inicia o listen e envia uma msg ao usuario no terminal:
server.listen(PORT, () => {
    console.log(`[OK] Servidor 'localhost' iniciado na porta: ${PORT} ...`);
});
