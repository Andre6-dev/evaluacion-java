SELECT
    e.ruc,
    e.razonSocial,
    r.idRespuesta,
    r.codigoRespuesta,
    r.descripcionRespuesta,
    r.fechaRespuesta,
    r.estado
FROM
    empresa e
        JOIN
    transaccion t ON e.idEmpresa = t.idEmpresa
        JOIN
    respuesta r ON t.idTransaccion = r.idTransaccion
ORDER BY
    r.fechaRespuesta DESC
    LIMIT
  1;