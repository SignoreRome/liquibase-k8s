--liquibase formatted sql

--changeset rocketsciense:1
insert into t_liqui(info, time) VALUES ('1-sql type', localtimestamp)