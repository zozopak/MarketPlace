begin
    execute immediate 'drop table order_status';
    dbms_output.put_line('Table order_status dropped');
exception
    when others then dbms_output.put_line('Table order_status did not exist');
end;
/
begin
    execute immediate 'drop
        sequence order_status_seq';
    dbms_output.put_line('Sequence order_status_seq dropped');
exception
    when others then dbms_output.put_line('Sequence order_status_seq did not exist');
end;
/

create table order_status
(
    id           number(19)           not null,
    shiped       number(19)           not null,
    delivered    number(19)           not null,
    closed       number(19)           not null,
    order_id     number(19)           not null,
    lock_version number(19) default 1 not null,
    constraint order_pk_id primary key (id),
    constraint order_status_fk_order_id foreign key (order_id) references orders (id)


);
/
create sequence order_status_seq
    minvalue 1 maxvalue 10000000000 cycle
    start with 1 increment by 1 cache 20

