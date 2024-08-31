CREATE DATABASE banconaorelacional;
USE banconaorelacional;

CREATE TABLE departamento(
	numero_departamento int PRIMARY KEY,
	nome_departamento varchar(50),
	cpf_gerente varchar(11),
	data_inicio_gerente date,
	projeto json
);

INSERT INTO departamento VALUES
(5, 'Pesquisa', '33344555587', '1988-05-22', 
'[{"numero_projeto": 2, "nome_projeto": "Produto Y", "Local_Projeto": "Itu"},
{"numero_projeto": 3, "nome_projeto": "Produto Z", "Local_Projeto": "Sao Paulo"}]'
);
