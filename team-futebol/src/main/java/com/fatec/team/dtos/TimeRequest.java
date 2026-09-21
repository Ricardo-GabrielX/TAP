package com.fatec.team.dtos;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record TimeRequest(

    @NotBlank(message = "O nome do time é obrigatório")
    @Size(min = 2, max = 100, message = "O nome deve ter entre 2 e 100 caracteres")
    String nome,

    @NotBlank(message = "A sigla do time é obrigatória")
    @Size(min = 2, max = 5, message = "A sigla deve ter entre 2 e 5 caracteres")
    String sigla,

    @NotBlank(message = "A cidade é obrigatória")
    @Size(max = 100, message = "A cidade deve ter no máximo 100 caracteres")
    String cidade,

    @NotBlank(message = "O estado é obrigatório")
    @Size(min = 2, max = 2, message = "O estado deve ser a sigla com 2 letras (ex: SP)")
    String estado,

    @NotNull(message = "O ano de fundação é obrigatório")
    @Min(value = 1850, message = "O ano de fundação deve ser maior ou igual a 1850")
    @Max(value = 2100, message = "O ano de fundação deve ser um valor válido")
    Integer anoFundacao,

    @NotBlank(message = "O técnico é obrigatório")
    @Size(min = 2, max = 100, message = "O nome do técnico deve ter entre 2 e 100 caracteres")
    String tecnico

) {

}
