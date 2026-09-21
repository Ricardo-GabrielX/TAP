package com.fatec.team.dtos;

public record TimeResponse(
    Long id,
    String nome,
    String sigla,
    String cidade,
    String estado,
    Integer anoFundacao,
    String tecnico

) {

}
