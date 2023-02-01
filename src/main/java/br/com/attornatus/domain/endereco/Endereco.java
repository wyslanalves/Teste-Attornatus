package br.com.attornatus.domain.endereco;

import br.com.attornatus.domain.pessoa.Pessoa;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_enderecos")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cep;
    private String logradouro;
    private String numero;
    private String cidade;
    private Boolean enderecoPrincipal;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER)
    private Pessoa pessoa;


    public Endereco(CadastrarEnderecoDTO endereco){
        this.cep = endereco.cep();
        this.logradouro = endereco.logradouro();
        this.numero = endereco.numero();
        this.cidade = endereco.cidade();
        this.enderecoPrincipal = endereco.enderecoPrincipal();
        this.pessoa = endereco.pessoa();
    }

}
