/*
 * -----------------------------------
 *  Project: mapbus
 *  Author: chappyd-0
 *  Date: 6/6/25
 * -----------------------------------
 */
package com.blacksystem.mapbus.adapter.web.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OperadoraTransporteResponseDto {

    private Long idOperadoraTransporte;
    private String nombreOperadora;
    private String rfc;
    private String correoOperadora;
    private Long idCiudad;
    private String nombreCiudad;
}