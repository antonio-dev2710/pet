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
    "nome": "Daniel Dias Fernandes",
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
