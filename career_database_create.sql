-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2022-09-21 23:07:31.452

-- tables
-- Table: TB_AVERAGE_JOB
CREATE TABLE TB_AVERAGE_JOB (
    id int  NOT NULL,
    dt_avg date  NOT NULL,
    vl_avg decimal(5,2)  NOT NULL,
    TB_JOB_id_ int  NOT NULL,
    CONSTRAINT TB_AVERAGE_JOB_pk PRIMARY KEY (id)
);

-- Table: TB_JOB
CREATE TABLE TB_JOB (
    id_ int  NOT NULL,
    job_name varchar(100)  NOT NULL,
    CONSTRAINT TB_JOB_pk PRIMARY KEY (id_)
);

-- Table: TB_QT_JOB
CREATE TABLE TB_QT_JOB (
    id int  NOT NULL,
    qt_jobs int  NOT NULL,
    dt_launch date  NOT NULL,
    TB_JOB_id_ int  NOT NULL,
    CONSTRAINT TB_QT_JOB_pk PRIMARY KEY (id)
);

-- foreign keys
-- Reference: TB_AVERAGE_JOB_TB_JOB (table: TB_AVERAGE_JOB)
ALTER TABLE TB_AVERAGE_JOB ADD CONSTRAINT TB_AVERAGE_JOB_TB_JOB
    FOREIGN KEY (TB_JOB_id_)
    REFERENCES TB_JOB (id_)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: TB_QT_JOB_TB_JOB (table: TB_QT_JOB)
ALTER TABLE TB_QT_JOB ADD CONSTRAINT TB_QT_JOB_TB_JOB
    FOREIGN KEY (TB_JOB_id_)
    REFERENCES TB_JOB (id_)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- sequences
-- Sequence: sq_avg_job
CREATE SEQUENCE sq_avg_job
      INCREMENT BY 1
      NO MINVALUE
      NO MAXVALUE
      START WITH 1
      NO CYCLE
;

-- Sequence: sq_job
CREATE SEQUENCE sq_job
      INCREMENT BY 1
      NO MINVALUE
      NO MAXVALUE
      START WITH 1
      NO CYCLE
;

-- Sequence: sq_qt_job
CREATE SEQUENCE sq_qt_job
      INCREMENT BY 1
      NO MINVALUE
      NO MAXVALUE
      START WITH 1
      NO CYCLE
;

-- End of file.

