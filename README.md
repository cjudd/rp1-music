# RP1 (Ready Player One) Music App

## Description

RP1 is a basic Java and Spring-Boot app used for workshops such as the 15 Factor Workshop.

## Requirements
- Java 8
- Docker

## Running

Run MySQL in a Docker container.
```
docker run --name rp1-music-db -e MYSQL_ROOT_PASSWORD=root+1 -e MYSQL_DATABASE=rp1 -e MYSQL_USER=rpi -e MYSQL_PASSWORD=rp1+1 -p 3306:3306 -d mysql:latest
```
 
To run, use:
```
./mvnw spring-boot:run
```

Open a browser and navigate to http://localhost:8080.
