# sig-sorveterias
 Sistema de gerenciamento para sorveterias (EXA805 - 2023.2 - UEFS)

### Conhecimentos adquiridos

- Classes e Objetos
- Interface
- Classe Abstrata
- Herança
- Padrão de Projeto DAO (Data Access Object)
- Padrão de Projeto Singleton
- Diagrama de Classes

### Diagrama de Classes

![Diagrama de Classe](/doc/sig_sorveterias.png)

### Requisitos do sistema
1. **Cadastro de Produtos:** Permite adicionar os diferentes sabores de sorvetes, acompanhamentos, tamanhos, preços e outros detalhes relevantes.
2. **Gerenciamento de Estoque:** Acompanha o nível de estoque de cada sabor de sorvete, alertando quando os níveis estiverem baixos e precisando de reposição.
3. **Pedidos e Vendas:** Permite registrar pedidos de clientes, calcular o valor total da compra, aplicar descontos se necessário e imprimir recibos.
4. **Ponto de Venda (PDV):** Uma interface amigável para os funcionários registrarem pedidos, aplicarem pagamentos e emitirem recibos.
5. **Gestão de Clientes:** Possibilita cadastrar clientes, acompanhar suas preferências, histórico de compras e oferecer programas de fidelidade.
6. **Controle de Finanças:** Acompanha as receitas diárias, semanais e mensais, bem como despesas, permitindo analisar a lucratividade do negócio.
7. **Relatórios e Análises:** Fornece relatórios detalhados sobre vendas, estoque, produtos mais vendidos, desempenho financeiro, entre outros.
8. **Gestão de Funcionários:** Permite cadastrar funcionários, atribuir funções, monitorar horários de trabalho e calcular salários.
9. **Integração de Pagamentos:** Integração com sistemas de pagamento para aceitar cartões de crédito, débito e pagamentos digitais.
10. **Controle de Produção:** Acompanha a produção de sorvetes, registrando os ingredientes utilizados e o rendimento de cada lote.
11. **Agendamento de Eventos e Festas:** Se a sorveteria oferecer serviços para eventos, um recurso de agendamento pode ser útil para acompanhar pedidos especiais.
12. **Gestão de Marketing:** Permite criar promoções, cupons e programas de fidelidade para atrair mais clientes.

### Estrutura de diretórios para desenvolvimento
- [model](/src/main/java/com/uefs/sigsorveterias/model): modelos de dados do sistema
- [dao](/src/main/java/com/uefs/sigsorveterias/dao): implementação do padrão DAO (Data Access Object)
- *controller (em breve...):*
- *view (em breve...):*
## Desenvolvimento

### Instalação

Faça o download do repositório

```
git clone https://github.com/rafatosta/sig-sorveterias.git
```

E abra o projeto no IntelliJ IDEA e aguarde o download das dependências.

## Executando os testes de unidade (Em breve... )

Para rodar os testes de unidade execute o arquivo [GATestSuit.java](...GATestSuit.java)

## Construído com

* [IntelliJ IDEA Community](https://www.jetbrains.com/idea/download/) - IDE utilizado para codificação
* [Maven](https://maven.apache.org/) - Gerente de Dependência
* [JavaFX](https://openjfx.io/) - Framework para o front-end
* [Scene Builder](https://gluonhq.com/products/scene-builder/) - Para construção das telas