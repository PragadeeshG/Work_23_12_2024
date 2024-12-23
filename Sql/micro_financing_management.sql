create table if not exists micro_financing_management(
micro_financing_code bigint not null,
micro_loans varchar(255) null,
small_lendi_kng bigint null,
refernce_code bigint null,
key_takeaways varchar(255) null,
popular_states varchar(255) null,
entity_state varchar(255) null,
constraint micro_financing_management_pk primary key(micro_financing_code));