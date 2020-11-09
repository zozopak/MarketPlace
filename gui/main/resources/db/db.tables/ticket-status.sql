begin
    execute immediate 'drop table ticket_status';
    dbms_output.put_line('Table ticket_status dropped');
exception
    when others then dbms_output.put_line('Table ticket_status did not exist');
end;
/
begin
    execute immediate 'drop sequence ticket_status_seq';
    dbms_output.put_line('Sequence ticket_status_seq dropped');
exception
    when others then dbms_output.put_line('Sequence ticket_status_seq did not exist');
end;
/

create table ticket_status
(
    id           number(19)           not null,

    status    nvarchar2(200)       not null,

    remarks      nvarchar2(400),
    lock_version number(19) default 1 not null,
    constraint ticket_status_pk_id primary key (id)



);
/
create sequence ticket_status_seq
    minvalue 1 maxvalue 10000000000 cycle
    start with 1 increment by 1 cache 20

