begin
    execute immediate 'drop table payment';
    dbms_output.put_line('Table payment dropped');
exception
    when others then dbms_output.put_line('Table payment did not exist');
end;
/
begin
    execute immediate 'drop sequence payment_seq';
    dbms_output.put_line('Sequence payment_seq dropped');
exception
    when others then dbms_output.put_line('Sequence payment_seq did not exist');
end;
/

create table payment
(
    id           number(19)           not null,
    payment_number nvarchar(200)        not null,
    order_id        number (19)         not null,
    total       nvarchar2(200)       not null,

    remarks      nvarchar2(400),
    lock_version number(19) default 1 not null,
    constraint payment_pk_id primary key (id),
    constraint payment_fk_id foreign key (order_id) references orders(id)

);
/
create sequence payment_seq
    minvalue 1 maxvalue 10000000000 cycle
    start with 1 increment by 1 cache 20

