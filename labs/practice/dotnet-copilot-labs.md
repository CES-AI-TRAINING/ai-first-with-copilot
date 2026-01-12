# .NET (C#) Copilot Labs

## Overview

Tasks to practice using Copilot with .NET (ASP.NET Core, Entity Framework, testing, Docker).

---

## Lab 1 — Beginner: Simple Web API

**Objective:** Scaffold an ASP.NET Core Web API with a `Todo` resource.

**Steps:**

- Create new Web API project (`dotnet new webapi`).
- Create `Todo` model (Id, Title, IsComplete).
- Add a `TodosController` with `GET`, `POST`, `PUT`, `DELETE`.
- Use an in-memory collection to store todos.
- Add unit tests with xUnit.

**Acceptance criteria:** Endpoints work locally, unit tests pass.

**Example Copilot prompts:**

- "Write an ASP.NET Core controller `TodosController` with CRUD endpoints and model `Todo` (Id, Title, IsComplete)."
- "Create xUnit tests for `GET /todos` and `POST /todos`."

**Stretch:** Add DTO mapping or a simple service layer.

---

## Lab 2 — Intermediate: EF Core & Migrations

**Objective:** Replace in-memory store with EF Core and add migrations.

**Steps:**

- Add EF Core packages and SQLite provider.
- Create `TodoContext` and configure DI-scoped DbContext.
- Add migrations and use SQLite for dev and tests.
- Write integration tests using the SQLite in-memory mode.

**Acceptance criteria:** Migrations created, DB operations persist as expected in tests.

**Example Copilot prompts:**

- "Create an EF Core DbContext `TodoContext` with DbSet<Todo> and migration instructions."
- "Write an integration test that uses the SQLite in-memory provider to test `POST /todos`."

---

## Lab 3 — Advanced: Auth, Middleware & Docker

**Objective:** Add JWT authentication, custom middleware for logging, and Dockerfile for the app.

**Steps:**

- Add JWT-based auth to protect `POST`/`PUT`/`DELETE` endpoints.
- Implement middleware that logs requests and response times.
- Create a multi-stage Dockerfile and run the app in a container.
- Add CI workflow to run tests and build Docker image.

**Acceptance criteria:** Protected endpoints require auth; middleware logs to console or file; Docker image builds and runs.

**Example Copilot prompts:**

- "Add JWT authentication to an ASP.NET Core Web API using `Microsoft.AspNetCore.Authentication.JwtBearer`."
- "Create middleware that logs request path, method, status code, and execution time."

---

## Copilot prompt patterns & tips 💡

- Request both code and tests together ("Generate controller code and unit tests").
- Ask for Docker best practices and multi-stage Dockerfile examples.
- Ask Copilot to generate sample JWT tokens for local testing and to show how to validate them.
