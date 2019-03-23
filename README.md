# order-service
### trabalho materia microservices FIAP

#### endpoints

#####POST - localhost:8080/order

{
    "name": "Name",
    "email": "teste@teste.com",
    "shippingAddress": "Rua teste teste",
    "orderItemDTOS": [
        {
            "id": 1,
            "name": "Item 1",
            "price": 10
        },
        {
            "id": 2,
            "name": "Item 2",
            "price": 20
        }
    ],
    "totalPrice": 10,
    "paymentDTO": {
        "id": 1,
        "idTransaction": "aaaa-das23-343243-12345677",
        "cardExpirationDate": "2019-03-23",
        "cardNumber": 1232132145,
        "cardFlag": "VISA"
    },
    "orderDate": "2019-03-23",
    "status": "Ativo"
}



#####PUT - localhost:8080/order/1

{
    "name": "Name",
    "email": "teste@teste.com",
    "shippingAddress": "Rua teste teste",
    "orderItemDTOS": [
        {
            "id": 1,
            "name": "Item 1",
            "price": 10
        },
        {
            "id": 2,
            "name": "Item 3",
            "price": 20
        }
    ],
    "totalPrice": 10,
    "paymentDTO": {
        "id": 1,
        "idTransaction": "aaaa-das23-343243-12345677",
        "cardExpirationDate": "2019-03-23",
        "cardNumber": 1232132145,
        "cardFlag": "VISA"
    },
    "orderDate": "2019-03-23",
    "status": "Ativo"
}

#####GET - localhost:8080/order/1

#####DELETE - localhost:8080/order/1