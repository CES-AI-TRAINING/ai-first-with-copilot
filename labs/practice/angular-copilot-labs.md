# Angular Copilot Labs

## Overview

Hands-on tasks to practice using Copilot with Angular (TypeScript-based framework for building web applications). Each task includes step guidance and example prompts to try with Copilot.

---

## Lab 1 — Beginner: Create a simple Angular app with components

**Objective:** Build an Angular app with basic components and routing.

**Steps:**

- Set up a new Angular project with Angular CLI.
- Create components: Header, ProductList, ProductItem.
- Add routing for Home, Products, About pages.
- Style with Angular Material or CSS.

**Acceptance criteria:** App runs locally, routing works, components render.

**Example Copilot prompts:**

- "Scaffold a new Angular app with routing and create a Product component that displays name, price, and stock."
- "Add Angular routing for Home, Products, and About pages with navigation."

**Stretch:** Add a footer or lazy loading.

---

## Lab 2 — Intermediate: Services and HTTP integration

**Objective:** Implement services for data management and HTTP calls.

**Steps:**

- Create a ProductService for CRUD operations.
- Integrate HttpClient for API calls (mock or real API).
- Add reactive forms for adding/editing products.
- Implement error handling and loading states.

**Acceptance criteria:** Data is fetched via HTTP, forms submit correctly, errors handled.

**Example Copilot prompts:**

- "Create an Angular service ProductService with methods for fetching products from an API."
- "Add a reactive form for creating new products with validation."

**Stretch:** Add authentication or pagination.

---

## Lab 3 — Advanced: State management and deployment

**Objective:** Add state management with NgRx and deploy the app.

**Steps:**

- Implement NgRx for global state management.
- Add unit tests with Jasmine/Karma.
- Configure deployment to Firebase or Netlify.
- Optimize with lazy loading and AOT compilation.

**Acceptance criteria:** State persists across components, tests pass, app deploys successfully.

**Example Copilot prompts:**

- "Set up NgRx store for managing product state in an Angular app."
- "Write unit tests for an Angular component using TestBed."

**Stretch:** Add PWA features or internationalization.

---

## Copilot prompt patterns & tips 💡

- Specify Angular version (e.g., "Angular 17 with standalone components").
- Ask Copilot to generate components, services, and guards.
- Ask for refactors ("Refactor to use standalone components") and for performance optimizations.
