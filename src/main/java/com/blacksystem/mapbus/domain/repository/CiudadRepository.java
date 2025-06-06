/*
 * -----------------------------------
 *  Project: mapbus
 *  Author: chappyd-0
 *  Date: 6/6/25
 * -----------------------------------
 */
package com.blacksystem.mapbus.domain.repository;
import com.blacksystem.mapbus.domain.model.Ciudad;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.List;
@Repository
public interface CiudadRepository {
    Optional<Ciudad> findById(Long idCiudad);
    List<Ciudad> findAll();
}
