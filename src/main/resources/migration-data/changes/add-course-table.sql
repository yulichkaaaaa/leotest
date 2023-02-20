-- liquibase formatted sql

-- changeset yulia:add course table

CREATE TABLE IF NOT EXISTS course
(
    id smallint NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 32767 CACHE 1 ),
    name character varying(200) COLLATE pg_catalog."default" NOT NULL,
    description character varying(1000) COLLATE pg_catalog."default",
    CONSTRAINT course_pkey PRIMARY KEY (id)
)


