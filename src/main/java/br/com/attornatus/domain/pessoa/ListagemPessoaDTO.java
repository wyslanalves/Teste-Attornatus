package br.com.attornatus.domain.pessoa;

import br.com.attornatus.domain.endereco.Endereco;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public record ListagemPessoaDTO(

        Long id,
        String nome,
        LocalDate dataNascimento,
        List<Endereco> endereco

) {
    public ListagemPessoaDTO(Pessoa pessoa){
        this(pessoa.getId(), pessoa.getNome(), pessoa.getDataNascimento(), pessoa.getEnderecos());
    }


}
