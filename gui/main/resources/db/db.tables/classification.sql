begin
    execute immediate 'drop table classification';
    dbms_output.put_line('Table classification dropped');
exception
    when others then dbms_output.put_line('Table classification did not exist');
end;
/
begin
    execute immediate 'drop sequence classification_seq';
    dbms_output.put_line('Sequence classification_seq dropped');
exception
    when others then dbms_output.put_line('Sequence classification_seq did not exist');
end;
/

create table classification
(
    id           number(19)           not null,
    category_id  number(19)           not null,
    status       nvarchar2(200)       not null,

    remarks      nvarchar2(400),
    lock_version number(19) default 1 not null,
    constraint classification_pk_id primary key (id)
    constraint classification_fk_id foreign key (category_id)references category(id)

);
/
create sequence classification_seq
    minvalue 1 maxvalue 10000000000 cycle
    start with 1 increment by 1 cache 20

