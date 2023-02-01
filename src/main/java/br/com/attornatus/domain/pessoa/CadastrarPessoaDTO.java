package br.com.attornatus.domain.pessoa;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

public record CadastrarPessoaDTO(
        @NotBlank
        String nome,
        LocalDate dataNascimento
) {
        public CadastrarPessoaDTO(Pessoa pessoa){
                this(pessoa.getNome(), pessoa.getDataNascimento());
        }
}
