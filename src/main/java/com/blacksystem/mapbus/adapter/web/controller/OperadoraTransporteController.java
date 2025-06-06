/*
 * -----------------------------------
 *  Project: mapbus
 *  Author: chappyd-0
 *  Date: 6/6/25
 * -----------------------------------
 */
package com.blacksystem.mapbus.adapter.web.controller;

import com.blacksystem.mapbus.adapter.web.dto.CreateOperadoraTransporteDto;
import com.blacksystem.mapbus.adapter.web.dto.OperadoraTransporteResponseDto;
import com.blacksystem.mapbus.aplication.service.CiudadService;
import com.blacksystem.mapbus.aplication.service.OperadoraTransporteService;
import com.blacksystem.mapbus.domain.model.Ciudad;
import com.blacksystem.mapbus.domain.model.OperadoraTransporte;
import com.blacksystem.mapbus.infrastructure.mapper.OperadoraTransporteMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;

@RestController
@RequestMapping("/api/operadoras")
public class OperadoraTransporteController {

    private final OperadoraTransporteService operadoraService;

    private final CiudadService ciudadService;

    public OperadoraTransporteController(OperadoraTransporteService operadoraService, CiudadService ciudadService) {
        this.operadoraService = operadoraService;
        this.ciudadService = ciudadService;
    }

    @PreAuthorize("hasRole('SECRETARIA_MOVILIDAD')")
    @PostMapping
    public ResponseEntity<OperadoraTransporteResponseDto> crearOperadora(
            @Validated @RequestBody CreateOperadoraTransporteDto dto) {
        Ciudad ciudad = ciudadService.findById(dto.getIdCiudad())
                .orElseThrow(() -> new IllegalArgumentException("Ciudad no encontrada"));
        OperadoraTransporte operadora = operadoraService.crearOperadora(dto, ciudad);
        return ResponseEntity.ok(OperadoraTransporteMapper.toResponseDto(operadora));
    }

    @PreAuthorize("hasRole('SECRETARIA_MOVILIDAD')")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarOperadora(@PathVariable Long id) {
        operadoraService.eliminarOperadora(id);
        return ResponseEntity.noContent().build();
    }
}
