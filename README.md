# Desafio POO - iPhone

Este projeto tem como objetivo praticar os conceitos de Programação Orientada a Objetos (POO) em Java, modelando as funcionalidades básicas de um iPhone conforme demonstrado no vídeo de lançamento de 2007.

## 🔍 Funcionalidades Modeladas

### 📱 Reprodutor Musical
- `tocar()`
- `pausar()`
- `selecionarMusica(String musica)`

### ☎️ Aparelho Telefônico
- `ligar(String numero)`
- `atender()`
- `iniciarCorreioVoz()`

### 🌐 Navegador na Internet
- `exibirPagina(String url)`
- `adicionarNovaAba()`
- `atualizarPagina()`

## 📦 Estrutura do Projeto

- `Iphone.java`: Classe principal que implementa todas as funcionalidades.
- `ReprodutorMusical.java`: Interface com métodos do player de música.
- `AparelhoTelefonico.java`: Interface com métodos de telefonia.
- `NavegadorInternet.java`: Interface com métodos de navegação.
- `Main.java`: Classe com o método `main` para testar as funcionalidades.

## 📌 UML - Diagrama de Classes

```mermaid
classDiagram
    class Iphone {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class ReprodutorMusical {
        <<interface>>
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        <<interface>>
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        <<interface>>
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    Iphone ..|> ReprodutorMusical
    Iphone ..|> AparelhoTelefonico
    Iphone ..|> NavegadorInternet
