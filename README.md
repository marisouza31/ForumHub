# ForumHub
Challenge da Alura 💪💙

**Desafio proposto pela Alura:**

Construir uma API REST construída para gerenciar tópicos e discussões em fóruns. O objetivo é praticar  os conceitos de desenvolvimento backend,
arquitetura REST e integrações com banco de dados.

# :hammer: Funcionalidades do projeto
- `Funcionalidade 1`:Permite criar tópicos com título, mensagem, autor e curso. 
- `Funcionalidade 2`:Endpoint para listar todos os tópicos cadastrados.
- `Funcionalidade 3`:Endpoint para recuperar informações detalhadas de um tópico pelo seu ID.
- `Funcionalidade 4`:Endpoint para excluir um tópico utilizando o ID como base de busca.
- `Funcionalidade 5`:Garante a segurança da API com autenticação baseada em tokens.

<div align="center">
<h4>Tecnologias utilizadas:</h4>

  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/intellij/intellij-original.svg" height="40" width="40"/> 
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/java/java-original-wordmark.svg" height="40" width="40" />
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/spring/spring-original.svg" height="40" width="40" />" 
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/postgresql/postgresql-original.svg" height="40" width="40" />
</div>

**Rotas do projeto:**

1 - Cadastro de Usuário:

```json
{
  "nome": "nome do usuario",
  "email": "email do usuario",
  "senha": "senha do usuario"
}
```
2 - Autenticação JWT:

```json
  {
    "email": "email do usuario",
    "senha": "senha do usuario"
  }
```
3 - Cadastro de Tópicos:

```json
 {
     "titulo": "Título do tópico",
     "mensagem": "Mensagem do tópico",
     "autor": "Nome do autor",
     "curso": "Nome do curso"
 }
```
4 - Listagem de Tópicos:

```json
   "content": [
         {
             "id": 1,
             "titulo": "Dúvida Spring Boot",
             "mensagem": "Como implementar validação?",
             "dataCriacao": "16/01/2025 13:11",
             "status": "NAO_RESPONDIDO",
             "autor": "fern",
             "curso": "Spring Boot"
         },
         {
             "id": 2,
             "titulo": "Dúvidas sobre supressão de mana",
             "mensagem": "depois de 2 mil anos fazendo isso, percebi que não estou mais aguentando suprimir minha mana",
             "dataCriacao": "16/01/2025 13:16",
             "status": "NAO_RESPONDIDO",
             "autor": "frieren",
             "curso": "Magia ancestral"
         }
    ]
```
5 - Detalhes de um Tópico:

```json
 {
   "id": 2,
   "titulo": "Dúvidas sobre supressão de mana",
   "mensagem": "depois de 2 mil anos fazendo isso, percebi que não estou mais aguentando suprimir minha mana",
   "dataCriacao": "16/01/2025 13:16",
   "status": "NAO_RESPONDIDO",
   "autor": "frieren",
   "curso": "Magia ancestral"
 }
```
6 - Atualizar um Tópico:

```json
 {
   "id": "id_topico",
   "titulo": "Alterar título do tópico",
   "mensagem": "Alterar mensagem do tópico",
   "curso": "Alterar nome do curso"
 }
```
7 - Exclusão de um Tópico:

Endpoint: /topicos/{id}

Método: DELETE

Resposta: 204 No Content se o tópico for excluído com sucesso.

  ##
<div align="center">
  <h4>Contato</h4>
  </div>

   Obrigada por visitar o meu repositório, caso queira se conectar comigo, estou disponíveil através do e-mail e LinkedIn!

  **Mariana Ocireu:**

[![Linkedin](https://img.shields.io/badge/LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/marianaociz/)
[![Gmail](https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white)](mailto:marianaocireu@gmail.com)

