# 🐯 Lasai - API de Restaurante

API REST desenvolvida em **Java com Spring Boot** para gerenciar o cardápio do restaurante **Lasai**. O projeto permite **listar** (GET) e **cadastrar** (POST) itens do cardápio, e acompanha um front-end simples em HTML para consumir a API.

Projeto criado para a atividade: *"Criar uma API com os métodos GET e POST de um tema de sua preferência"*.

## Tecnologias

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- Jakarta Persistence (JPA)
- Banco de dados relacional (configurado no `application.properties`)
- HTML, CSS e JavaScript (front-end)

## Estrutura do projeto

```
com.dest1.lasai
├── controllers   -> LasaiController (rotas da API)
├── entities      -> Lasai (entidade) e Categorias (enum)
└── repositories  -> LasaiRepository (acesso ao banco)
```

## Modelo de dados

**Lasai** (item do cardápio)

| Campo       | Tipo       | Descrição                    |
|-------------|------------|------------------------------|
| id          | Integer    | Gerado automaticamente       |
| nome        | String     | Nome do item                 |
| descricao   | String     | Descrição do item            |
| preco       | Double     | Preço em reais               |
| categorias  | Categorias | Categoria do item (enum)     |
| vendedor    | String     | Nome do vendedor             |

**Categorias disponíveis:** `Sobremesa`, `Japonesa`, `Bebida`, `Marmita`, `Indiana`, `Brasileira`

## Endpoints

Base URL: `http://localhost:8080/restaurante`

### GET /restaurante
Retorna a lista de todos os itens cadastrados.

**Resposta (200 OK):**
```json
[
  {
    "id": 1,
    "nome": "Brigadeiro",
    "descricao": "Doce de chocolate",
    "preco": 5.5,
    "categorias": "Sobremesa",
    "vendedor": "Maria"
  }
]
```

### POST /restaurante
Cadastra um novo item no cardápio.

**Corpo da requisição:**
```json
{
  "nome": "Brigadeiro",
  "descricao": "Doce de chocolate",
  "preco": 5.5,
  "categorias": "Sobremesa",
  "vendedor": "Maria"
}
```

**Resposta:** o item criado, já com o `id` gerado.

## Como executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/SEU-USUARIO/SEU-REPOSITORIO.git
   ```
2. Configure o banco de dados no `src/main/resources/application.properties`.
3. Execute a aplicação pela IDE ou com:
   ```bash
   ./mvnw spring-boot:run
   ```
4. A API ficará disponível em `http://localhost:8080/restaurante`.

## Front-end

O arquivo `lasai-front.html` é uma interface para consumir a API: lista os itens em cards, permite buscar, filtrar por categoria e cadastrar novos itens. Basta abrir o arquivo no navegador com a API rodando.

> Para o front funcionar, o controller precisa do `@CrossOrigin(origins = "*")`.

## Teste rápido com cURL

```bash
curl -X POST http://localhost:8080/restaurante \
  -H "Content-Type: application/json" \
  -d '{"nome":"Brigadeiro","descricao":"Doce de chocolate","preco":5.5,"categorias":"Sobremesa","vendedor":"Maria"}'

curl http://localhost:8080/restaurante
```

## Autor

Desenvolvido por **SEU NOME**.
