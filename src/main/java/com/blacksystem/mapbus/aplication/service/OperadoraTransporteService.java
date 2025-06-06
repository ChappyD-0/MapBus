/*
 * -----------------------------------
 *  Project: mapbus
 *  Author: chappyd-0
 *  Date: 6/6/25
 * -----------------------------------
 */
package com.blacksystem.mapbus.aplication.service;

import com.blacksystem.mapbus.adapter.web.dto.CreateOperadoraTransporteDto;
import com.blacksystem.mapbus.domain.model.Ciudad;
import com.blacksystem.mapbus.domain.model.OperadoraTransporte;
import com.blacksystem.mapbus.domain.repository.OperadoraTransporteRepository;
import com.blacksystem.mapbus.infrastructure.mapper.OperadoraTransporteMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OperadoraTransporteService {

    private final OperadoraTransporteRepository operadoraRepository;

    public OperadoraTransporteService(OperadoraTransporteRepository operadoraRepository) {
        this.operadoraRepository = operadoraRepository;
    }

    @Transactional
    public OperadoraTransporte crearOperadora(CreateOperadoraTransporteDto dto, Ciudad ciudad) {
        if (operadoraRepository.existsByRfc(dto.getRfc())) {
            throw new IllegalArgumentException("El RFC ya existe");
        }

        OperadoraTransporte operadora = OperadoraTransporteMapper.toEntity(dto, ciudad);
        return operadoraRepository.save(operadora);
    }


    @Transactional
    public void eliminarOperadora(Long idOperadora) {
//        if (operadoraRepository.existsByIdAndRutasActivas(idOperadora)) {
//            throw new IllegalStateException("No se puede eliminar: la operadora tiene rutas activas");
//        }
        OperadoraTransporte operadora = operadoraRepository.findById(idOperadora)
                .orElseThrow(() -> new IllegalArgumentException("Operadora no encontrada"));
        operadoraRepository.delete(operadora);
    }
}
