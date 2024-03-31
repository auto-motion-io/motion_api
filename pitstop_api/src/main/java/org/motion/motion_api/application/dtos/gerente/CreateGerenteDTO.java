package org.motion.motion_api.application.dtos.gerente;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CreateGerenteDTO(
        @NotNull @NotBlank
        String email,
        @NotNull @NotBlank
        String nome,
        @NotNull @NotBlank
        String sobrenome,
        @NotNull @NotBlank
        Integer fkOficina
) {
}