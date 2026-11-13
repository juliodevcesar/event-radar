# Event Radar

Event Radar is a backend project built with Java and Spring Boot. The idea is to create a platform where users can find events happening in different locations, check event details, and eventually explore them through a map.

I'm starting with the REST API and PostgreSQL database before moving on to search filters, geolocation, and other features.


## 🛠️ Tech Stack

![Java](https://img.shields.io/badge/Java-21-ED8B00?logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-4.1.1-6DB33F?logo=springboot&logoColor=white)
![Spring Data JPA](https://img.shields.io/badge/Spring_Data-JPA-6DB33F?logo=spring&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-16-4169E1?logo=postgresql&logoColor=white)
![Maven](https://img.shields.io/badge/Apache_Maven-C71A36?logo=apachemaven&logoColor=white)
![Docker](https://img.shields.io/badge/Docker-2496ED?logo=docker&logoColor=white)


## Current Features

The API currently supports:

- Creating events
- Listing all events
- Finding an event by ID
- Returning HTTP 404 when an event doesn't exist

Event data is stored in PostgreSQL using Spring Data JPA.

## Endpoints

| Method | Route | Description |
|---|---|---|
| GET | `/eventos` | List all events |
| GET | `/eventos/{id}` | Find an event by ID |
| POST | `/eventos` | Create an event |

Example request body for `POST /eventos`:

```json
{
  "title": "Festival de Rock Brasília",
  "description": "Festival com bandas nacionais",
  "location": "Brasília - DF",
  "date": "2026-12-15T20:00:00"
}
```

## Running the Project

The backend requires Java 21 and a running PostgreSQL database.

For local development, I use PostgreSQL 16 through Docker, with the database `eventradar_db` exposed on port `5434`.

The database credentials are configured through the environment variables `DB_USERNAME` and `DB_PASSWORD`.

From the `backend` directory, run:

```powershell
.\mvnw.cmd spring-boot:run
```

The application starts on port `8080`.

## Next Steps

Some of the features I plan to work on:

- Updating and deleting events
- Validating event data
- Filtering events by date and location
- Adding event categories
- Writing automated tests
- Documenting the API
- Supporting coordinates and map-based event discovery

## About

I'm developing Event Radar to practice backend development with Java and Spring Boot while building a project that I can continue expanding.

GitHub: https://github.com/juliodevcesar
