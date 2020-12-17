begin
    execute immediate 'drop table category';
    dbms_output.put_line('Table category dropped');
exception
    when others then dbms_output.put_line('Table category did not exist');
end;
/
begin
    execute immediate 'drop sequence category_seq';
    dbms_output.put_line('Sequence category_seq dropped');
exception
    when others then dbms_output.put_line('Sequence category_seq did not exist');
end;
/

create table category
(
    id           number(19)           not null,
    status       nvarchar2(200)       not null,
    remarks      nvarchar2(400),      not null,
    lock_version number(19) default 1 not null,
    constraint category_pk_id primary key (id)


);
/
create sequence category_seq
    minvalue 1 maxvalue 10000000000 cycle
    start with 1 increment by 1 cache 20

