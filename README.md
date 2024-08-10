# Projeto Produtora de Atores

Este projeto simula uma produtora que contrata atores e protagonistas, calculando seus salários e gerenciando a lista de contratados.

## Estruturas de Classe

### Ator

A classe `Ator` representa um ator genérico e possui os seguintes atributos:

- `nome`: Nome do ator.
- `qtdHorasTrabalhadas`: Quantidade de horas trabalhadas pelo ator.
- `valorHoraTrabalhadas`: Valor pago por hora trabalhada.

#### Métodos

- `getSalario()`: Retorna o salário total do ator com base nas horas trabalhadas e no valor por hora.
- `toString()`: Retorna uma representação em string do ator.

### Produtora

A classe `Produtora` representa a produtora e contém os seguintes atributos:

- `nome`: Nome da produtora.
- `vagas`: Número de vagas disponíveis para contratação.
- `atores`: Lista de atores contratados.

#### Métodos

- `existePorNome(String nome)`: Verifica se um ator com o nome fornecido já está contratado.
- `contratar(Ator ator)`: Contrata um ator se houver vagas disponíveis.
- `getQuantidadeAtores()`: Retorna a quantidade de atores contratados.
- `getQunatidadeProtagonistas()`: Retorna a quantidade de protagonistas contratados.
- `getTotalSalarios()`: Retorna o total de salários a ser pago aos atores contratados.
- `buscarAtorPorNome(String nome)`: Busca um ator pelo nome.

### Protagonista

A classe `Protagonista` estende a classe `Ator` e representa um ator que é protagonista. Possui os seguintes atributos adicionais:

- `qtdHoraProtagonista`: Quantidade de horas trabalhadas como protagonista.
- `valorHoraProtagonista`: Valor pago por hora trabalhada como protagonista.

#### Métodos

- `getSalario()`: Retorna o salário total do protagonista, incluindo as horas como protagonista.
- `toString()`: Retorna uma representação em string do protagonista.

## Teste

A classe `TesteAtores` contém o método `main` que realiza os seguintes testes:

1. Criação de uma produtora e dois atores (um ator e um protagonista).
2. Impressão dos detalhes de cada ator, incluindo seus salários.
3. Verificação da existência de um ator pelo nome.
4. Contratação dos atores na produtora.
5. Impressão da quantidade total de atores e protagonistas contratados.
6. Cálculo e impressão do total de salários a serem pagos.
7. Busca e impressão de um ator pelo nome.
