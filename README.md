# Controle de Autorizações de Procedimentos Médicos

Este é um projeto de controle de autorizações de procedimentos médicos para um plano de saúde. Ele permite definir regras de autorização com base na idade e sexo do paciente e verificar se um determinado procedimento está autorizado ou não.

## Tecnologias Utilizadas

- Java
- JSP (JavaServer Pages)
- Servlets
- Banco de Dados H2
- JBoss (Servidor de Aplicação)

## Configuração do Projeto

1. Clone o repositório do projeto em sua máquina local:

```
git clone git@github.com:Ierddan/medical-procedure-authorization-Zitrus.git
```

2. Importe o projeto em sua IDE como um projeto Maven.

3. Certifique-se de ter o servidor de aplicação JBoss configurado corretamente em sua IDE.

4. Configure o banco de dados H2
5. 
5. Execute o projeto:
    - Inicie o servidor de aplicação JBoss em sua IDE.
    - Implante o projeto no servidor JBoss.
    - Acesse o aplicativo em seu navegador através da URL: `http://localhost:8080/`.

## Estrutura do Projeto

- `src/main/java`: Contém as classes Java do projeto.
- `src/main/resources`: Contém os recursos de configuração do projeto, como arquivos de propriedades.

## Funcionalidades

- Cadastro de regras de autorização: Permite cadastrar regras de autorização para diferentes procedimentos médicos com base na idade e sexo do paciente.
- Verificação de autorização: Permite verificar se um determinado procedimento está autorizado ou não com base nas regras cadastradas.

