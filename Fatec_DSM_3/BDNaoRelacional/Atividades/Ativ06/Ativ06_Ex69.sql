SELECT JSON_PRETTY(MAX(projeto)) 
FROM departamento
GROUP BY projeto;
