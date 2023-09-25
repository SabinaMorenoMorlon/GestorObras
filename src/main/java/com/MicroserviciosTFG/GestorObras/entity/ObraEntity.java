package com.MicroserviciosTFG.GestorObras.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.reflect.Array;

@Document(value="obras")
@Getter
@Setter
@NoArgsConstructor
public class ObraEntity {
    @Id

    private Integer id;
    private String codigoObra;
    private String tipo;
    private String centro;
    private String direccion;
    private Integer diasPrevistosDuracion;
    private String responsableObra;
    private Array empleadosAsignados;
    private Double presupuestoIncial;
    private Double gastosPersonal;
    private Double gastosMaterial;
    private Double gastosExtras;
    private Double precioFinal;
    private String nombreDirectorCentro;
}
