# Player Stats Backend API (Spring Boot + PostgreSQL)

A Java Spring Boot REST API backed by PostgreSQL for storing and querying Premier League player statistics.  
Designed to be simple to integrate with a React frontend (search bars + filters) and to demonstrate clean backend structure (controller → service → repository).

---

## Why this project
- Built a real backend API with database integration and REST endpoints
- Demonstrates Spring Boot fundamentals: routing, service layer, persistence (JPA/Hibernate), and PostgreSQL connectivity
- Supports common product features: search, filtering, CRUD operations, and predictable JSON responses

---

## Tech Stack
- **Java**
- **Spring Boot** (REST API)
- **Spring Data JPA / Hibernate**
- **PostgreSQL**
- **Maven**

---

## Features
✅ List all players  
✅ Filter players by **name**, **team**, **position**, and **nation** (query parameters)  
✅ CRUD operations (create, update, delete)  
✅ Database-backed persistence via PostgreSQL

---

## API Endpoints

> Base path: `/api/v1/player`

### Get players (with optional filters)
- `GET /api/v1/player`
- Examples:
  - `GET /api/v1/player?name=haaland`
  - `GET /api/v1/player?team=Arsenal`
  - `GET /api/v1/player?position=FW`
  - `GET /api/v1/player?nation=ENG`
  - `GET /api/v1/player?team=Arsenal&position=MF`

### Search by name
- `GET /api/v1/player/search?name=<playerName>`

### Create a player
- `POST /api/v1/player`
- Body (example):
```json
{
  "name": "Sample Player",
  "nation": "ENG",
  "pos": "MF",
  "age": 23,
  "mp": 10,
  "starts": 9,
  "min": 810,
  "gls": 2,
  "ast": 3,
  "pk": 0,
  "crdy": 1,
  "crdr": 0,
  "xg": 1.7,
  "xag": 2.1,
  "team": "Arsenal"
}
