create table if not exists micro_finance_steps(
step_id bigint not null,
finance_code bigint null,
basic_steps varchar(255) null,
curent_step varchar(255) null,
step_completed varchar(255) null,
next_action varchar(255) null,
next_action_group varchar(255) null,
entity_state varchar(255) null,
constraint micro_finance_steps_pk primary key(step_id));