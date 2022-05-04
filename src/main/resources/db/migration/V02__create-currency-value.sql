drop table if exists `currency_value`;
create table `currency_value`
(
    currency_value_id      bigint auto_increment,
    currency_dictionary_id bigint not null,
    rate                   int    not null,
    value                  double not null,
    date                   date,
    constraint currency_value_currency_dictionary_id
        foreign key (currency_dictionary_id)
            references exchange_db.currency_dictionary (currency_dictionary_id)
            on delete cascade,
    constraint unique (currency_dictionary_id, date),
    primary key (currency_value_id)
);

insert into currency_value(currency_dictionary_id, rate, value, date)
values (1, 1, 19.66, '2022-05-01');
insert into currency_value(currency_dictionary_id, rate, value, date)
values (2, 1, 18.61, '2022-05-01');
insert into currency_value(currency_dictionary_id, rate, value, date)
values (3, 1, 0.26, '2022-05-01');
insert into currency_value(currency_dictionary_id, rate, value, date)
values (4, 1, 3.97, '2022-05-01');
insert into currency_value(currency_dictionary_id, rate, value, date)
values (5, 1, 0.61, '2022-05-01');