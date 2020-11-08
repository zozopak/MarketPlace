begin
    execute immediate 'drop table wallet';
    dbms_output.put_line('Table wallet dropped');
exception
    when others then dbms_output.put_line('Table wallet did not exist');
end;
/
begin
    execute immediate 'drop sequence wallet_seq';
    dbms_output.put_line('Sequence wallet_seq dropped');
exception
    when others then dbms_output.put_line('Sequence wallet_seq did not exist');
end;
/

create table wallet
(
    id           number(19)           not null,
    balance      number(19)           not null,
    store        number(19)           not null,
    customer_id  number(19)           not null,
    remarks      nvarchar2(400),
    lock_version number(19) default 1 not null,
    constraint wallet_pk_id primary key (id),

    constraint wallet_fk_wallet_id foreign key (customer_id) references customer (id)
);
/
create sequence wallet_seq
    minvalue 1 maxvalue 10000000000 cycle
    start with 1 increment by 1 cache 20

