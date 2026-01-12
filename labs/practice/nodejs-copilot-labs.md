# Node.js Copilot Labs

## Overview

Tasks to practice using Copilot with Node.js (Express or Fastify, TypeScript, testing, and serverless transforms).

---

## Lab 1 — Beginner: Express REST API

**Objective:** Build a TypeScript Express API for `Note` resource.

**Steps:**

- Scaffold project with TypeScript and Express.
- Create `Note` type (id, title, body, createdAt).
- Implement `GET /notes`, `POST /notes` and tests using Jest + supertest.

**Acceptance criteria:** Endpoints return correct JSON; tests pass.

**Example Copilot prompts:**

- "Create a TypeScript Express controller with `GET /notes` and `POST /notes` using an in-memory store and add Jest tests."

**Stretch:** Add input validation or a simple service layer.

---

## Lab 2 — Intermediate: Middleware, Validation & DB

**Objective:** Add request validation, middleware for logging, and a simple DB (SQLite or MongoDB).

**Steps:**

- Add validation with `zod` or `joi`.
- Implement logging middleware that logs method, path, response time.
- Replace in-memory store with persistence (Prisma + SQLite or Mongoose + MongoDB).
- Add integration tests.

**Acceptance criteria:** Validation enforced; DB persists notes; middleware logs present.

**Example Copilot prompts:**

- "Write a middleware that logs request method, path, and response time in ms."
- "Add Prisma schema for `Note` and data access functions."

---

## Lab 3 — Advanced: Serverless & Type Safety

**Objective:** Convert API to serverless function (e.g., AWS Lambda via serverless framework or Vercel) and ensure full TypeScript coverage.

**Steps:**

- Add serverless adapter and export handlers.
- Ensure types are strict and add `tsconfig` strict settings.
- Add end-to-end tests (playwright or supertest against deployed function locally).

**Acceptance criteria:** App runs as serverless function locally and types compile under `tsc --noEmit`.

**Example Copilot prompts:**

- "Convert my Express app into a serverless function for Vercel and show how to test it locally using `vercel dev`."

---

## Copilot prompt patterns & tips 💡

- Ask for `tsconfig` strict settings and how to fix common type errors.
- Ask Copilot for small focused commits and a one-line commit message for each change.
- Use prompts like: "Act as an experienced Node.js/TypeScript engineer and implement X with tests and a short explanation."
