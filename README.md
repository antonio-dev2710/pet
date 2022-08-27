# Api Pet Shop

## **Endpoints**

### **Cadastrar **

#### `POST` `/cliennte`

Essa é a rota que será utilizada para cadastrar um novo cliente no sistema.

-   **Requisição**  

    -   name
    -  telefone

#### **Exemplo de requisição**


// POST /cliente
{
    "nome": "Daniel Dias Fernandes",
    "telefone": "(11)3576-1485"
}
```
#### `POST` `/animal`

Essa é a rota que permite cadastrar o animal do cliente no sistema.

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
            "idcliente": 12
        }
}
```
## **ATENÇÃO**: A baixo segue um exemplo de resposta do cliente sem o animal cadastrado e  outro após o animal do cliente ser cadastrado.

#### **Exemplos de resposta**

```
// HTTP Status 200

#### **Exemplos de resposta de registro do cadrastro do cliente**
   {
    "idcliente": 12,
    "nome": "Daniel Dias Fernandes",
    "telefone": "(11)3576-1485",
    "listAnimais": null
}
// HTTP Status 200
```
// HTTP Status 200
#### **Exemplos de resposta do animal cadastrado referente ao id do clinte**
 {
    "idanimal": 8,
    "nome": "Argo",
    "idade": 9,
    "peso": 30.0,
    "cliente": {
        "idcliente": 12,
        "nome": null,
        "telefone": null
    }
}
```
### **Retortar todos os cliente**
#### `GET` `/cliente`

Rota utilizada para demonstrar todos os clientes cadastrados no sistema.

-   **Requisição**   
    O corpo (body) deverá possuir um objeto com as seguintes propriedades (respeitando estes nomes):

    -   nome
    -   telefone
    - listAnimais

#### **Exemplo de requisição**

```
// GET /cliente

```

#### **Exemplos de resposta**

```
[
    {
        "idcliente": 1,
        "nome": "Antonio Alves",
        "telefone": "(92)3151-3578",
        "listAnimais": []
    },
    {
        "idcliente": 2,
        "nome": "Victor Pereira Oliveira",
        "telefone": "(41) 2357-3265",
        "listAnimais": [
            {
                "idanimal": 3,
                "nome": "Chrono",
                "idade": 10,
                "peso": 20.0
            }
        ]
    },
    {
        "idcliente": 7,
        "nome": "Victor Pereira Oliveira",
        "telefone": "(67) 2787-8138",
        "listAnimais": []
    }
    ......

```
### **Retortar um cliente**
#### `GET` `/cliente/[idcliente];`

Essa é a rota que será utilizada para fazer a busca de um cliente no sistema através do número do seu id.

// GET /cliente/12

```

#### **Exemplos de resposta**
{
    "idcliente": 12,
    "nome": "Daniel Dias Fernandes",
    "telefone": "(11)3576-1485",
    "listAnimais": [
        {
            "idanimal": 8,
            "nome": "Argo",
            "idade": 9,
            "peso": 30.0
        }
    ]
}

