begin
    execute immediate 'drop table customer';
    dbms_output.put_line('Table customer dropped');
exception
    when others then dbms_output.put_line('Table customer did not exist');
end;
/
begin
    execute immediate 'drop sequence customer_seq';
    dbms_output.put_line('Sequence customer_seq dropped');
exception
    when others then dbms_output.put_line('Sequence customer_seq did not exist');
end;
/

create table customer
(
    id        number(19)    not null ,
    customer_number nvarchar2(200) not null ,
    firstname    nvarchar2(200) not null ,
   lastname    nvarchar2(200) not null ,
   phone  nvarchar2(200) not null ,
   national_id  nvarchar2(200) not null ,
   email    nvarchar2(200)     not null.
    wallet_id  number(19)   not null ,


    remarks       nvarchar2(400),
    lock_version  number(19) default 1 not null,
    constraint customer_pk_id primary key (id),
    constraint customer_un_national_id unique   (national_id),
    constraint customer_fk_wallet_id foreign key (wallet_id) references wallet(id),



);
/
create sequence customer_seq
    minvalue 1 maxvalue 10000000000 cycle
    start with 1 increment by 1 cache 20

