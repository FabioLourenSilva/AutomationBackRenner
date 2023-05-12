Feature: Renner BR Shipping Fron Store

  Background: Coração e criação de order
    Given Cotação no Broker
    And Realiza Criação da order

  Scenario: Entregue total Transportador
     When Aprova Pedido
     And Cria onde Picking
     And Atualiza onda Picking
     And Cria onda Packing
     And Finaliza onda de Packing
     And Informa faturamento do pedido
     And Libera pedido para retirada
     And Entrega orden Cliente
     And Entrega orden Cliente
     Then Consulta dados pedido: ENTREGUE_TOTAL_TRANSPORTADOR


  Scenario: Cancelado não Localizado
    When Aprova Pedido
    And Cria onde Picking
    And Atualiza onda Picking para Cancelado Não Localizado
    Then Consulta dados pedido: CANCELADO_NAO_LOCALIZADO

  Scenario: Cancelamento Commerce
    When Realiza cancelamento do pedido Commerce
    Then Consulta dados pedido: CANCELADO

  Scenario: Reatendimento por Loja Commerce
    When Aprova Pedido
    And Cria onde Picking
    And Atualiza onda Picking
    And Cria onda Packing
    And Finaliza onda de Packing
    And Informa faturamento do pedido
    And Libera pedido para retirada
    And Entrega orden Cliente
    And Entrega orden Cliente
    Then Consulta dados pedido: ENTREGUE_TOTAL_TRANSPORTADOR

  Scenario: Reatendimento por Ecomerce
    When Aprova Pedido
    And Cria onde Picking
    And Atualiza onda Picking
    And Cria onda Packing
    And Finaliza onda de Packing
    And Informa faturamento do pedido
    And Libera pedido para retirada
    And Entrega orden Cliente
    And Entrega orden Cliente
    Then Consulta dados pedido: ENTREGUE_TOTAL_TRANSPORTADOR

  Scenario: Cancelamento Paking
    When Aprova Pedido
    And Cria onde Picking
    And Atualiza onda Picking
    And Cria onda Packing
    And Realiza cancelamento no Paking
    Then Consulta dados pedido: LOCALIZADO_TOTAL

  Scenario: Cancelamento Piking
    When Aprova Pedido
    And Cria onde Picking
    And Realiza cancelamento no Pinking
    Then Consulta dados pedido: NOVO

  Scenario: Realiza devolução cliente para loja
    When Aprova Pedido
    And Cria onde Picking
    And Atualiza onda Picking
    And Cria onda Packing
    And Finaliza onda de Packing
    And Informa faturamento do pedido
    And Libera pedido para retirada
    And Entrega orden Cliente
    And Entrega orden Cliente
    And Realiza devolução na entrega
    Then Consulta dados pedido: DEVOLVIDO_CLIENTE_LOJA

  Scenario: Pendente Geração Nota
    When Aprova Pedido
    And Cria onde Picking
    And Atualiza onda Picking
    And Cria onda Packing
    And Finaliza onda de Packing
    And Torna pedido pendente geração nota no OMS
    Then Consulta dados pedido: PENDENTE_GERACAO_NOTA

  Scenario: Pendente Impressão Nota
    When Aprova Pedido Impressao Nota
    And Cria onde Picking
    And Atualiza onda Picking
    And Cria onda Packing
    And Finaliza onda de Packing
    And Torna pedido pendente impressão nota
    Then Consulta dados pedido: PENDENTE_IMPRESSAO_NOTA

