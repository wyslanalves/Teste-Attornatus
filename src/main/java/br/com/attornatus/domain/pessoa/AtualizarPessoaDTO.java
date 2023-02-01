package br.com.attornatus.domain.pessoa;

import br.com.attornatus.domain.endereco.Endereco;

import java.time.LocalDate;

public record AtualizarPessoaDTO(

        Long id,
        String nome,
        LocalDate dataNascimento
) {
    public AtualizarPessoaDTO(Pessoa pessoa){
    this(pessoa.getId(), pessoa.getNome(), pessoa.getDataNascimento());
    }
}
