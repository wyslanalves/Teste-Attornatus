package br.com.attornatus.domain.endereco;

import br.com.attornatus.domain.pessoa.Pessoa;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record CadastrarEnderecoDTO(

        @NotBlank
        @Pattern(regexp = "\\d{8}")
        String cep,
        @NotBlank
        String logradouro,
        @NotBlank
        String numero,
        String cidade,
        Boolean enderecoPrincipal,
        Pessoa pessoa
) {


        public CadastrarEnderecoDTO(Endereco endereco){
                this(
                        endereco.getCep(),
                        endereco.getLogradouro(),
                        endereco.getNumero(),
                        endereco.getCidade(),
                        endereco.getEnderecoPrincipal(),
                        endereco.getPessoa()
                );
        }
}
