# Python Copilot Labs

## Overview

Practice labs using Python frameworks (FastAPI, SQLAlchemy, pytest) to practice Copilot for server-side development.

---

## Lab 1 — Beginner: FastAPI Hello & CRUD

**Objective:** Create a FastAPI app exposing `User` endpoints.

**Steps:**

- Scaffold a minimal FastAPI app with `uvicorn` entrypoint.
- Create `User` schema (id, name, email) and CRUD endpoints.
- Use a simple in-memory store (list/dict).
- Add tests using `pytest` and `httpx` (test client).

**Acceptance criteria:** API endpoints pass tests and return JSON matching schema.

**Example Copilot prompts:**

- "Create a FastAPI app with a `User` model and CRUD endpoints, plus `pytest` tests for each endpoint."
- "Show an example `pytest` that uses FastAPI `TestClient` to create and fetch a user."

**Stretch:** Add Pydantic validation or a simple service layer.

---

## Lab 2 — Intermediate: Persistence & Auth

**Objective:** Add persistence with SQLAlchemy + Alembic and basic token auth.

**Steps:**

- Add SQLAlchemy models and async session or synchronous for simplicity.
- Add Alembic migrations.
- Implement token-based auth (simple JWT for demo) and protect POST/PUT/DELETE.
- Add tests that use a temporary SQLite database.

**Acceptance criteria:** Migrations work, and protected endpoints require token.

**Example Copilot prompts:**

- "Add SQLAlchemy models and a repository layer for `User`. Include an example Alembic migration."
- "Write a fixture to create an in-memory SQLite DB for pytest and seed it with a user."

---

## Lab 3 — Advanced: CI, Docker, and Observability

**Objective:** Add test CI, Dockerfile, and basic logging/metrics.

**Steps:**

- Add GitHub Actions that run `pytest` and linting on PRs.
- Create a Dockerfile and docker-compose for running the app + DB.
- Add structured logging and a simple /metrics endpoint (Prometheus-friendly).

**Acceptance criteria:** CI runs tests on push/PR; Docker image builds; metrics endpoint present and testable.

**Example Copilot prompts:**

- "Create a GitHub Actions workflow to run pytest, flake8, and build a Docker image."
- "Add a `/metrics` endpoint that returns basic request counts."

---

## Copilot prompt patterns & tips 💡

- Ask for code + tests in one prompt.
- Specify package versions or runtime (Python 3.11, FastAPI 0.95).
- Ask Copilot to keep changes small and ask for explanation of each change.
