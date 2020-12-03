create table funcionarios (

	id int not null auto_increment primary key,
    nome varchar(30) not null,
    nascimento date,
    sexo enum ('M', 'F'),
    peso decimal (5,2),
    altura decimal (3,2),
    dia_cadastro datetime default current_timestamp,
    nacionalidade varchar(20) default 'Brasil'
    );    
    
    ## comandosddl create drop alter remane
    
    describe funcionarios;
    
    alter table funcionarios modify column nome varchar(255);
    alter table funcionarios add column historico char(50);