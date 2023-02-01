package br.com.attornatus.domain.pessoa;

import br.com.attornatus.domain.endereco.Endereco;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_pessoas")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Pessoa {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    private LocalDate dataNascimento;

    @OneToMany(mappedBy = "pessoa",  orphanRemoval = true, cascade = CascadeType.ALL)
    private List<Endereco> enderecos;

    public Pessoa(CadastrarPessoaDTO pessoa){
        this.nome = pessoa.nome();
        this.dataNascimento = pessoa.dataNascimento();
    }

    public void atualizarInformacoes(AtualizarPessoaDTO pessoa) {

        if(pessoa.nome() != null){
            this.nome = pessoa.nome();
        }
        if(pessoa.dataNascimento() != null){
            this.dataNascimento = pessoa.dataNascimento();
        }

    }
}
