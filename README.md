# dscommerce

## 🛠 Estrutura do projeto

<a href="#-Estrutura-do-projeto">Visão geral do sistema</a>&nbsp;&nbsp;|&nbsp;&nbsp;
O sistema deve manter um cadastro de usuário, produtos e suas categorias. Cada
usuário possui nome, email, telefone, data de nascimento e uma senha de acesso. Os
dados dos produtos são: nome, descrição, preço e imagem. O sistema deve apresentar
um catálogo de produtos, os quais podem ser filtrados pelo nome do produto. A partir
desse catálogo, o usuário pode selecionar um produto para ver seus detalhes e para
decidir se o adiciona a um carrinho de compras. O usuário pode incluir e remover itens
do carrinho de compra, bem como alterar as quantidades de cada item. Uma vez que o
usuário decida encerrar o pedido, o pedido deve então ser salvo no sistema com o status
de "aguardando pagamento". Os dados de um pedido são: instante em que ele foi salvo,
status, e uma lista de itens, onde cada item se refere a um produto e sua quantidade no
pedido. O status de um pedido pode ser: aguardando pagamento, pago, enviado,
entregue e cancelado. Quando o usuário paga por um pedido, o instante do pagamento
deve ser registrado. Os usuários do sistema podem ser clientes ou administradores,
sendo que todo usuário cadastrado por padrão é cliente. Usuários não identificados
podem se cadastrar no sistema, navegar no catálogo de produtos e no carrinho de
compras. Clientes podem atualizar seu cadastro no sistema, registrar pedidos e visualizar
seus próprios pedidos. Usuários administradores tem acesso à área administrativa onde
pode acessar os cadastros de usuários, produtos e categorias. 

## 💻 ✔ Grade Curricular

<a href="#-Grade-Curricular">Componentes e injeção de dependência</a>&nbsp;&nbsp;|&nbsp;&nbsp;
  * Preparação de ambiente
  * Sistema e componentes
  * Inversão de controle e injeção de dependência
  * Trocando a dependência sem abrir o componente pai
  * Frameworks
  * Criação de projeto Spring Boot
  * Implementação de componentes no Spring Boot
  * DESAFIO: Componentes e Injeção de Dependência

<a href="#-Grade-Curricular">Modelo de Domínio e ORM</a>&nbsp;&nbsp;|&nbsp;&nbsp;
  * Revisão de Álgebra Relacional e SQL
  * Super revisão de OO e SQL com Java e JDBC
  * Nivelamento ORM - JPA e Hibernate
  * Documento de requisitos do sistema DSCommerce
  * Criando o projeto Spring Boot
  * Entidade User, banco H2
  * Order, Enum, relacionamento muitos-para-um
  * Payment, relacionamento um-para-um
  * Muitos-para-muitos, column unique e text
  * Muitos-para-muitos com classe de associação PARTE 1
  * Muitos-para-muitos com classe de associação PARTE 2
  * Seeding da base de dados
  * DESAFIO: Modelo de domínio e ORM

<a href="#-Grade-Curricular">API REST, camadas, CRUD, exceções, validações</a>&nbsp;&nbsp;|&nbsp;&nbsp;
  * O que é uma API REST
  * Recursos, URL, parâmetros de consulta e de rota
  * Padrões de URL, verbos HTTP, códigos de resposta
  * Padrão camadas
  * Acessando API
  * Repository
  * Criando DTO e estruturando camadas
  * Dica da biblioteca ModelMapper para DTO
  * CRUD
  * Busca paginada
  * Inserção com POST
  * Customizando resposta com ResponseEntity
  * Atualização com PUT
  * Deleção com DELETE
  * Criando exceções de serviço customizadas
  * Tratando exceção com resposta customizada
  * Validação com Bean Validation
  * Customizando a resposta da validação
  * DESAFIO: CRUD de clientes

<a href="#-Grade-Curricular">JPA, consultas SQL e JPQL</a>&nbsp;&nbsp;|&nbsp;&nbsp;
  * Sessão JPA e estados de entidades
  * Salvando entidade associada para um
  * Salvando entidades associadas para muitos
  * Evitando degradação de performance
  * Carregamento EAGER e LAZY
  * Analisando o carregamento lazy de entidades
  * Alterando o atributo fetch dos relacionamentos
  * Otimizando consultas com a cláusula JOIN FETCH
  * Entendendo Transactional e open-in-view
  * Consultas com Query Methods
  * Introdução sobre JPQL
  * Polêmica vale a pena especializar na JPQL
  * Preparando para os estudos de caso de consultas
  * Estudo de caso URI 2602: consulta simples
  * Estudo de caso URI 2611: INNER JOIN
  * Estudo de caso URI 2621: BETWEEN LIKE
  * Estudo de caso URI 2609: GROUP BY
  * Estudo de caso URI 2737: UNION ALL, LEFT JOIN
  * Estudo de caso URI 2990: NOT IN
  * Estudo de caso: DSCommerce consulta de produtos por nome
  * DESAFIO: Consulta vendas

<a href="#-Grade-Curricular">Login e controle de acesso</a>&nbsp;&nbsp;|&nbsp;&nbsp;
  * Ideia geral do login e controle de acesso
  * Visão geral do OAuth2
  * Login, credenciais e JWT
  * Preparando projeto com bibliotecas
  * Modelo de dados User e Role
  * UserDetails, GrantedAuthority, UserDetailsService
  * Armazenamento da senha codificada com BCrypt
  * Checklist do OAuth2 com JWT no Spring Boot
  * Requisição de login no Postman
  * Deixando o Postman top
  * Acessando recursos protegidos
  * Controle de acesso aos endpoints
  * Variáveis de ambiente no projeto
  * Configuração de CORS
  * Obtendo usuário logado
  * Controle de acesso programático self ou admin
  * Endpoint para buscar categorias
  * DESAFIO: Projeto Spring Boot estruturado
