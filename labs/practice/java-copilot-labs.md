# Java Copilot Labs ✅

## Overview
Hands-on tasks to practice using Copilot with Java (Spring Boot + testing). Each task includes step guidance and example prompts to try with Copilot.

---

## Lab 1 — Beginner: Create a simple REST API (45–60 min)
**Objective:** Build a Spring Boot app exposing a single resource `Product` with CRUD endpoints.

**Steps:**
- Generate a new Spring Boot project (or use Copilot to scaffold).
- Add a `Product` model (id, name, price, stock).
- Implement `ProductController` with endpoints: `GET /products`, `GET /products/{id}`, `POST /products`, `PUT /products/{id}`, `DELETE /products/{id}`.
- Add in-memory storage (Map) for the exercise.
- Write unit tests with JUnit 5 and MockMvc.

**Acceptance criteria:** API endpoints compile, unit tests cover controller behavior, JSON returned matches `Product` schema.

**Example Copilot prompts:**
- "Generate a Spring Boot controller `ProductController` with CRUD endpoints for a `Product` DTO (id, name, price, stock) and include basic request validation."
- "Write JUnit 5 tests using MockMvc for `GET /products` and `POST /products`."

**Stretch:** Add DTO mapping with MapStruct or add a simple service layer.

---

## Lab 2 — Intermediate: Repository & Service (60–90 min)
**Objective:** Replace in-memory store with a JPA repository (H2) and add service layer.

**Steps:**
- Add `spring-boot-starter-data-jpa` and H2.
- Create `ProductEntity`, `ProductRepository`, `ProductService`.
- Migrate controller to use service and repository.
- Add integration tests with `@SpringBootTest` and an H2 profile.

**Example Copilot prompts:**
- "Create a Spring Data JPA repository for `ProductEntity` and sample `ProductService` methods `findAll`, `save`, `findById`, `deleteById`."
- "Write an integration test that inserts a product and asserts `GET /products` returns it."

**Acceptance criteria:** Data is persisted in H2 during tests and integration tests pass.

---

## Lab 3 — Advanced: Refactor & Performance (90–120 min)
**Objective:** Use best practices: DTO mapping, exception handling, validation, and optional migration to WebFlux.

**Steps:**
- Implement `@ControllerAdvice` for global exception handling.
- Add DTOs and mappers.
- Add input validation (`@Valid`) and tests for invalid inputs.
- Optionally convert controllers to reactive endpoints with WebFlux.

**Example Copilot prompts:**
- "Refactor the `ProductController` to use DTOs and add a global exception handler that returns meaningful error payloads."
- "Provide a short summary of trade-offs between MVC and WebFlux for this API."

**Acceptance criteria:** Validation errors return structured JSON, exceptions are handled, tests verify error cases.

---

## Copilot prompt patterns & tips 💡
- Be explicit about framework versions and constraints (e.g., "Spring Boot 3.1, Java 17").
- Ask Copilot to generate tests and test data.
- Ask for refactors ("Refactor to use service layer + DTOs") and for commit messages ("Create a git commit message for adding Product CRUD").

