SELECT 
nome_departamento AS departamentos, 
cpf_gerente AS cpfs_gerentes, 
JSON_EXTRACT(projeto, '$.nome_projeto') AS projetos
FROM departamento;
