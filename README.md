# 🏗️ Exercici 1 - Spring Boot amb Maven

## 📄 Descripció - Enunciat de l'exercici
Aquest exercici introdueix al framework **Spring Boot** fent servir **Maven** com a gestor de dependències.  
L'objectiu és crear una API REST que respongui a diferents peticions HTTP.

---

## 💻 Tecnologies Utilitzades
- Java 17+
- Spring Boot (versió estable)
- Maven
- Spring Web
- Spring Boot DevTools
- IntelliJ IDEA / Eclipse
- Postman (per a proves)

---

## 📋 Requisits
- Instal·lar **Java 11 o superior**
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
  
   
## ▶️ Execució
**Executar l'aplicació amb Maven:**
```sh
mvn spring-boot:run
```

**Obrir el navegador i provar els endpoints:**
- http://localhost:9000/HelloWorld
- http://localhost:9000/HelloWorld?nom=Joan
- http://localhost:9000/HelloWorld2
- http://localhost:9000/HelloWorld2/Maria

## 🌐 Desplegament
1. **Empaquetar el projecte en .jar:**
    ```sh
   mvn package
   
2. **Executar el .jar manualment:**
    ```sh
   java -jar target/S04T01N01-0.0.1-SNAPSHOT.jar

---
© 2025. Proyecto desarrollado por Ezequiel Macchi Seoane
   


