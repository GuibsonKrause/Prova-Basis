# Prova-Basis

Desafio Basis


Teste de conhecimentos para candidatos a vaga de desenvolvedores Java.


Sobre o desafio

Este desafio tem como objetivo, verificar o conhecimento técnico e a qualidade de desenvolvimento de código. O teste deve ser feito até onde o candidato conseguir, para demonstrar seu potencial e conhecimento. Caso o teste não seja totalmente concluído, não necessariamente acarretará em desclassificação.

O teste deverá ser iniciado a partir de um projeto pré-configurado disponibilizado pela Basis (https://github.com/BasisTI/avaliacao-basis). Após realizar o clone do repositório, siga as instruções abaixo para executar o projeto.

Executando a aplicação

Para a execução da aplicação, é necessário que você tenha instalado em seu PC:

●	Maven

●	JDK 8

●	Docker

Com as ferramentas instaladas corretamente, basta abrir o arquivo pom.xml em sua IDE (IntelliJ, Eclipse ou STS) e importar todas as dependências do projeto. Caso deseje executar o projeto pelo terminal, utilize o comando: mvn spring-boot:run


A aplicação poderá ser acessada na URL: http://localhost:8080/api


Banco de Dados

O banco de dados usado pela aplicação é o MySQL. Para subir o banco, é necessário

ter instalado o Docker Compose em seu PC, feito isso, base abrir o terminal na pasta

raiz do projeto e executar o seguinte comando: docker-compose up -d.


●	Para acessar o banco usar o endereço: http://localhost:3306

●	Usar o nome do banco de dados: provabasis

●	Usar o Usuário e Senha: root
 

Observação: Caso tenha problemas com a instalação do Docker Compose, e queira utilizar outro banco, basta alterar as configurações de conexão com o banco no

arquivo application.properties localizado dentro do projeto de acordo com o banco de dados que irá utilizar.

1. Aplicação


1.1. Introdução

A aplicação a ser desenvolvida representa um sistema acadêmico básico. Onde é

necessário o cadastro de Alunos, Disciplinas e Professores.Deve ser desenvolvida uma API RestFul que será responsável por receber requisições de Clientes (Angular, React, Vue, REST-Client, etc). – Feito.

Fique a vontade para criar, alterar ou remover qualquer arquivo no projeto, caso julgue necessário para o desenvolvimento do desafio.

1.2. Tecnologias

Abaixo estão listadas todas as tecnologias utilizadas na implementação do projeto:


●	JPA

●	Hibernate

●	Spring Framework

●	Spring Data

●	Spring Boot

●	Maven

●	Liquibase

●	MapStruct

1.3. Documentação

1.3.1. Alunos

O cadastro de alunos deve armazenar as informações:


●	Id: Campoúnico eobrigatório numérico. – Feito.

●	CPF:Campo únicoe obrigatório, contendo 11 caracteres numéricos. – Feito.

●	Nome:Campo obrigatório, contendo de 4 a 50 caracteres. – Feito.

●	Data de nascimento:Campo obrigatório, contendo apenas dd/mm/aaaa. – Feito.

●	Matrícula: Campo únicoe obrigatório, contendo 6 caracteres. – Feito. 
●	Disciplinas: Campo que armazena as disciplinas vinculadas ao aluno. – Feito.


Consulta: A API deve fornecer uma consulta de alunos retornando apenas seu id, nome, matrícula e idade. – Feito.

Consulta detalhada: A API deve fornecer uma consulta de um aluno retornando apenas seu id, nome, matrícula e as disciplinas em que está matriculado. – Feito.

Exclusão: AAPI deve fornecer uma forma de exclusão de um aluno pela matrícula. – Feito.


REGRAS:O Aluno só pode ser excluído se não estiver vinculado a uma disciplina. – Feito.

1.3.2. Disciplinas

O cadastro de disciplinas deve armazenar as informações:


●	Id: Campoúnico eobrigatório numérico. – Feito.

●	Nome:Campo únicoe obrigatório, contendo de 4 a 50 caracteres. – Feito.

●	Descrição:Campo obrigatório, contendo de 1 a 200 caracteres. – Feito.

●	Carga horária (hrs):Campo obrigatórionumérico. – Feito.

●	Ativa:Campo que armazena o status da disciplina. – Feito.

●	Professor: Campo que armazena o professor responsável pela disciplina. – Feito.


Consulta:A API deve fornecer uma consulta de disciplinas retornando apenas seu id, nome, descrição e carga horária. – Feito.

Consulta detalhada: A API deve fornecer uma consulta de uma disciplina retornando apenas seu id, nome, carga horária e o professor responsável. – Feito.

Exclusão: A API deve fornecer uma forma de exclusão de uma disciplina pelo identificador. – Feito.

REGRAS: Uma disciplina só pode ser cadastrada informando qual professor será responsável por ela. A disciplina só poderá ser excluída caso não haja nenhum aluno matriculado. – Feito.

1.3.3. Professores
 

O cadastro de professores deve armazenar as informações:

●	Id: Campoúnico eobrigatório numérico. – Feito.

●	Matrícula: Campo únicoe obrigatório, contendo 6 caracteres. – Feito.

●	Nome:Campo obrigatório, contendo de 1 a 50 caracteres. – Feito.

●	Área de atuação:Campo contendo de 1 a 200 caracteres. – Feito.

●	Data de nascimento:Campo obrigatório, contendo apenas dd/mm/aaaa. – Feito.


Consulta:A API deve fornecer uma consulta de professores retornando apenas seu id, nome, matrícula, área de atuação e idade. – Feito.

Consulta detalhada: A API deve fornecer uma consulta de um professor retornando apenas seu id, nome, matrícula e as disciplinas ativas pelas quais o professor é responsável. – Não Feito.

Exclusão: A API deve fornecer uma forma de exclusão de um professor pela matrícula. – Feito.

REGRAS: Um professor só pode ser excluído se não for responsável por nenhuma disciplina. – Feito.

2. Extra - Não Feito.

A relação entre alunos e disciplinas gera uma Avaliação ao final de um período pré estabelecido. Uma Avaliação é o relacionamento entre um aluno e uma disciplina que armazena a nota e a data em que a avaliação foi aplicada. A persistência de tal entidade deve ser feita por meio da rota /avaliacoes,seguindo o padrão de projeto já implementado no desafio(recurso, servico e repositório).

A  criação  do  modelo  de  dados  deve ser feita a partir do seguinte arquivo:

/src/main/resources/db/changelog/V01_criacao_dominio.xml.


3. Entrega


O desafio deve ser submetido a um repositório git de sua preferência (Github, Bitbucket, GitLab) em modo público.O link do repositório deve ser enviado para o email que lhe enviou este documento com o assunto “Avaliação Basis” e com uma breve descrição sobre quais funcionalidades foram implementadas pelo candidato durante o desenvolvimento do projeto.
