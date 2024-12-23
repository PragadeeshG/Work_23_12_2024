create table if not exists micro_finance(
id bigint not null,
individual_income_type varchar(255) null,
access_to_finance_services varchar(255) null,
conventional_lenders varchar(255) null,
unbanked varchar(255) null,
ethical_lending varchar(255) null,
financing_ops varchar(255) null,
number_of_accounts Integer null,
entity_state varchar(255) null,
constraint micro_finance_pk primary key(id));