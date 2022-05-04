drop table if exists `currency_dictionary`;
create table `currency_dictionary`
(
    currency_dictionary_id bigint auto_increment,
    code                   varchar(8) unique,
    primary key (currency_dictionary_id)
);

insert into currency_dictionary(code)
    value('EUR');
insert into currency_dictionary(code)
    value('USD');
insert into currency_dictionary(code)
    value('RUB');
insert into currency_dictionary(code)
    value('RON');
insert into currency_dictionary(code)
    value('UAH');