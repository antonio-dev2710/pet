# API - Pet Shop

Aplicação REST API que permite o cadastro de novos clientes e de animais, incluindo dados pessoais, dados para contato, nome do animal, peso, idade e controle de serviço adiquiro pelos clientes.



## **Endpoints**

### **Cadastrar  um clinete e um animal**

#### `POST` `/cliennte`

Essa é a rota que será utilizada para cadastrar um novo cliente no sistema.

-   **Requisição**  

    -   name
    -  telefone
#### **Exemplo de requisição**

```


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

```
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

## **ATENÇÃO**: A baixo segue um exemplo de resposta do cliente sem o animal cadastrado e  outro exemplo  do animal cadastrado com o id do cliente.

#### **Exemplos de resposta**

```
// HTTP Status 200
#### **Exemplo de resposta de registro do cadrastro do cliente**
   {
    "idcliente": 12,
    "nome": "Daniel Dias Fernandes",
    "telefone": "(11)3576-1485",
    "listAnimais": null
}

```
```
// HTTP Status 200
#### **Exemplo de resposta do registro do animal*
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
```
### **Atualizar um cliente**
#### `PUT` `/cliente`

Essa é a rota que será utilizada para editar um cliente no sistema através do id.

-   **Requisição**  
    Sem parâmetros de rota ou de query.  
    O corpo (body) deverá possuir um objeto com as seguintes propriedades (respeitando estes nomes):

    -   idcliente
    -   nome
    -   telefone

#### **Exemplo de requisição**

```
// PUT /cliente
{
  
        "idcliente": 1,
        "nome": "Antonio Alves",
        "telefone": "(92)3151-3578",
        "listAnimais": []
    
      
}
```

#### **Exemplos de resposta**

```
{
     
    "idcliente": 1,
    "nome": "Antonio Alves",
    "telefone": "(85) 3012-1129",
    "listAnimais": null

}
```
### **Deletar um cliente**

#### `DELETE` `/cliente/[idcliente]`

Rota utilizada para deletar um cliente no sistema.

-   **Requisição**  
    O parâmetro de rota será o id do Cliente.  
    

#### **Exemplo de requisição**

```
// DELETE /cliente/7

```

#### **Exemplos de resposta**

```
// HTTP Status 200 
{
   7
}
- Retorna o id do clinete que foi deletado do sistema
```
### **Pesquisar todas as ordens de serviço relaziada pelos clientes**
#### `GET` `/servico`

Essa é a rota que será utilizada para retornar todos os serviços relalizados no Pet Shop.

-   **Requisição**  
    Sem parâmetros de query.  

#### **Exemplo de requisição**

```
// GET /servico

```

#### **Exemplos de resposta**

```
[
    {
        "idordem_servico": 1,
        "valor": 150.0,
        "entrada": "10:00",
        "saida": "11:00",
        "cliente": {
            "idcliente": 9,
            "nome": "Cauã Sousa Santos",
            "telefone": "(96) 3505-8354",
            "listAnimais": [
                {
                    "idanimal": 2,
                    "nome": "Flea",
                    "idade": 2,
                    "peso": 5.35
                }
            ]
        }
    },
    {
        "idordem_servico": 2,
        "valor": 200.0,
        "entrada": "16:00",
        "saida": "17:45",
        "cliente": {
            "idcliente": 8,
            "nome": "Rodrigo Cardoso Martins",
            "telefone": "(61) 2273-2700",
            "listAnimais": [
                {
                    "idanimal": 1,
                    "nome": "Marlin",
                    "idade": 5,
                    "peso": 10.0
                }
            ]
        }
    }
  
```

