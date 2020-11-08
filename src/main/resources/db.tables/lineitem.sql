begin
    execute immediate 'drop table lineitem';
    dbms_output.put_line('Table lineitem dropped');
exception
    when others then dbms_output.put_line('Table lineitem did not exist');
end;
/
begin
    execute immediate 'drop sequence lineitem_seq';
    dbms_output.put_line('Sequence lineitem_seq dropped');
exception
    when others then dbms_output.put_line('Sequence lineitem_seq did not exist');
end;
/

create table lineitem
(
    id               number(19)           not null,
    ticket_status_id number(19)           not null,
    firstname        nvarchar2(200)       not null,
    lastname         nvarchar2(200)       not null,
    vendor_id        number(19)           not null,
    remarks          nvarchar2(400),
    lock_version     number(19) default 1 not null,
    constraint lineitem_pk_id primary key (id),
    constraint lineitem_fk_ticket_status_id foreign key (ticket_status_id) references ticket_status (id),
    constraint lineitem_fk_vendor_id foreign key (vendor_id) references vendor (id)

);
/
create sequence lineitem_seq
    minvalue 1 maxvalue 10000000000 cycle
    start with 1 increment by 1 cache 20

