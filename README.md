# SpringSecurityMongoDB

Projeto funcional de autenticação usando spring security e MongoDB.


Softwares

 - Docker (rodar o MondoDB)
 - Mongo Compass <https://www.mongodb.com/try/download/compass>
 - Java 11



Command Docker para rodar o MongoDB <https://hub.docker.com/r/bitnami/mongodb>

docker run -v ~/docker --name mongodb -p 27017:27017 -e MONGODB_USERNAME=user -e MONGODB_PASSWORD=1234 -e MONGODB_DATABASE=springsecuritymongodb -e ALLOW_EMPTY_PASSWORD=yes bitnami/mongodb:latest


As collections estão disponíveis em ~\resources\ nos arquivos roles.json e users.json. Importa-los no MongoDB.


# Testes

acessar http://localhost:8080/welcome

Username: admin@admin.com
Password: 1234



