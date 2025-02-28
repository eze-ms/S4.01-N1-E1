# 🏗️ Exercici 1 - Spring Boot amb Maven

## 📄 Descripció - Enunciat de l'exercici
Aquest exercici introdueix al framework **Spring Boot** fent servir **Maven** com a gestor de dependències.  
L'objectiu és crear una API REST que respongui a diferents peticions HTTP.

---

## 💻 Tecnologies Utilitzades
- Java 23
- Spring Boot 3.4.3
- Maven
- Spring Web
- Spring Boot DevTools
- IntelliJ IDEA / Eclipse
- Postman (per a proves)

---

## 📋 Requisits
- Instal·lar **Java 23**
- Instal·lar **Maven** (`mvn -v` per a comprovar)
- IDE compatible (IntelliJ IDEA, Eclipse)
- Connexió a Internet per descarregar dependències

---

## 🛠️ Instal·lació
1. **Clonar el repositori:**
   ```sh
   git clone https://github.com/eze-ms/S4.01-N1-E1
   
2. **Compilar el projecte:**
    ```sh
   mvn compile
   
3. **Configuració del port:**
- Editar src/main/resources/application.properties
- Afegir:
    ```sh
  server.port=9000
---
## ▶️ Execució
**Executar l'aplicació amb Maven:**
```sh
mvn spring-boot:run
```

**Obrir el navegador o Postman i provar els endpoints:**
- http://localhost:9000/HelloWorld
- http://localhost:9000/HelloWorld2
- http://localhost:9000/HelloWorld?name=Ezequiel
- http://localhost:9000/HelloWorld2/Ezequiel

**Provar el Maneig d'Errors (CustomException)**
- http://localhost:9000/HelloWorld?name=error
- http://localhost:9000/HelloWorld2/error

## 🌐 Desplegament
1. **Empaquetar el projecte en .jar:**
    ```sh
   mvn package
   
2. **Executar el .jar manualment:**
    ```sh
   java -jar target/S04T01N01-0.0.1-SNAPSHOT.jar

---
© 2025. Proyecto desarrollado por Ezequiel Macchi Seoane
   


