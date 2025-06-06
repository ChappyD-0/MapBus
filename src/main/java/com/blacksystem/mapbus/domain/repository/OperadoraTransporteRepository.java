/*
 * -----------------------------------
 *  Project: mapbus
 *  Author: chappyd-0
 *  Date: 6/6/25
 * -----------------------------------
 */
package com.blacksystem.mapbus.domain.repository;

import com.blacksystem.mapbus.domain.model.OperadoraTransporte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperadoraTransporteRepository extends JpaRepository<OperadoraTransporte, Long> {
    boolean existsByRfc(String rfc);

    boolean existsByIdAndRutasActivas(Long idOperadora);
}
