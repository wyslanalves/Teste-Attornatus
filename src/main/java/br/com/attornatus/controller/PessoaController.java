package br.com.attornatus.controller;

import br.com.attornatus.domain.pessoa.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    @Autowired
    private PessoaRepository pessoaRepository;

    @GetMapping

    public ResponseEntity<Page<ListagemPessoaDTO>> listarPessoa(@PageableDefault(size = 10, sort = {"nome"}) @Valid Pageable paginacao){
        var page = pessoaRepository.findAll(paginacao).map(ListagemPessoaDTO::new);
        return ResponseEntity.ok(page);
    }
    @GetMapping("/{id}")
    public ResponseEntity detalharMedico(@PathVariable Long id){
        var pessoa =  pessoaRepository.getReferenceById(id);
        return ResponseEntity.ok(new ListagemPessoaDTO(pessoa));
    }
    @PostMapping
    @Transactional
    public ResponseEntity cadastrarPessoa(@RequestBody @Valid CadastrarPessoaDTO dados, UriComponentsBuilder uriBuilder){
        var pessoa = new Pessoa(dados);
        pessoaRepository.save(pessoa);
        var uri = uriBuilder.path("/pessoas/{id}").buildAndExpand(pessoa.getId()).toUri();
        return ResponseEntity.created(uri).body(new CadastrarPessoaDTO(pessoa));
    }
    @PutMapping
    @Transactional
    public ResponseEntity atualizarPessoa(@RequestBody AtualizarPessoaDTO dados){
        var pessoa = pessoaRepository.getReferenceById(dados.id());
        pessoa.atualizarInformacoes(dados);
        return ResponseEntity.ok(new AtualizarPessoaDTO(pessoa));
    }
    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity deletarPessoa(@PathVariable Long id){
        pessoaRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
