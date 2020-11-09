begin
    execute immediate 'drop table product';
    dbms_output.put_line('Table product dropped');
exception
    when others then dbms_output.put_line('Table product did not exist');
end;
/
begin
    execute immediate 'drop sequence product_seq';
    dbms_output.put_line('Sequence product_seq dropped');
exception
    when others then dbms_output.put_line('Sequence product_seq did not exist');
end;
/

create table product
(
    id             number(19)           not null,
    product_number nvarchar2(200)       not null,
    name           nvarchar2(200)       not null,
    color          nvarchar2(200)       not null,
    photo          nvarchar2(200)       not null,
    category_id    number(19)           not null,
    lineitem_id    number(19)           not null,
    remarks        nvarchar2(400),
    lock_version   number(19) default 1 not null,
    constraint product_pk_id primary key (id),
    constraint product_fk_category_id foreign key (category_id) references category (id),
    constraint product_fk_lineitem_id foreign key (lineitem_id) references lineitem (id)
);
/
create sequence product_seq
    minvalue 1 maxvalue 10000000000 cycle
    start with 1 increment by 1 cache 20

