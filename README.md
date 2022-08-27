# Api Pet Shop

## **Endpoints**

### **Cadastrar **

#### `POST` `/cleinte`

Essa é a rota que será utilizada para cadastrar um novo cliente no sistema.

-   **Requisição**  

    -   name
    -  telefone

#### **Exemplo de requisição**


// POST /cliente
{
    "name": "Daniel Dias Fernandes",
    "telefone": "(11)3576-1485"
}
```
#### `POST` `/animal`

Essa é a rota que permite  cadastrar o animal do cliente realizar no sistema.

-   **Requisição**  

    -   nome
    -   idade
    -   peso
    -   idcliente
   

#### **Exemplo de requisição**


// POST /animal
{

        "nome": "Argo",
        "idade": 12,
        "peso": 30.0,
        "cliente": {
            "idcliente": 10
        }
}
```

#### **Exemplos de resposta**

```
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
