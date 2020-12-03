CREATE DATABASE dbaulachaves1;

use dbaulachaves1;

create table tb1_pessoa (
	idPessoa integer PRIMARY KEY AUTO_INCREMENT,
    nome varchar(255));
    
    CREATE TABLE tb2_carro (
    idCarro integer PRIMARY KEY AUTO_INCREMENT,
    nomeCarro varchar(255),
    marca varchar(255),
    idPessoa integer,
    CONSTRAINT fk_Pessoas FOREIGN KEY (idPessoa) REFERENCES tb1_pessoa (idPessoa));

select * from tb1_pessoa;
    
    insert into tb1_pessoa (Nome) values
		('Juliana'),
        ('Julio'),
        ('Marcio');
        
insert into tb2_carro (nomeCarro, marca, idPessoa) values
	('Gol', 'Volks', 2),
    ('Palio', 'Fiat', 3);
    
select * from tb2_carro
inner join tb1_pessoa
where tb1_pessoa.idPessoa = tb2_carro.idPessoa;
    
truncate tb2_carro;