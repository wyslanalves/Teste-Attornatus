package br.com.attornatus.controller;

import br.com.attornatus.domain.endereco.CadastrarEnderecoDTO;
import br.com.attornatus.domain.endereco.Endereco;
import br.com.attornatus.domain.endereco.EnderecoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {

    @Autowired
    private EnderecoRepository enderecoRepository;

    @PostMapping
    @Transactional
    public ResponseEntity cadastrarEndereco(@RequestBody @Valid CadastrarEnderecoDTO dados, UriComponentsBuilder uriBuilder){
        var endereco = new Endereco(dados);
        enderecoRepository.save(endereco);
        var uri = uriBuilder.path("/endereco/{id}").buildAndExpand(endereco.getId()).toUri();
        return ResponseEntity.created(uri).body(new CadastrarEnderecoDTO(endereco));
    }
}
