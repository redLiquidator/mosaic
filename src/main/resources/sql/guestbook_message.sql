
--
-- sequence 생성
--
drop SEQUENCE MESSAGE_ID_SEQ;
create sequence message_id_seq START WITH 10000;

select message_id_seq.nextval from dual;

--
-- table 생성
--
drop table guestbook_message;

create table guestbook_message (
	message_id	number primary key,
	guest_name	varchar2(50 char) not null,
	password	varchar2(10 char) not null,
	message		long not null
);

select * from guestbook_message;


insert into guestbook_message
values
(message_id_seq.nextval, 'xxx', '1234', 'hello...');

