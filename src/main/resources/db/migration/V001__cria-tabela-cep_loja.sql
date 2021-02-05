create table CEP_LOJA(
    ID bigint not null auto_increment,
    CODIGO_LOJA varchar(100) not null,
    FAIXA_INICIO bigint not null,
    FAIXA_FIM bigint not null,
    primary key(ID)
);