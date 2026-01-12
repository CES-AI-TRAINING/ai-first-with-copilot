# React Copilot Labs

## Overview

Hands-on tasks to practice using Copilot with React (frontend library for building user interfaces). Each task includes step guidance and example prompts to try with Copilot.

---

## Lab 1 — Beginner: Create a simple React app with components

**Objective:** Build a React app with basic components and state.

**Steps:**

- Set up a new React project with Create React App or Vite.
- Create components: Header, ProductList, ProductItem.
- Add state for a list of products.
- Style with CSS or styled-components.

**Acceptance criteria:** App runs locally, components render, state updates correctly.

**Example Copilot prompts:**

- "Scaffold a new React app with TypeScript using Create React App in the labs/practice folder."
- "Create a Product component that displays name, price, and stock."
- "Add state to manage a list of products and render them in a ProductList component."

**Stretch:** Add a search filter or sorting.

---

## Lab 2 — Intermediate: State management and hooks

**Objective:** Implement advanced state management with hooks and context.

**Steps:**

- Add useEffect for data fetching.
- Implement useContext for global state.
- Create custom hooks for product operations.
- Add forms for adding/editing products.

**Acceptance criteria:** Data is fetched on mount, global state works, forms update state.

**Example Copilot prompts:**

- "Create a custom hook useProducts for fetching and managing product data."
- "Implement React Context for sharing product state across components."
- "Add a form component with validation for creating new products."

**Stretch:** Integrate with Redux Toolkit.

---

## Lab 3 — Advanced: Routing and API integration

**Objective:** Add routing and real API integration.

**Steps:**

- Set up React Router for navigation.
- Create pages: Home, Products, ProductDetails.
- Integrate with a REST API (mock or real).
- Add error handling and loading states.

**Acceptance criteria:** Routing works, API calls succeed, error states are handled.

**Example Copilot prompts:**

- "Set up React Router with routes for Home, Products, and ProductDetails."
- "Create a service for API calls to fetch products from a REST endpoint."
- "Add loading spinners and error messages for API requests."

**Stretch:** Add authentication or deploy to Netlify.

---

## Copilot prompt patterns & tips 💡

- Specify React version and tools (e.g., "React 18 with TypeScript").
- Ask Copilot to generate functional components, hooks, and tests.
- Ask for refactors ("Refactor class components to functional with hooks") and for performance optimizations.