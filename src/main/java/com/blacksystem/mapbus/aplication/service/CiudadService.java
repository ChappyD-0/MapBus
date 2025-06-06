/*
 * -----------------------------------
 *  Project: mapbus
 *  Author: chappyd-0
 *  Date: 6/6/25
 * -----------------------------------
 */
package com.blacksystem.mapbus.aplication.service;

import com.blacksystem.mapbus.domain.model.Ciudad;
import com.blacksystem.mapbus.domain.repository.CiudadRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CiudadService {

    private final CiudadRepository ciudadRepository;

    public CiudadService(CiudadRepository ciudadRepository) {
        this.ciudadRepository = ciudadRepository;
    }

    public Optional<Ciudad> findById(Long idCiudad) {
        return ciudadRepository.findById(idCiudad);
    }

    public List<Ciudad> findAll() {
        return ciudadRepository.findAll();
    }
}
