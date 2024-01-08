# Relatório sobre o Diagrama de Classes da UML

## Introdução
O Diagrama de Classes da UML (Unified Modeling Language) é uma ferramenta gráfica utilizada para representar a estrutura estática de um sistema orientado a objetos. Ele descreve as classes do sistema, seus atributos, métodos e os relacionamentos entre elas.

## Componentes do Diagrama de Classes
O Diagrama de Classes é composto por diversos elementos, que são:

### Classe
Uma classe é a representação de um conceito ou entidade do sistema. Ela possui um nome e pode conter atributos e métodos. As classes são representadas por retângulos no diagrama.

### Atributo
Um atributo é uma característica ou propriedade de uma classe. Ele descreve o estado da classe e é representado por um nome e um tipo de dado. Os atributos são representados dentro do retângulo da classe.

### Método
Um método é uma operação ou comportamento que uma classe pode realizar. Ele define as ações que a classe pode executar e é representado por um nome, parâmetros e um tipo de retorno. Os métodos são representados dentro do retângulo da classe.

### Relacionamento
O relacionamento representa a associação entre duas ou mais classes. Existem diferentes tipos de relacionamentos, como:

- Associação: representa uma relação entre duas classes, indicando que uma classe utiliza ou depende da outra.
- Agregação: representa uma relação de todo-parte entre duas classes, indicando que uma classe é composta por outras classes.
- Composição: é um tipo especial de agregação em que uma classe é composta por outras classes e a existência das partes depende da existência do todo.
- Herança: representa uma relação de especialização entre duas classes, indicando que uma classe herda os atributos e métodos de outra classe.
- Interface: representa um contrato que uma classe deve implementar, definindo os métodos que a classe deve ter.

### Cardinalidade
A cardinalidade define a quantidade de instâncias de uma classe que podem se relacionar com instâncias de outra classe. Ela é representada por números ou símbolos, como:

- 1: indica que uma instância da classe pode se relacionar com apenas uma instância da outra classe.
- 0..1: indica que uma instância da classe pode se relacionar com no máximo uma instância da outra classe.
- 0..*: indica que uma instância da classe pode se relacionar com várias instâncias da outra classe.
- 1..*: indica que uma instância da classe deve se relacionar com pelo menos uma instância da outra classe.

## Conclusão
O Diagrama de Classes da UML é uma ferramenta poderosa para modelar a estrutura de um sistema orientado a objetos. Ele permite visualizar as classes, seus atributos, métodos e os relacionamentos entre elas, facilitando o entendimento e a comunicação entre os membros da equipe de desenvolvimento.

# Estudo de Caso

## Diagrama de classes UML

![diagrama](image.png)

## Explicação

### UML Maior

1. **Cardápio:**
   - Representa uma classe ou objeto chamado "Cardápio".
   - Pode ter muitos "Pratos" associados a ele (multiplicidade "*").

2. **Prato:**
   - Representa uma classe ou objeto chamado "Prato".
   - Está associado a um "Cardápio" (um ou mais "Pratos" podem pertencer a um "Cardápio").
   - Está associado a um "Dia da Semana" de 1 a 7 vezes.

3. **Dia da Semana:**
   - Representa uma classe ou objeto chamado "Dia da Semana".
   - Está associado a um "Prato" (um "Prato" pode estar associado a um "Dia da Semana" específico de 1 a 7 vezes).

4. **Pessoa:**
   - Representa uma classe ou objeto chamado "Pessoa".
   - Está associado a "Cliente" com uma linha, indicando uma associação de 1 (um) lado e sem multiplicidade explícita do lado do "Pessoa".
   - Não possui atributos especificados.

5. **Cliente:**
   - Representa uma classe ou objeto chamado "Cliente".
   - Está associado a "Pessoa" com uma linha, indicando uma associação de * (muitos) do lado do "Cliente" e 1 (um) do lado do "Pessoa".
   - Está associado a "Mesa", "Pedido" e possivelmente outros elementos.
   - Multiplicidade * na ponta associada a "Pessoa", * na ponta associada a "Mesa", sem multiplicidade explícita associada a "Pedido".
   - Possui atributos especificados na entrada e saída do "Cliente".

6. **Mesa:**
   - Representa uma classe ou objeto chamado "Mesa".
   - Está associado a "Cliente" com uma linha, indicando uma associação de * (muitos) do lado da "Mesa" e 1 (um) do lado do "Cliente".
   - Está associado a "Região" com um losango na ponta de "Região".Isso significa que há uma associação entre a classe "Região" e a classe "Mesa". O losango na ponta de "Região" indica que a associação é agregada à classe "Região", sugerindo que a "Região" tem uma coleção de "Mesas". Essa relação pode indicar que as mesas pertencem ou estão associadas a uma região específica do restaurante.
   - Está associado a "Pedido" com uma linha e um 0...1 "servido-em" indicando que uma "Mesa" pode ter no máximo um "Pedido" servido nela, mas pode não ter nenhum.
   - Multiplicidade * na ponta associada a "Cliente", 1 na ponta associada a "Mesa".
   - Não possui atributos especificados.

