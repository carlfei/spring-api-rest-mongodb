Para arrancar el docker:

docker run --rm -p 27017:27017 --name <container> -e MONGO_INITDB_ROOT_USERNAME=admin 
-e MONGO_INITDB_ROOT_PASSWORD=123 mongo


    te conectas a mongo con la uri del properties:
            mongodb://admin:123@127.0.0.1:27017/admin
                    como usuario: admin, pass: 123, BD: admin

la url del openapi -->  http://localhost:8080/swagger-ui/index.html

# spring-api-rest mongodb

![Captura desde 2023-05-09 11-43-30](https://user-images.githubusercontent.com/49040356/237060211-9ce78dde-340f-4783-b8fa-da86d364dc44.png)

![dia](https://github.com/carlfei/spring-api-rest/assets/49040356/0fc5695d-9a02-47c5-88e4-777ee7a93284)
