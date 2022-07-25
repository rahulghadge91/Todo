Todo App


 User	Todo’s


1)	Create / Signup User
POST http://localhost:8080/api/user/signup
RequestBody
{
    "name":"User",
    "username":"user@gmail.com",
    "email":"user@gmail.com",
    "password":"abc"
}

Response  - 
HTTP status code 200  
Message - User registered successfullyg

2)	User Login 
POST http://localhost:8080/api/users/signin
Request Body
{
    "usernameOrEmail":"user@gmail.com",
    "password":"abc"
}

Response:
HTTP status code -200
{
    "userId": 3,
    "name": "User",
    "username": "user@gmail.com",
    "email": "user@gmail.com",
    "password": "$2a$10$zJrpbm9t/pwEBnPCcy0I2OArpBF45pk.l.4hbHI9yzzzUEGVpztKC",
    "roles": [
        {
            "id": 1,
            "name": "ROLE_ADMIN"
        }
    ],
    "todos": []
}




3)	Create user todo task

POST http://localhost:8080/api/user/{userId}/todo   => http://localhost:8080/api/user/3/todo
Request :
{
    "task":"Learn Java",
    "description":"Learn Java programing",
    "targetDate":"2022-08-10",
    "status":0
}


Response 200
{
    "id": 3,
    "task": Learn Java,
    "description": "Learn Java programing",
    "targetDate": "2022-08-10",
    "status": false,
    "userId": 1
}





4)	Retrieve user todo task

GET  http://localhost:8080//api/user/{userId}/todos

e.g. http://localhost:8080/api/user/3/todos
Response 200

[
    {
        "id": 3,
        "task": “Java”,
        "description": "Learn Java programing",
        "targetDate": "2022-08-10",
        "status": false,
        "userId": 1
    }
]





5)	 update todo 
PUT http://localhost:8080/api/todo/{id}  -> http://localhost:8080/api/todo/7
RequestBody = {
    "task": "Learn Java",
    "description": "Learn Java programing",
    "targetDate": "2022-07-15",
    "status": 1
}


Response status OK
{
    "id": 7,
    "task": "Learn Java",
    "description": "Leanr Java programing",
    "targetDate": "2022-07-15",
    "status": true,
    "userId": 4
}


6)	Delete todo
http://localhost:8080/api/todo/6

response –200  OK

