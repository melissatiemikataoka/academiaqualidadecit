# language: pt
# encoding: utf-8

@AcessarGit
Funcionalidade: Acessar site do Git

    @LogarGit
    Esquema do Cenário: Cenario: Acessar o site do Git, realizar o login e logout
      Dado que acesso o site do Git
      Quando clicar em Sign in inserindo um '<email>' e '<senha>' válidos
      Então estará logado na conta do Git
      E fazer logout
      E fechar navegador
    Exemplos:
      | email | senha |
      | melissa_kataoka@hotmail.com | Keniti2908 |


    @CriarRepositorio
    Esquema do Cenário: Acessar o Git e criar um repositorio
      Dado que acesso o site do Git
      Quando clicar em Sign in inserindo um '<email>' e '<senha>' válidos
      E criar um repositorio
      Então validar repositorio criado com sucesso
      E fazer logout
      E fechar navegador
    Exemplos:
      | email | senha |
      | melissa_kataoka@hotmail.com | Keniti2908 |

    @RenomearRepositorio
    Esquema do Cenario: Acessar o Git e renomear um repositorio
      Dado que acesso o site do Git
      Quando clicar em Sign in inserindo um '<email>' e '<senha>' válidos
      E renomear repositório
      Então validar repositório renomeado com novo nome
    Exemplos:
      | email | senha |
      | melissa_kataoka@hotmail.com | Keniti2908 |

    @ExcluirRepositorio
    Esquema do Cenario: Acessar o Git, criar e excluir um repositorio
      Dado que acesso o site do Git
      Quando  clicar em Sign in inserindo um '<email>' e '<senha>' válidos
      E criar um repositorio
      E validar repositorio criado com sucesso
      Então excluir um repositório
      E fazer logout
      E fechar navegador
    Exemplos:
      | email | senha |
      | melissa_kataoka@hotmail.com | Keniti2908 |
