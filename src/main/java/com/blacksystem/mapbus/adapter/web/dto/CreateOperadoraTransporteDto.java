/*
 * -----------------------------------
 *  Project: mapbus
 *  Author: chappyd-0
 *  Date: 6/6/25
 * -----------------------------------
 */
package com.blacksystem.mapbus.adapter.web.dto;


import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateOperadoraTransporteDto {

    @NotBlank
    @Size(max = 40)
    private String nombreOperadora;

    @NotBlank
    @Size(min = 12, max = 12)
    private String rfc;

    @NotBlank
    @Email
    @Size(max = 50)
    private String correoOperadora;

    @NotNull
    private Long idCiudad;

}

