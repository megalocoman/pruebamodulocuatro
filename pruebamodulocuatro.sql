--------------------------------------------------------
--  File created - Wednesday-July-01-2020   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table ACCIDENTE
--------------------------------------------------------

  CREATE TABLE "SYSTEM"."ACCIDENTE" 
   (	"IDACCIDENTE" NUMBER(*,0), 
	"DESCRIPCION" VARCHAR2(3000 CHAR), 
	"FECHAACCIDENTE" DATE, 
	"CLIENTERUTCLIENTE" VARCHAR2(20 BYTE)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table ACTIVIDADES
--------------------------------------------------------

  CREATE TABLE "SYSTEM"."ACTIVIDADES" 
   (	"CODIGOACTIVIDAD" NUMBER(*,0), 
	"NOMBRE" VARCHAR2(30 CHAR), 
	"DESCRIPCION" VARCHAR2(600 CHAR)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table CLIENTE
--------------------------------------------------------

  CREATE TABLE "SYSTEM"."CLIENTE" 
   (	"RUTCLIENTE" VARCHAR2(20 BYTE), 
	"DIRECCION" VARCHAR2(150 CHAR), 
	"TELEFONO" VARCHAR2(20 BYTE), 
	"CORREO" VARCHAR2(100 CHAR), 
	"CONTACTO" VARCHAR2(100 CHAR), 
	"NOMBRECLIENTE" VARCHAR2(60 BYTE)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table IT
--------------------------------------------------------

  CREATE TABLE "SYSTEM"."IT" 
   (	"NUMEROIT" NUMBER(*,0), 
	"TAREA_REALIZADA" VARCHAR2(100 CHAR), 
	"FECHA_TAREA" DATE, 
	"OT_NUMEROOT" NUMBER(*,0)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table OT
--------------------------------------------------------

  CREATE TABLE "SYSTEM"."OT" 
   (	"NUMEROOT" NUMBER(*,0), 
	"FECHA_ACTIVIDAD" DATE, 
	"VALOR" NUMBER(*,0), 
	"PAGO" NUMBER(*,0), 
	"STATUSACTIVIDAD" VARCHAR2(50 CHAR), 
	"CLIENTE_RUT_CLIENTE" VARCHAR2(20 BYTE), 
	"PROFESIONAL_RUT_PROFESIONAL" VARCHAR2(20 BYTE), 
	"ACTIVIDADES_CODIGO_ACTIVIDAD" NUMBER(*,0)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table PROFESIONAL
--------------------------------------------------------

  CREATE TABLE "SYSTEM"."PROFESIONAL" 
   (	"RUTPROFESIONAL" VARCHAR2(20 BYTE), 
	"NOMBRE" VARCHAR2(150 CHAR), 
	"TELEFONO" VARCHAR2(20 BYTE), 
	"CORREO" VARCHAR2(100 CHAR)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
REM INSERTING into SYSTEM.ACCIDENTE
SET DEFINE OFF;
Insert into SYSTEM.ACCIDENTE (IDACCIDENTE,DESCRIPCION,FECHAACCIDENTE,CLIENTERUTCLIENTE) values (1,'explosion quimica',to_date('12-12-12','RR-MM-DD'),'1');
Insert into SYSTEM.ACCIDENTE (IDACCIDENTE,DESCRIPCION,FECHAACCIDENTE,CLIENTERUTCLIENTE) values (3,'choque de camiones',to_date('21-12-21','RR-MM-DD'),'2');
Insert into SYSTEM.ACCIDENTE (IDACCIDENTE,DESCRIPCION,FECHAACCIDENTE,CLIENTERUTCLIENTE) values (2,'caida de techo',to_date('31-09-18','RR-MM-DD'),'1');
Insert into SYSTEM.ACCIDENTE (IDACCIDENTE,DESCRIPCION,FECHAACCIDENTE,CLIENTERUTCLIENTE) values (33,'caida en acido',to_date('23-07-20','RR-MM-DD'),'3');
Insert into SYSTEM.ACCIDENTE (IDACCIDENTE,DESCRIPCION,FECHAACCIDENTE,CLIENTERUTCLIENTE) values (34,'tendinitis',to_date('12-12-12','RR-MM-DD'),'1');
Insert into SYSTEM.ACCIDENTE (IDACCIDENTE,DESCRIPCION,FECHAACCIDENTE,CLIENTERUTCLIENTE) values (35,'aplastamiento',to_date('12-12-12','RR-MM-DD'),'3');
Insert into SYSTEM.ACCIDENTE (IDACCIDENTE,DESCRIPCION,FECHAACCIDENTE,CLIENTERUTCLIENTE) values (36,'explosion de gas',to_date('01-01-20','RR-MM-DD'),'2');
Insert into SYSTEM.ACCIDENTE (IDACCIDENTE,DESCRIPCION,FECHAACCIDENTE,CLIENTERUTCLIENTE) values (37,'exahustamiento',to_date('21-12-21','RR-MM-DD'),'1');
Insert into SYSTEM.ACCIDENTE (IDACCIDENTE,DESCRIPCION,FECHAACCIDENTE,CLIENTERUTCLIENTE) values (38,'envenenamiento con cianuro',to_date('30-10-19','RR-MM-DD'),'1');
REM INSERTING into SYSTEM.ACTIVIDADES
SET DEFINE OFF;
Insert into SYSTEM.ACTIVIDADES (CODIGOACTIVIDAD,NOMBRE,DESCRIPCION) values (1,'capacitacion','capacitacion de segurada para problemas concretos');
Insert into SYSTEM.ACTIVIDADES (CODIGOACTIVIDAD,NOMBRE,DESCRIPCION) values (2,'curso','capacitacion larga para solucuonar problematica');
Insert into SYSTEM.ACTIVIDADES (CODIGOACTIVIDAD,NOMBRE,DESCRIPCION) values (3,'asesoria','identificacion problema y solucion');
Insert into SYSTEM.ACTIVIDADES (CODIGOACTIVIDAD,NOMBRE,DESCRIPCION) values (4,'certificado','asegura cetificacion');
Insert into SYSTEM.ACTIVIDADES (CODIGOACTIVIDAD,NOMBRE,DESCRIPCION) values (5,'visita','visita en terreno para revisar condiciones');
REM INSERTING into SYSTEM.CLIENTE
SET DEFINE OFF;
Insert into SYSTEM.CLIENTE (RUTCLIENTE,DIRECCION,TELEFONO,CORREO,CONTACTO,NOMBRECLIENTE) values ('4','freire 968','45463214','bayer@bayer.com','ernesto mate','bayer');
Insert into SYSTEM.CLIENTE (RUTCLIENTE,DIRECCION,TELEFONO,CORREO,CONTACTO,NOMBRECLIENTE) values ('2','calle los olmos','3211456','mail@mail.com','estabn dido','nestle');
Insert into SYSTEM.CLIENTE (RUTCLIENTE,DIRECCION,TELEFONO,CORREO,CONTACTO,NOMBRECLIENTE) values ('3','avenida principal 01','85236974','email@email.com','elsa polindo','amazon');
REM INSERTING into SYSTEM.IT
SET DEFINE OFF;
REM INSERTING into SYSTEM.OT
SET DEFINE OFF;
Insert into SYSTEM.OT (NUMEROOT,FECHA_ACTIVIDAD,VALOR,PAGO,STATUSACTIVIDAD,CLIENTE_RUT_CLIENTE,PROFESIONAL_RUT_PROFESIONAL,ACTIVIDADES_CODIGO_ACTIVIDAD) values (1,to_date('12-12-18','RR-MM-DD'),1000000,500000,'completo','1','1',1);
Insert into SYSTEM.OT (NUMEROOT,FECHA_ACTIVIDAD,VALOR,PAGO,STATUSACTIVIDAD,CLIENTE_RUT_CLIENTE,PROFESIONAL_RUT_PROFESIONAL,ACTIVIDADES_CODIGO_ACTIVIDAD) values (2,to_date('13-11-18','RR-MM-DD'),500000,0,'completo','1','1',5);
Insert into SYSTEM.OT (NUMEROOT,FECHA_ACTIVIDAD,VALOR,PAGO,STATUSACTIVIDAD,CLIENTE_RUT_CLIENTE,PROFESIONAL_RUT_PROFESIONAL,ACTIVIDADES_CODIGO_ACTIVIDAD) values (3,to_date('15-04-19','RR-MM-DD'),1500000,1500000,'en proceso','1','3',4);
Insert into SYSTEM.OT (NUMEROOT,FECHA_ACTIVIDAD,VALOR,PAGO,STATUSACTIVIDAD,CLIENTE_RUT_CLIENTE,PROFESIONAL_RUT_PROFESIONAL,ACTIVIDADES_CODIGO_ACTIVIDAD) values (4,to_date('21-10-20','RR-MM-DD'),2500000,2400000,'completo','2','2',3);
Insert into SYSTEM.OT (NUMEROOT,FECHA_ACTIVIDAD,VALOR,PAGO,STATUSACTIVIDAD,CLIENTE_RUT_CLIENTE,PROFESIONAL_RUT_PROFESIONAL,ACTIVIDADES_CODIGO_ACTIVIDAD) values (5,to_date('14-12-19','RR-MM-DD'),600000,400000,'completo','2','1',2);
Insert into SYSTEM.OT (NUMEROOT,FECHA_ACTIVIDAD,VALOR,PAGO,STATUSACTIVIDAD,CLIENTE_RUT_CLIENTE,PROFESIONAL_RUT_PROFESIONAL,ACTIVIDADES_CODIGO_ACTIVIDAD) values (6,to_date('01-01-15','RR-MM-DD'),3500000,3000000,'completo','2','2',1);
Insert into SYSTEM.OT (NUMEROOT,FECHA_ACTIVIDAD,VALOR,PAGO,STATUSACTIVIDAD,CLIENTE_RUT_CLIENTE,PROFESIONAL_RUT_PROFESIONAL,ACTIVIDADES_CODIGO_ACTIVIDAD) values (7,to_date('12-03-20','RR-MM-DD'),4000000,3500000,'en proceso','3','3',5);
Insert into SYSTEM.OT (NUMEROOT,FECHA_ACTIVIDAD,VALOR,PAGO,STATUSACTIVIDAD,CLIENTE_RUT_CLIENTE,PROFESIONAL_RUT_PROFESIONAL,ACTIVIDADES_CODIGO_ACTIVIDAD) values (8,to_date('01-04-20','RR-MM-DD'),150000,150000,'completo','3','1',4);
Insert into SYSTEM.OT (NUMEROOT,FECHA_ACTIVIDAD,VALOR,PAGO,STATUSACTIVIDAD,CLIENTE_RUT_CLIENTE,PROFESIONAL_RUT_PROFESIONAL,ACTIVIDADES_CODIGO_ACTIVIDAD) values (9,to_date('02-02-19','RR-MM-DD'),3000000,3000000,'completo','3','2',2);
REM INSERTING into SYSTEM.PROFESIONAL
SET DEFINE OFF;
Insert into SYSTEM.PROFESIONAL (RUTPROFESIONAL,NOMBRE,TELEFONO,CORREO) values ('1','alan brito','1547844','mail.@uwu.cl');
Insert into SYSTEM.PROFESIONAL (RUTPROFESIONAL,NOMBRE,TELEFONO,CORREO) values ('2','elver galarga','123587','correo@correo.cl');
Insert into SYSTEM.PROFESIONAL (RUTPROFESIONAL,NOMBRE,TELEFONO,CORREO) values ('3','soila cerda','325415','uwu@uwu.cl');
--------------------------------------------------------
--  DDL for Index ACCIDENTE_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYSTEM"."ACCIDENTE_PK" ON "SYSTEM"."ACCIDENTE" ("IDACCIDENTE") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index ACTIVIDADES_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYSTEM"."ACTIVIDADES_PK" ON "SYSTEM"."ACTIVIDADES" ("CODIGOACTIVIDAD") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index CLIENTE_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYSTEM"."CLIENTE_PK" ON "SYSTEM"."CLIENTE" ("RUTCLIENTE") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index IT_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYSTEM"."IT_PK" ON "SYSTEM"."IT" ("NUMEROIT") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index OT_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYSTEM"."OT_PK" ON "SYSTEM"."OT" ("NUMEROOT") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Index PROFESIONAL_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYSTEM"."PROFESIONAL_PK" ON "SYSTEM"."PROFESIONAL" ("RUTPROFESIONAL") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Trigger AUTOINCACCIDENTE
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "SYSTEM"."AUTOINCACCIDENTE" 
   before insert on "SYSTEM"."ACCIDENTE" 
   for each row 
begin  
   if inserting then 
      if :NEW."IDACCIDENTE" is null then 
         select SEQUENCEACCIDENTE.nextval into :NEW."IDACCIDENTE" from dual; 
      end if; 
   end if; 
end;

/
ALTER TRIGGER "SYSTEM"."AUTOINCACCIDENTE" ENABLE;
--------------------------------------------------------
--  DDL for Trigger AUTOICNOT
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "SYSTEM"."AUTOICNOT" 
   before insert on "SYSTEM"."OT" 
   for each row 
begin  
   if inserting then 
      if :NEW."NUMEROOT" is null then 
         select SEQUENCE1.nextval into :NEW."NUMEROOT" from dual; 
      end if; 
   end if; 
end;

/
ALTER TRIGGER "SYSTEM"."AUTOICNOT" ENABLE;
--------------------------------------------------------
--  Constraints for Table ACCIDENTE
--------------------------------------------------------

  ALTER TABLE "SYSTEM"."ACCIDENTE" ADD CONSTRAINT "ACCIDENTE_PK" PRIMARY KEY ("IDACCIDENTE")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "SYSTEM"."ACCIDENTE" MODIFY ("FECHAACCIDENTE" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."ACCIDENTE" MODIFY ("DESCRIPCION" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."ACCIDENTE" MODIFY ("IDACCIDENTE" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table ACTIVIDADES
--------------------------------------------------------

  ALTER TABLE "SYSTEM"."ACTIVIDADES" ADD CONSTRAINT "ACTIVIDADES_PK" PRIMARY KEY ("CODIGOACTIVIDAD")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "SYSTEM"."ACTIVIDADES" MODIFY ("DESCRIPCION" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."ACTIVIDADES" MODIFY ("NOMBRE" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."ACTIVIDADES" MODIFY ("CODIGOACTIVIDAD" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table CLIENTE
--------------------------------------------------------

  ALTER TABLE "SYSTEM"."CLIENTE" ADD CONSTRAINT "CLIENTE_PK" PRIMARY KEY ("RUTCLIENTE")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "SYSTEM"."CLIENTE" MODIFY ("DIRECCION" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."CLIENTE" MODIFY ("RUTCLIENTE" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table IT
--------------------------------------------------------

  ALTER TABLE "SYSTEM"."IT" ADD CONSTRAINT "IT_PK" PRIMARY KEY ("NUMEROIT")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "SYSTEM"."IT" MODIFY ("OT_NUMEROOT" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."IT" MODIFY ("FECHA_TAREA" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."IT" MODIFY ("TAREA_REALIZADA" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."IT" MODIFY ("NUMEROIT" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table OT
--------------------------------------------------------

  ALTER TABLE "SYSTEM"."OT" ADD CONSTRAINT "OT_PK" PRIMARY KEY ("NUMEROOT")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "SYSTEM"."OT" MODIFY ("ACTIVIDADES_CODIGO_ACTIVIDAD" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."OT" MODIFY ("PROFESIONAL_RUT_PROFESIONAL" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."OT" MODIFY ("CLIENTE_RUT_CLIENTE" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."OT" MODIFY ("STATUSACTIVIDAD" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."OT" MODIFY ("PAGO" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."OT" MODIFY ("VALOR" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."OT" MODIFY ("FECHA_ACTIVIDAD" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."OT" MODIFY ("NUMEROOT" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table PROFESIONAL
--------------------------------------------------------

  ALTER TABLE "SYSTEM"."PROFESIONAL" ADD CONSTRAINT "PROFESIONAL_PK" PRIMARY KEY ("RUTPROFESIONAL")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "SYSTEM"."PROFESIONAL" MODIFY ("NOMBRE" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."PROFESIONAL" MODIFY ("RUTPROFESIONAL" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."PROFESIONAL" MODIFY ("TELEFONO" NOT NULL ENABLE);
--------------------------------------------------------
--  Ref Constraints for Table IT
--------------------------------------------------------

  ALTER TABLE "SYSTEM"."IT" ADD CONSTRAINT "IT_OT_FK" FOREIGN KEY ("OT_NUMEROOT")
	  REFERENCES "SYSTEM"."OT" ("NUMEROOT") ENABLE;
