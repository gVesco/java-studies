# [DIO](www.dio.me) - Trilha Java Básico

## POO - Desafio

### Modelagem e Diagramação de um Componente iPhone

Neste desafio, você será responsável por modelar e diagramar a representação UML do componente iPhone, abrangendo suas funcionalidades como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

#### Contexto
Com base no vídeo de lançamento do iPhone de 2007 (link abaixo), você deve elaborar a diagramação das classes e interfaces utilizando uma ferramenta UML de sua preferência. Em seguida, implemente as classes e interfaces no formato de arquivos `.java`.

[Lançamento iPhone 2007](https://www.youtube.com/watch?v=9ou608QQRq8)
- Minutos relevantes: 00:15 até 00:55

### Solução
```mermaid
classDiagram
   class ReprodutorMusical {
      + tocar() void
      + pausar() void
      + ajustaVolume() void
      + selecionarMusica(String musica) void
   }

   iPhone "1" --> "*" ReprodutorMusical : Implementa

   class AparelhoTelefonico {
     + ligar(String numero) void
     + atender() void
     + ignorarChamada() void
     + colocarChamadaEmEspera() void 
     + encerrarChamada() void
     + vivaVoz() void
     + silenciarMicrofone() void
     + iniciarCorreioVoz() void
     + deletarCorreioVoz() void 
   }

   iPhone "1" --> "1" AparelhoTelefonico : Implementa

   class NavegadorInternet {
     + exibirPagina(String url) void
     + adicionarNovaAba() void
     + atualizarPagina() void
     + pararCarregamento() void
     + zoom() void
   }

   iPhone "1" --> "*" NavegadorInternet : Implementa

   class iPhone {
   }

```
