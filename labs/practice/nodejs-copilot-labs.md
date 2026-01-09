# Node.js Copilot Labs ✅

## Overview

Tasks to practice using Copilot with Node.js (Express or Fastify, TypeScript, testing, and serverless transforms).

---

## Lab 1 — Beginner: Express REST API (30–45 min)

**Objective:** Build a TypeScript Express API for `Note` resource.

**Steps:**

- Scaffold project with TypeScript and Express.
- Create `Note` type (id, title, body, createdAt).
- Implement `GET /notes`, `POST /notes` and tests using Jest + supertest.

**Example Copilot prompts:**

- "Create a TypeScript Express controller with `GET /notes` and `POST /notes` using an in-memory store and add Jest tests."

**Acceptance criteria:** Endpoints return correct JSON; tests pass.

---

## Lab 2 — Intermediate: Middleware, Validation & DB (60–90 min)

**Objective:** Add request validation, middleware for logging, and a simple DB (SQLite or MongoDB).

**Steps:**

- Add validation with `zod` or `joi`.
- Implement logging middleware that logs method, path, response time.
- Replace in-memory store with persistence (Prisma + SQLite or Mongoose + MongoDB).
- Add integration tests.

**Example Copilot prompts:**

- "Write a middleware that logs request method, path, and response time in ms."
- "Add Prisma schema for `Note` and data access functions."

**Acceptance criteria:** Validation enforced; DB persists notes; middleware logs present.

---

## Lab 3 — Advanced: Serverless & Type Safety (90–120 min)

**Objective:** Convert API to serverless function (e.g., AWS Lambda via serverless framework or Vercel) and ensure full TypeScript coverage.

**Steps:**

- Add serverless adapter and export handlers.
- Ensure types are strict and add `tsconfig` strict settings.
- Add end-to-end tests (playwright or supertest against deployed function locally).

**Example Copilot prompts:**

- "Convert my Express app into a serverless function for Vercel and show how to test it locally using `vercel dev`."

**Acceptance criteria:** App runs as serverless function locally and types compile under `tsc --noEmit`.

---

## Copilot prompt patterns & tips 💡

- Ask for `tsconfig` strict settings and how to fix common type errors.
- Ask Copilot for small focused commits and a one-line commit message for each change.
- Use prompts like: "Act as an experienced Node.js/TypeScript engineer and implement X with tests and a short explanation."
