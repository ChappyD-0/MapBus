/*
 * -----------------------------------
 *  Project: mapbus
 *  Author: chappyd-0
 *  Date: 6/6/25
 * -----------------------------------
 */
package com.blacksystem.mapbus.domain.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class OperadoraTransporte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOperadoraTransporte;

    @ManyToOne
    @JoinColumn(name = "id_ciudad_operadora_transporte", nullable = false)
    private Ciudad ciudad;

    @Column(length = 40, nullable = false)
    private String nombreOperadora;

    @Column(length = 12, nullable = false, unique = true)
    private String rfc;

    @Column(length = 50, nullable = false)
    private String correoOperadora;

}
