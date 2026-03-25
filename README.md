Lojinha Online

 Descrição
Simulação de um sistema de e-commerce baseado em arquitetura cliente-servidor monolítica.

 Arquitetura
- Aplicação única (monolito)
- Separação em camadas (model, service, singleton)

 Diagramas
 Diagrama de Atividades
<img width="700" height="730" alt="diagramadeatividade drawio" src="https://github.com/user-attachments/assets/d4910cd1-dce6-4972-bf0c-2dd2e03fc313" />


 Diagrama DER
<img width="721" height="370" alt="lojinha DER drawio" src="https://github.com/user-attachments/assets/70e982ca-1c85-469c-8f09-2838fef969fd" />

 Funcionalidades
- Identificação de cliente
- Listagem de produtos
- Criação de pedidos
- Processamento de pagamento

 Padrão Singleton
O serviço de pagamento foi implementado com Singleton para garantir apenas uma instância durante a execução.

JUSTIFICATIVA 
O padrão Singleton foi utilizado para garantir que exista apenas uma instância do serviço de pagamento durante toda a execução do sistema.
Isso simula um cenário real onde há apenas uma conexão centralizada com o gateway de pagamento, evitando múltiplas conexões desnecessárias e garantindo consistência no processamento.

- Evita múltiplas conexões com o gateway
- Simula serviço externo centralizado
- Mantém consistência no processamento

 Decisões Arquiteturais
- Simplicidade para fins didáticos
- Separação de responsabilidades
- Simulação de pagamento com retorno aleatório
