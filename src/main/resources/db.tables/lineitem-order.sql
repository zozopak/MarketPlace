begin
    execute immediate 'drop table lineitem_order';
    dbms_output.put_line('Table lineitem_order dropped');
exception
    when others then dbms_output.put_line('Table lineitem_order did not exist');
end;
/
begin
    execute immediate 'drop sequence lineitem_order_seq';
    dbms_output.put_line('Sequence lineitem_order_seq dropped');
exception
    when others then dbms_output.put_line('Sequence lineitem_order_seq did not exist');
end;
/

create table lineitem_order
(
    lineitem_id  number(19)           not null,
    order_id     number(19)           not null,

    remarks      nvarchar2(400),
    lock_version number(19) default 1 not null,
    constraint lineitem_order_pk_id primary key (lineitem_id, order_id)


);
/
create sequence lineitem_order_seq
    minvalue 1 maxvalue 10000000000 cycle
    start with 1 increment by 1 cache 20

