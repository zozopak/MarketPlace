begin
    execute immediate 'drop table vendor';
    dbms_output.put_line('Table vendor dropped');
exception
    when others then dbms_output.put_line('Table vendor did not exist');
end;
/
begin
    execute immediate 'drop sequence vendor_seq';
    dbms_output.put_line('Sequence vendor_seq dropped');
exception
    when others then dbms_output.put_line('Sequence vendor_seq did not exist');
end;
/

create table vendor
(
    id            number(19)           not null,
    vendor_number number(19)           not null,
    firstname     nvarchar2(200)       not null,
    lastname      nvarchar2(200)       not null,
    phone         nvarchar2(200)       not null,
    national_id   nvarchar2(200)       not null,
    email         nvarchar2(200)       not null,

    remarks       nvarchar2(400),
    lock_version  number(19) default 1 not null,
    constraint vendor_pk_id primary key (id),
    constraint vendor_un_id unique (vendor_number),
    constraint vendor_un_national_id unique (national_id)
);
/
create sequence vendor_seq
    minvalue 1 maxvalue 10000000000 cycle
    start with 1 increment by 1 cache 20