7. **Região:**
   - Representa uma classe ou objeto chamado "Região".
   - Está associado a "Mesa" como mencionado anteriormente.
   - Está associado a "Garçom" com um losango na ponta de "Região" e 1...* na ponta de "Garçom".

8. **Garçom:**
   - Representa uma classe ou objeto chamado "Garçom".
   - Está associado a "Região" como mencionado anteriormente.
   - Está associado a "Pedido" com um "Colhe" na ponta de "Garçom" e um 0...1, indicando que um "Garçom" pode colher no máximo um "Pedido", mas pode não colher nenhum.
   - Multiplicidade * na ponta associada a "Pedido".
   - Não possui atributos especificados.

9. **Item Pedido:**
   - Representa uma classe ou objeto chamado "Item Pedido".
   - Está associado a "Prato" com 0...1 no lado do "Prato" e * no lado do "Item Pedido".
   - Está associado a "Pedido" com um losango preto na ponta de "Pedido", indicando composição (um "Item Pedido" é parte de um "Pedido").
   - Multiplicidade 1...* na ponta associada a "Item Pedido".
   - Possui atributos "quantidade", "devolvido" e "observação".

10. **Pedido:**
   - Representa uma classe ou objeto chamado "Pedido".
   - Está associado a "Cliente", "Mesa", "Garçom", "Prato", "Domicílio", "Nota Fiscal" e possivelmente outros elementos.
   - Está associado a "Telefonista" sem forma específica na ponta do "Telefonista", indicando uma associação direta.
   - Está associado a "Domicílio" com 0...1 na ponta de "Domicílio" e "destino" como um atributo, sugerindo que um pedido pode estar associado a, no máximo, um endereço de domicílio.
   - Está associado a "Nota Fiscal" com 1...* na ponta de "Nota Fiscal", indicando que um pedido pode ter uma ou mais notas fiscais associadas.

11. **Telefonista:**
   - Representa uma classe ou objeto chamado "Telefonista".
   - Está associado a "Pedido" com uma linha, indicando uma associação direta sem multiplicidade explícita. A forma na ponta do "Pedido" não foi especificada.

12. **Nota Fiscal:**
   - Representa uma classe ou objeto chamado "Nota Fiscal".
   - Está associado a "Pedido" com uma linha, indicando uma associação direta sem multiplicidade explícita. A forma na ponta do "Pedido" não foi especificada.
   - Está associado a "Pagamento" com um losango vazio na ponta de "Nota Fiscal" e 0...1 na ponta de "Pagamento", indicando que uma nota fiscal pode estar associada a, no máximo, um pagamento.

13. **Pagamento:**
   - Representa uma classe ou objeto chamado "Pagamento".
   - Está associado a "Dinheiro", "Cartão Crédito" e "Cheque" com uma seta apontando para "Pagamento", indicando uma possível hierarquia de herança entre essas classes.

14. **Dinheiro:**
   - Mencionado anteriormente como uma forma de pagamento.

15. **Cartão Crédito:**
   - Mencionado anteriormente como uma forma de pagamento.

16. **Cheque:**
   - Mencionado anteriormente como uma forma de pagamento.

17. **Domicílio:**
   - Representa uma classe ou objeto chamado "Domicílio".
   - Está associado a "Pedido" com uma linha, indicando uma associação direta sem multiplicidade explícita. A forma na ponta do "Pedido" não foi especificada.
   - Está associado a "Rota" com um losango vazio na ponta de "Rota".

18. **Rota:**
   - Representa uma classe ou objeto chamado "Rota".
   - Está associado a "Domicílio" com um losango vazio na ponta de "Rota", indicando uma associação agregada ou composição, sugerindo que "Rota" está diretamente relacionado a "Domicílio".

19. **Entregador:**
   - Representa uma classe ou objeto chamado "Entregador".
   - Está associado a "Rota" com uma linha, indicando uma associação direta sem multiplicidade explícita. A forma na ponta de "Rota" não foi especificada.

### UML Menor

1. **Ordem:** Ligado a Trabalhador 2 vezes, uma "Emitida-por" e outra "Executada-por"
2. **Trabalhador:** Ligado a Ordem como descrito, ligado a Garçom com uma Herança e ligado a si próprio com * em uma ponta e 0...1 na outra ponta, essa ligação tem uma observação de "gerente"
3. **Garçom:** Ligado à Trabalhador como descrito anteriormente


**Observação:** Há outros tipos de trabalhadores. Cada um deles herda de Trabalhador
