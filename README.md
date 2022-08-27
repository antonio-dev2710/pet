# api_descarteBem

## **Endpoints**

### **Cadastrar usuário**

#### `POST` `/user`

Essa é a rota que será utilizada para cadastrar um novo usuario no sistema.

-   **Requisição**  

    -   name
    -   email
    -   cpf
    -   password
    -   address

#### **Exemplo de requisição**

```javascript
// POST /usuario
{
    "name": "José",
    "email": "jose@email.com",
    "cpf": "12345678910",
    "password": "12345senha",
    "address": "ST. D Norte QND 47, Brasília, DF, 70297-400"
}
```
### **Serviço de um Pet Shop**

#### `POST` `/login`

Essa é a rota que permite o usuario cadastrado realizar o login no sistema.

-   **Requisição**  

    -   email
    -   password

#### **Exemplo de requisição**

```javascript
// POST /login
{
    "email": "jose@email.com",
    "password": "12345senha"
}
```

#### **Exemplos de resposta**

```javascript
// HTTP Status 200
{
    "user": {
        "id": "2532e9e7-dcfc-4a03-8b42-75c35b4d1c44",
        "name": "José",
        "email": "jose@email.com",
		"address": "ST. D Norte QND 47, Brasília, DF, 70297-400"
    },
    "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MiwiaWF0IjoxNjIzMjQ5NjIxLCJleHAiOjE2MjMyNzg0MjF9.KLR9t7m_JQJfpuRv9_8H2-XJ92TSjKhGPxJXVfX6wBI"
}
```
