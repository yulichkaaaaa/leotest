-- liquibase formatted sql

-- changeset yulia:add course and test tables

CREATE TABLE IF NOT EXISTS public.test
(
    id bigint NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1 ),
    course_id smallint NOT NULL,
    author_id smallint NOT NULL,
    name character varying(100) COLLATE pg_catalog."default",
    description character varying(1000) COLLATE pg_catalog."default",
    CONSTRAINT test_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.test
    OWNER to postgres;

CREATE TABLE IF NOT EXISTS course
(
    id smallint NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 32767 CACHE 1 ),
    name character varying(200) COLLATE pg_catalog."default" NOT NULL,
    description character varying(1000) COLLATE pg_catalog."default",
    CONSTRAINT course_pkey PRIMARY KEY (id)
)



