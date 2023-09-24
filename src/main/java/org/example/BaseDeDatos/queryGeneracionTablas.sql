CREATE TABLE "Empresa"
(
    "idEmpresa"   int4 NOT NULL,
    "ruc"         varchar(11),
    "razonSocial" varchar(255),
    "direccion"   varchar(255),
    "estado"      varchar(255),
    PRIMARY KEY ("idEmpresa")
);

CREATE TABLE "Respuesta"
(
    "idRespuesta"          int4 NOT NULL,
    "idTransaccion"        int4 NOT NULL,
    "codigoRespuesta"      varchar(50),
    "descripcionRespuesta" text,
    "fechaRespuesta"       date,
    "estado"               varchar(255),
    PRIMARY KEY ("idRespuesta"),
    CONSTRAINT "uk_idTransaccion" UNIQUE ("idTransaccion")
);

CREATE TABLE "Transaccion"
(
    "idTransaccion"   int4 NOT NULL,
    "idEmpresa"       int4 NOT NULL,
    "nombreDocumento" varchar(255),
    "fechaRegistro"   date,
    "estado"          varchar(255),
    PRIMARY KEY ("idTransaccion"),
    CONSTRAINT "uk_idEmpresa" UNIQUE ("idEmpresa")
);

ALTER TABLE "Empresa"
    ADD CONSTRAINT "fk_empresa_transaccion" FOREIGN KEY ("idEmpresa") REFERENCES "Transaccion" ("idEmpresa");
ALTER TABLE "Transaccion"
    ADD CONSTRAINT "fk_Transaccion_Respuesta_1" FOREIGN KEY ("idTransaccion") REFERENCES "Respuesta" ("idTransaccion");

