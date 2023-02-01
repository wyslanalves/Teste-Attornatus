<h1>Avaliação Desenvolvedor Back-end Attornatus</h1>
<hr>

<p align="center">
   <img src="http://img.shields.io/static/v1?label=STATUS&message=%20CONCLUIDO&color=RED&style=for-the-badge" #vitrinedev/>
</p>

### Tópicos 

- [Descrição do projeto](#descrição-do-projeto)

- [Funcionalidades](#funcionalidades)

- [Aplicação](#aplicação)

- [Técnicas e tecnologias utilizadas](#técnicas-e-tecnologias-utilizadas)

- [Iniciando e Configurando banco de dados](#iniciando-e-configurando-banco-de-dados)

- [Acesso ao projeto](#acesso-ao-projeto)

- [Desenvolvedor](#desenvolvedor)

## Descrição do projeto 

<p align="justify">
 
O sistema permitirá o cadastro de pessoas e poderá associar vários endereços para uma pessoa. Foi realizado validações, foi feito tratamento do retorno da API nas requisiçôes e utilizei  Record  que é um recurso que permite representar uma classe imutável contendo apenas atributos, construtor e métodos de leitura. 
Esse tipo de classe se encaixa perfeitamente para representar classes DTO, já que seu objetivo é apenas representar dados que serão recebidos ou devolvidos pela API. 

![Descrição do projeto GlicoCare, onde se tem um paciente medindo glicose com um glicosímetro, conectado via Bluetooth ao aplicativo que o profissional da saúde tem acesso.](https://user-images.githubusercontent.com/72626881/215636478-4f47360a-c44b-433c-9fb1-194f5b174f9e.png)
</p>

## Funcionalidades

:heavy_check_mark: `Funcionalidade 1:` Realizar cadastro das pessoas.

:heavy_check_mark: `Funcionalidade 1:` Realizar cadastro dos endereços e associando a pessoa.

:heavy_check_mark: `Funcionalidade 4:` Realizando todo processo de CRUD (Create, Read, Update, Delete).

## Aplicação

<div align="center">

![Android Emulator](https://user-images.githubusercontent.com/72626881/215635250-6c16eed1-e7b7-4ae1-ae9d-f530f401fef9.gif)

  </div>

###

## Técnicas e tecnologias utilizadas

:heavy_check_mark: ``Java 17``<br>
:heavy_check_mark: ``Spring Boot 3``<br>
:heavy_check_mark: ``InteliJ IDEA``<br>
:heavy_check_mark: ``Banco de Dados H2``<br>
:heavy_check_mark: ``Lombok``<br>
:heavy_check_mark: ``Hibernate``<br>
:heavy_check_mark: ``Insomnia (Testar Requisiçôes REST)``<br>


###

## Iniciando e Configurando banco de dados

* Script SQL
```sql
INSERT INTO tb_pessoas (nome, data_nascimento) VALUES ('Pedro',  '2023-01-01');
INSERT INTO tb_pessoas (nome, data_nascimento) VALUES ('Larissa',  '2023-01-01');
INSERT INTO tb_pessoas (nome, data_nascimento) VALUES ('Allyson',  '2023-01-01');
INSERT INTO tb_pessoas (nome, data_nascimento) VALUES ('gustavo',  '2023-01-01');

INSERT INTO tb_enderecos (cep, cidade, endereco_principal, logradouro, numero, pessoa_id) VALUES ('58304000', 'Santa Rita', true, 'rua1', '420',1);
INSERT INTO tb_enderecos (cep, cidade, endereco_principal, logradouro, numero, pessoa_id) VALUES ('58305000', 'Conde', false, 'rua2', '421',1);
INSERT INTO tb_enderecos (cep, cidade, endereco_principal, logradouro, numero, pessoa_id) VALUES ('58306000', 'Lucena', false, 'rua3', '422',1);
INSERT INTO tb_enderecos (cep, cidade, endereco_principal, logradouro, numero, pessoa_id) VALUES ('58307000', 'Bayeux', false, 'rua4', '423',2);
INSERT INTO tb_enderecos (cep, cidade, endereco_principal, logradouro, numero, pessoa_id) VALUES ('58307000', 'Rio de Janeiro', false, 'rua4', '423',3);
INSERT INTO tb_enderecos (cep, cidade, endereco_principal, logradouro, numero, pessoa_id) VALUES ('58307000', 'São Paulo', false, 'rua4', '423',4);
INSERT INTO tb_enderecos (cep, cidade, endereco_principal, logradouro, numero, pessoa_id) VALUES ('58307000', 'Bahia', false, 'rua4', '423',5);
```

## Acesso ao projeto

Você pode [acessar o código fonte do projeto](https://github.com/wyslanalves/Teste-Attornatus) ou [baixá-lo](https://github.com/wyslanalves/Teste-Attornatus/archive/refs/heads/main.zip).

## Desenvolvedor

| [<img src="https://user-images.githubusercontent.com/72626881/215578626-2cf28785-b5d0-4ec2-81d5-5e1ad9b5acd0.jpg" width=115><br><sub>Wyslan Alves</sub>](https://github.com/wyslanalves) |
| :---: 
