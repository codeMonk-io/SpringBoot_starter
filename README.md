# Journal App

A simple **Spring Boot + MongoDB** backend application for managing personal journal entries.
This project provides REST APIs to **create, read, update, and delete (CRUD)** journal entries.

---

## Features

* Create a journal entry
* Get all journal entries
* Get a journal entry by ID
* Update a journal entry
* Delete a journal entry
* MongoDB integration using Spring Data MongoDB
* Layered architecture using:

  * Controller
  * Service
  * Repository
  * Entity

---

## Tech Stack

* **Java**
* **Spring Boot**
* **Spring Web**
* **Spring Data MongoDB**
* **MongoDB**
* **Maven**

---

## Project Structure

```bash
src/
 └── main/
     └── java/
         └── net/engineeringdigest/journalApp/
             ├── controller/
             │    └── JournalEntryControllerV2.java
             ├── entity/
             │    └── JournalEntry.java
             ├── repository/
             │    └── JournalEntryRepository.java
             ├── service/
             │    └── JournalEntryService.java
             └── JournalApplication.java
```

---

## API Endpoints

### 1. Create Journal Entry

**POST** `/journal`

#### Request Body

```json
{
  "title": "My first journal",
  "content": "Today I learned Spring Boot."
}
```

#### Response

* `201 CREATED` / `200 OK`

---

### 2. Get All Journal Entries

**GET** `/journal`

#### Response

```json
[
  {
    "id": "66b123abc456def7890",
    "title": "My first journal",
    "content": "Today I learned Spring Boot."
  }
]
```

---

### 3. Get Journal Entry by ID

**GET** `/journal/id/{myId}`

#### Response

* `200 OK` → journal found
* `404 NOT_FOUND` → journal not found

---

### 4. Update Journal Entry

**PUT** `/journal/id/{myId}`

#### Request Body

```json
{
  "title": "Updated title",
  "content": "Updated content"
}
```

#### Response

* `200 OK` → updated successfully
* `404 NOT_FOUND` → journal not found

---

### 5. Delete Journal Entry

**DELETE** `/journal/id/{myId}`

#### Response

* `200 OK` / `204 NO_CONTENT` → deleted successfully
* `404 NOT_FOUND` → journal not found

---

## Journal Entry Model

Example `JournalEntry` document:

```json
{
  "id": "66b123abc456def7890",
  "title": "My first journal",
  "content": "Today I learned Spring Boot."
}
```

---

## Setup Instructions

### 1. Clone the repository

```bash
git clone https://github.com/chotabheeeeem/journalApp.git
cd journalApp
```

### 2. Configure MongoDB

Make sure MongoDB is running locally or update your connection string in `application.properties`.

Example:

```properties
spring.data.mongodb.uri=mongodb://localhost:27017/journaldb
spring.data.mongodb.database=journaldb
```

---

### 3. Build and run the application

Using Maven:

```bash
mvn clean install
mvn spring-boot:run
```

Or run the main application class directly from your IDE.

---

## Sample `application.properties`

```properties
spring.application.name=journalApp
spring.data.mongodb.uri=mongodb://localhost:27017/journaldb
spring.data.mongodb.database=journaldb
server.port=8080
```

---

## Learning Goals of This Project

This project helped in understanding:

* Spring Boot project structure
* REST API development
* CRUD operations
* MongoDB integration with Spring Boot
* Layered architecture in backend development
* Handling `Optional<T>` and HTTP response statuses using `ResponseEntity`

---

## Future Improvements

* Add validation for request bodies
* Add exception handling with `@ControllerAdvice`
* Add Swagger/OpenAPI documentation
* Add authentication and authorization with Spring Security + JWT
* Add user-specific journal entries
* Add unit and integration tests

---

## Author

**Shubham**

---

## License

This project is for learning and practice purposes.
