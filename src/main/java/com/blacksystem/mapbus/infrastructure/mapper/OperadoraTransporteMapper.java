/*
 * -----------------------------------
 *  Project: mapbus
 *  Author: chappyd-0
 *  Date: 6/6/25
 * -----------------------------------
 */
package com.blacksystem.mapbus.infrastructure.mapper;

import com.blacksystem.mapbus.adapter.web.dto.CreateOperadoraTransporteDto;
import com.blacksystem.mapbus.adapter.web.dto.OperadoraTransporteResponseDto;
import com.blacksystem.mapbus.domain.model.Ciudad;
import com.blacksystem.mapbus.domain.model.OperadoraTransporte;

public class OperadoraTransporteMapper {


    public static OperadoraTransporte toEntity(CreateOperadoraTransporteDto dto, Ciudad ciudad) {
        OperadoraTransporte operadora = new OperadoraTransporte();
        operadora.setNombreOperadora(dto.getNombreOperadora());
        operadora.setRfc(dto.getRfc());
        operadora.setCorreoOperadora(dto.getCorreoOperadora());
        operadora.setCiudad(ciudad);
        return operadora;
    }


    public static OperadoraTransporteResponseDto toResponseDto(OperadoraTransporte operadora) {
        OperadoraTransporteResponseDto dto = new OperadoraTransporteResponseDto();
        dto.setIdOperadoraTransporte(operadora.getIdOperadoraTransporte());
        dto.setNombreOperadora(operadora.getNombreOperadora());
        dto.setRfc(operadora.getRfc());
        dto.setCorreoOperadora(operadora.getCorreoOperadora());
        dto.setIdCiudad(operadora.getCiudad() != null ? operadora.getCiudad().getIdCiudad() : null);
        dto.setNombreCiudad(operadora.getCiudad() != null ? operadora.getCiudad().getNombreCiudad() : null);
        return dto;
    }
}
