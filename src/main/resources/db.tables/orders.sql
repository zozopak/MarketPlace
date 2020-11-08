begin
    execute immediate 'drop table orders';
    dbms_output.put_line('Table orders dropped');
exception
    when others then dbms_output.put_line('Table orders did not exist');
end;
/
begin
    execute immediate 'drop sequence orders_seq';
    dbms_output.put_line('Sequence orders_seq dropped');
exception
    when others then dbms_output.put_line('Sequence order_seq did not exist');
end;
/

create table orders
(
    id              number(19)           not null,
    order_number    nvarchar2(200)       not null,
    order_date      DATE                 not null,
    order_status_id number(19)           not null,

    cart_id         number(19)           not null,
    lock_version    number(19) default 1 not null,
    constraint orders_pk_id primary key (id),
    constraint orders_un_id unique (order_number),
    constraint orders_fk_cart_id foreign key (cart_id) references cart (id)


);
/
create sequence orders_seq
    minvalue 1 maxvalue 10000000000 cycle
    start with 1 increment by 1 cache 20

