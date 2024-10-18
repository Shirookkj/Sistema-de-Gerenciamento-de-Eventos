# Sistema de Gerenciamento de Eventos

Este projeto é um *Sistema de Gerenciamento de Eventos* em Java que permite o cadastro de eventos, inscrições e cancelamentos de participantes, verificação de lotação e geração de relatórios. Ele foi desenvolvido utilizando conceitos de *Programação Orientada a Objetos (POO)*.
Grupo: Ana Pellegrino, Artur Uchôa, André Mota, Isabel Lugon e João Magalhães.

## Funcionalidades

- *Cadastrar Eventos:* Permite criar novos eventos com informações como nome, local, capacidade máxima e data.
- *Inscrição em Eventos:* Os participantes podem se inscrever nos eventos existentes.
- *Cancelamento de Inscrição:* Participantes podem cancelar sua inscrição em eventos através do e-mail cadastrado.
- *Verificar Lotação:* O sistema verifica se o evento atingiu sua capacidade máxima.
- *Geração de Relatórios:* Relatórios de eventos são gerados com informações sobre o local, data e total de participantes inscritos.

## Estrutura do Projeto

### 1. SistemaEventos.java
- Arquivo principal que gerencia o fluxo do sistema.
- Apresenta um *menu interativo* para escolher opções como:
  - Cadastro de evento.
  - Inscrição de participantes.
  - Cancelamento de inscrição.
  - Verificação de lotação.
  - Geração de relatórios.
- Usa as classes Evento, Local e Participante para operar sobre eventos.

### 2. Evento.java
- Classe que representa um evento.
- Armazena o nome do evento, o local (instância da classe Local), a lista de participantes e a data.
- Principais métodos:
  - *Cadastrar Participante:* Adiciona um participante ao evento.
  - *Cancelar Inscrição:* Remove um participante com base no e-mail.
  - *Verificar Lotação:* Verifica se o evento atingiu a capacidade.
  - *Gerar Relatório:* Gera um relatório com os detalhes do evento e participantes.

### 3. Local.java
- Representa o local onde o evento será realizado.
- Armazena o nome do local, endereço e capacidade máxima de participantes.
- Usado dentro da classe Evento.

### 4. Participante.java
- Representa um participante de um evento.
- Armazena o nome e o e-mail do participante (utilizado para cadastro e cancelamento).


# Como faço para verificar a lotaçãodo evento?
- Identificar eventos que estão quase lotados pode ajudar na tomada de decisões para promover o evento ou até mesmo ajustar a logística, como ampliação de capacidade ou mudança de local.

# Como faço para cancelar uma inscrição?
- Analisar os locais mais requisitados para a realização de eventos pode guiar decisões sobre parcerias, otimização de espaço ou até mesmo a abertura de novos locais para eventos futuros.
