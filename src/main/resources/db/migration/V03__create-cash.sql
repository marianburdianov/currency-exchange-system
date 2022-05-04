drop table if exists `cash`;
create table `cash`
(
    cash_id                bigint auto_increment,
    employee_id            bigint not null,
    currency_dictionary_id bigint not null,
    amount                 int    not null,
    date                   date,
    constraint cash_employee_id
        foreign key (employee_id)
            references exchange_db.employees (employee_id)
            on delete cascade,
    constraint cash_currency_dictionary_id
        foreign key (currency_dictionary_id)
            references exchange_db.currency_dictionary (currency_dictionary_id)
            on delete cascade,
    primary key (cash_id)
);

insert into cash(employee_id, currency_dictionary_id, amount, date)
values (1, 1, 1900, '2022-05-01');
insert into cash(employee_id, currency_dictionary_id, amount, date)
values (2, 1, 150, '2022-05-01');
insert into cash(employee_id, currency_dictionary_id, amount, date)
values (3, 2, 300, '2022-05-01');
insert into cash(employee_id, currency_dictionary_id, amount, date)
values (4, 3, 10000, '2022-05-01');
insert into cash(employee_id, currency_dictionary_id, amount, date)
values (5, 4, 50, '2022-05-01');