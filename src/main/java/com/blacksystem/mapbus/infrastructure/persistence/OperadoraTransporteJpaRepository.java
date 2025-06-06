/*
 * -----------------------------------
 *  Project: mapbus
 *  Author: chappyd-0
 *  Date: 6/6/25
 * -----------------------------------
 */
package com.blacksystem.mapbus.infrastructure.persistence;


import com.blacksystem.mapbus.domain.model.OperadoraTransporte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperadoraTransporteJpaRepository extends JpaRepository<OperadoraTransporte, Long> {
    boolean existsByRfc(String rfc);
}