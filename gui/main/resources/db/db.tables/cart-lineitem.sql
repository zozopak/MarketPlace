begin
    execute immediate 'drop table cart_lineitem';
    dbms_output.put_line('Table cart_lineitem dropped');
exception
    when others then dbms_output.put_line('Table cart_lineitem did not exist');
end;
/
begin
    execute immediate 'drop sequence cart_lineitem_seq';
    dbms_output.put_line('Sequence cart_lineitem_seq dropped');
exception
    when others then dbms_output.put_line('Sequence cart_lineitem_seq did not exist');
end;
/

create table cart_lineitem
(
    cart_id      number(19)           not null,
    lineitem_id  number(19)           not null,

    remarks      nvarchar2(400),
    lock_version number(19) default 1 not null,
    constraint cart_lineitem_pk_id primary key (cart_id, lineitem_id)


);
/
create sequence cart_lineitem_seq
    minvalue 1 maxvalue 10000000000 cycle
    start with 1 increment by 1 cache 20

