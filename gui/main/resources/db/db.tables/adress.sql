begin
    execute immediate 'drop table adress';
    dbms_output.put_line('Table adress dropped');
exception
    when others then dbms_output.put_line('Table adress did not exist');
end;
/
begin
    execute immediate 'drop sequence adress_seq';
    dbms_output.put_line('Sequence adress_seq dropped');
exception
    when others then dbms_output.put_line('Sequence adress_seq did not exist');
end;
/

create table adress
(
   id        number(19)    not null ,
   province  nvarchar2(200) not null ,
   city      nvarchar2(200) not null ,
   street     nvarchar2(200) not null ,
   floor   nvarchar2(200) not null ,
   unit   nvarchar2(200) not null ,
   customer_id  number(19)   not null ,
   vendor_id  number(19)   not null ,

    remarks       nvarchar2(400),
    lock_version  number(19) default 1 not null,
    constraint adress_pk_id primary key (id),
    constraint adress_fk_customer_id foreign key (customer_id) references customer(id),
    constraint adress_fk_vendor_id foreign key (vendor_id) references vendor(id)


);
/
create sequence adress_seq
    minvalue 1 maxvalue 10000000000 cycle
    start with 1 increment by 1 cache 20

