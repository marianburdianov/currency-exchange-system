drop table if exists `employees`;
create table `employees`
(
    employee_id bigint auto_increment,
    first_name  varchar(30) null,
    last_name   varchar(30) null,
    gender      varchar(10) null,
    birth_date  date        null,
    hire_date   date        null,
    role        varchar(20) null,
    primary key (employee_id)
);

insert into employees(first_name, last_name, gender, birth_date, hire_date, role)
values ('Virat', 'Adams', 'male', '1980-12-06', '2015-10-10', 'operator_1');
insert into employees(first_name, last_name, gender, birth_date, hire_date, role)
values ('Steve', 'Baker', 'male', '1985-02-25', '2011-12-22', 'operator_2');
insert into employees(first_name, last_name, gender, birth_date, hire_date, role)
values ('Mitchel', 'Davis', 'male', '1988-01-16', '2019-05-12', 'operator_3');
insert into employees(first_name, last_name, gender, birth_date, hire_date, role)
values ('Kevin', 'Frank', 'male', '1979-10-29', '2012-01-23', 'operator_4');
insert into employees(first_name, last_name, gender, birth_date, hire_date, role)
values ('Ricky', 'Valdo', 'male', '1981-07-31', '2017-03-08', 'operator_5');