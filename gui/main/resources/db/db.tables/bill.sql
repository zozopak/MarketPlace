begin
    execute immediate 'drop table bill';
    dbms_output.put_line('Table bill dropped');
exception
    when others then dbms_output.put_line('Table bill did not exist');
end;
/
begin
    execute immediate 'drop sequence bill_seq';
    dbms_output.put_line('Sequence bill_seq dropped');
exception
    when others then dbms_output.put_line('Sequence bill_seq did not exist');
end;
/

create table bill
(
    id           number(19)           not null,
   bill_number   nvarchar2(200)       not null,
   order_id      number(19)           not null,
   payment_id    number(19)           not null,
   total         nvarchar(200)        not null,
   remarks      nvarchar2(400)        not null,
    lock_version number(19) default 1 not null,
    constraint bill_pk_id primary key (id)
    constraint bill_fk_order_id foreign key (order_id) references order(id),
    constraint bill_fk_payment_id foreign key (payment_id) references payment(id)


);
/
create sequence category_seq
    minvalue 1 maxvalue 10000000000 cycle
    start with 1 increment by 1 cache 20

